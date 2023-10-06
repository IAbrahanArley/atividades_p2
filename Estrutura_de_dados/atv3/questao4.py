""" Escreva um programa que recebe um número inteiro positivo e calcula a soma de seus dígitos. """

numero = int(input("Digite um número inteiro positivo: "))

if numero < 0:
    print("Por favor, insira um número inteiro positivo.")
else:
    soma = 0
    
    while numero > 0:
        digito = numero % 10
        
        soma += digito
        
        numero //= 10
    
    print(f"A soma dos dígitos é: {soma}")
