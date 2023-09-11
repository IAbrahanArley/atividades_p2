""" 4. Crie um programa que leia uma lista de números e exiba o maior e o menor valor da lista """
import random

listnum = []
""" Criando uma lista aleatoria """
for x in range(10):
    num = random.randint(1, 50)
    listnum.append(num)
print(f"Numeros da lista: {listnum}")
""" Exibindo maior e menor numero da lista com funcoes """ 
print("Maior numero: ", max(listnum))
print("Menor numero: ", min(listnum))   