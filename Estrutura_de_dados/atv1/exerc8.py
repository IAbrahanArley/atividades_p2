""" 8. Faça um programa que determine se um número é primo ou não. """

def is_prime(number):
    if number <= 1:
        return False  

    for i in range(2, int(number ** 0.5) + 1):
        if number % i == 0:
            return False  

    return True

num = 12

if is_prime(num):
    print(f"{num} é um número primo.")
else:
    print(f"{num} não é um número primo.")




