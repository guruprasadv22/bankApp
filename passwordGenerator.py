#import libraries
import random
import string

#Parameters to be considered: length, digits, strength of password
def password(length, num = False, strength = 'weak'):
    lower = string.ascii_lowercase
    upper = string.ascii_uppercase
    dig = string.digits
    all_letter = lower + upper
    punc = string.punctuation
    pwd = ''

    if strength == 'weak':
        if num:
            length -= 2
            for i in range(2):
                pwd += random.choice(dig)
        for i in range(length):
            pwd += random.choice(lower)

    elif strength == 'moderate':
        if num:
            length -= 2
            for i in range(2):
                pwd += random.choice(dig)
        for i in range(length):
            pwd += random.choice(all_letter)

    elif strength == 'strong':
        if num:
            ran = random.randint(2,5)
            length -= ran
            for i in range(ran):
                pwd += random.choice(dig)
        ran = random.randint(2,4)
        length -= ran
        for i in range(ran):
            pwd += random.choice(punc)
        for i in range(length):
            pwd += random.choice(all_letter)

    pwd = list(pwd)
    random.shuffle(pwd)
    print("".join(pwd))

#Function call
password(10, True, 'strong')
