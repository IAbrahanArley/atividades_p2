""" Escreva um programa que recebe uma string e conta a quantidade de vogais (a, e, i, o, u) presentes
nela. """

texto = input("Digite uma string: ")

texto = texto.lower()

contagem_vogais = 0

for caractere in texto:
    if caractere in "aeiou":
        contagem_vogais += 1

print(f"A quantidade de vogais na string é: {contagem_vogais}")
