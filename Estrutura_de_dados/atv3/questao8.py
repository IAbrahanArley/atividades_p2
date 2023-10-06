""" Escreva um programa que converte uma temperatura em Celsius para Fahrenheit ou vice-versa,
dependendo da escolha do usuário. """

print("Escolha a opção de conversão:")
print("1. Celsius para Fahrenheit")
print("2. Fahrenheit para Celsius")

opcao = int(input("Digite o número da opção desejada (1 ou 2): "))

def celsius_para_fahrenheit(celsius):
    return (celsius * 9/5) + 32

def fahrenheit_para_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9

if opcao == 1:
    celsius = float(input("Digite a temperatura em graus Celsius: "))
    fahrenheit = celsius_para_fahrenheit(celsius)
    print(f"A temperatura em Fahrenheit é: {fahrenheit:.2f} °F")
elif opcao == 2:
    fahrenheit = float(input("Digite a temperatura em graus Fahrenheit: "))
    celsius = fahrenheit_para_celsius(fahrenheit)
    print(f"A temperatura em Celsius é: {celsius:.2f} °C")
else:
    print("Opção inválida. Por favor, escolha 1 ou 2 para a conversão.")
