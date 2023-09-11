""" 6. Crie uma classe chamada “Produto” com atributos “nome”, “preco” e “quantidade”. Implemente um
método chamado “calcular_total” que retorna o valor total do produto (preço * quantidade). """

class Produto:
    def __init__(self, nome, preco, quantidade):
        self.nome = nome
        self.preco = preco
        self.quantidade = quantidade

    def calcular_total(self):
        return self.preco * self.quantidade
    
p1 = Produto("TV", 1500, 3)
print(p1.calcular_total())
