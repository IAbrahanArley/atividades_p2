""" 1. Crie uma classe chamada “Circulo” que tenha um atributo “raio”. Implemente um método chamado
“calcular_area” que retorna a área do círculo. """

class Circulo:

    def __init__(self, raio):
        self.raio = raio
        self.PI = 3.1416
        self.area= 0.0

    def calcular_area(self):
        self.area = (self.raio ** 2) * self.PI
        return self.area
    
c1 = Circulo(10)
print(f".%2f", c1.calcular_area())



        