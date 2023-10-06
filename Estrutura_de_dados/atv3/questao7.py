""" Crie uma função que calcula o índice de massa corporal (IMC) de uma pessoa com base em sua altura
e peso. """

def calcular_imc(peso, altura):
    if peso <= 0 or altura <= 0:
        return "Valores inválidos. Peso e altura devem ser maiores que zero."
    
    imc = peso / (altura ** 2)
    
    return imc

peso = float(input("Digite o peso (em quilogramas): "))
altura = float(input("Digite a altura (em metros): "))

resultado = calcular_imc(peso, altura)

if isinstance(resultado, float):
    print(f"O IMC é: {resultado:.2f}")
else:
    print(resultado)
