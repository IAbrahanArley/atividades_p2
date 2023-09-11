""" 6. Escreva um programa que peça um número inteiro positivo ao usuário e calcule o fatorial desse
número. """
count = 1
res = 1
num = int(input("Digite um número: "))
if num > 0:
    while count <= num:
        res *= count
        count += 1
print(f"Resutaldo de {num}! = {res}") 