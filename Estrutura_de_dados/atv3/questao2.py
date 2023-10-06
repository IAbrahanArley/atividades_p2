""" Escreva uma função que calcula o fatorial de um número inteiro positivo fornecido pelo usuário. """

def calcular_fatorial(n):
    if n < 0:
        return "O fatorial não está definido para números negativos."
    elif n == 0:
        return 1
    else:
        fatorial = 1
        for i in range(1, n + 1):
            fatorial *= i
        return fatorial

numero = int(input("Digite um número inteiro positivo: "))

resultado = calcular_fatorial(numero)
print(f"O fatorial de {numero} é {resultado}.")
