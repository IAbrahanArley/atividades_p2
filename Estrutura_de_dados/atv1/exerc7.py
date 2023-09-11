""" 7. Crie um programa que imprima a sequência de Fibonacci até um valor inserido pelo usuário. """
fibo = [0, 1]

valor = int(input("Insira um valor: "))

while fibo[-1] < valor:
    prox_num = fibo[-1] + fibo[-2]
    fibo.append(prox_num)
print(fibo)

