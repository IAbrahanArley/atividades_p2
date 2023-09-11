""" 4. Crie uma classe chamada “ContaBancaria” que tenha atributos “saldo” e “titular”. Implemente
métodos “depositar” e “sacar” para manipular o saldo. """

class ContaBancaria:
    def __init__(self, saldo, titular):
        self.saldo = saldo
        self.titular = titular
    
    def depositar(self, deposito):
        self.saldo += deposito
        return f"Deposito realizado com sucesso. Saldo atual:{self.saldo}"  
    def sacar(self, saque):
        if saque > self.saldo:
            return "Não foi possivel realizar o saque. Saldo insuficiente."
        else:
            self.saldo -= saque
            return f"Saque realizado com sucesso. Saldo atual:{self.saldo}" 
        
p1 = ContaBancaria(0, 'Abe')
p1.depositar(90)
p1.sacar(100)

        