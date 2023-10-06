def sequencia_fibonacci(num_termos):
    fibonacci = [0, 1]  
    while len(fibonacci) < num_termos:
        proximo_termo = fibonacci[-1] + fibonacci[-2]
        fibonacci.append(proximo_termo)
    return fibonacci

num_termos = int(input("Digite o número de termos da sequência de Fibonacci desejado: "))

resultado = sequencia_fibonacci(num_termos)

print(f"Sequência de Fibonacci com {num_termos} termos: {resultado}")
