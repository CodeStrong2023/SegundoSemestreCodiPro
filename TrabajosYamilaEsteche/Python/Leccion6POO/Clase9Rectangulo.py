class Rectangulo:
    """
    Crear una clase llamada Rectángulo que debe tener dos atributos: altura y base.
    El nombre del método será calcular el área utilizando la fórmula: "area = base * altura".
    Pero la base y la altura deben ser ingresadas por el usuario y los objetos deben ser de tres.
    """
    def __init__(self, Base, Altura):
        self.Base = Base
        self.Altura = Altura

    def CalculoArea(self):
        return self.Base * self.Altura


Base = int(input("Ingrese la base del rectángulo: "))
Altura = int(input("Ingrese la altura del rectángulo: "))
Rectangulo1 = Rectangulo(Base, Altura)

print(f"El área del rectángulo es: {Rectangulo1.CalculoArea()}")