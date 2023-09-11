""" 5. Crie uma classe chamada “Pessoa” com atributos “nome” e “idade”. Implemente um método
chamado “falar” que imprime uma mensagem com o nome da pessoa.
 """

class Pessoa:
    def __init__(self, nome, idade):
      self.nome = nome
      self.idade = idade

    def falar(self):
      return f"Olá meu nome é {self.nome} e tenho {self.idade} anos"

p1 = Pessoa('Abe', 27)
p1.falar()
      