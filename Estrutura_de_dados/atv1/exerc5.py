""" 5. Faça um programa que leia uma lista de números e retorne a média dos números pares. """
import random

listnum = []
par = []
media = 0
""" Criando uma lista aleatoria """
for x in range(10):
    num = random.randint(1, 50)
    listnum.append(num)
print(listnum)
""" Separando numeros pares em uma segunda lista """
for x in range(len(listnum)):
    if listnum[x] % 2 == 0:
        par.append(listnum[x])
        """ media de numeros somando numeros da lista par pelo tamanho da propria """
        media = sum(par) / len(par)
""" media calculada e exibida """       
print(media)