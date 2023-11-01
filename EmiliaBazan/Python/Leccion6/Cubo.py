class Cubo:

    #Crear una clase llamada cubo con dos atributos base, altura y ptofuncidad.
    # El método de la clase será calcular el volumen. Los datos deben ser ingresadas por el usuario 

    def __init__(self, base, altura, profundidad):
        self.base = base
        self.altura= altura
        self.profundidad = profundidad

    def volumen(self):
        return self.base * self.altura * self.profundidad

base = int(input("Ingrese la medida de la base: "))
altura = int(input("Ingrese la medida de la altura: "))
profundidad = int(input("Ingrese la medida de la profundidad: "))

cubo1 = Cubo(base, altura, profundidad)

print(f'El volumen del cubo es: {cubo1.volumen()}')

        