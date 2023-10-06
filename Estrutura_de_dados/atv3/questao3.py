""" Crie uma função que verifica se uma palavra ou frase é um palíndromo (lê-se igual de trás para frente,
desconsiderando espaços e pontuação). """

import string

def e_palindromo(texto):
    texto = texto.translate(str.maketrans('', '', string.whitespace + string.punctuation)).lower()
    
    return texto == texto[::-1]

entrada = input("Digite uma palavra ou frase para verificar se é um palíndromo: ")

if e_palindromo(entrada):
    print(f"'{entrada}' é um palíndromo!")
else:
    print(f"'{entrada}' não é um palíndromo.")
