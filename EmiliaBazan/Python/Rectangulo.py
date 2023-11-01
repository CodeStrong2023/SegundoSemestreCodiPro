class Rectangulo:

    # """    Crear una clase llamada rectángulo con dos atributos base y altura.
    # El método de la clase será calcular el perímetro y el área. La base y la altura deben ser ingresadas por el usuario    """

    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def perimetro(self):
        return 2*(self.base + self.altura)

    def area(self):
        return self.base*self.altura


base = int(input("Ingrese la medida de la base: "))
altura = int(input("Ingrese la medida de la altura: "))

rectangulo1 = Rectangulo(base, altura)

print("El perímetro del rectángulo es:", rectangulo1.perimetro())
print("El área del rectángulo es:", rectangulo1.area())
