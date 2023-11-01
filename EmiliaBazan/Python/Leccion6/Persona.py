class Persona:  # Crea una clase
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

 # La variable self solo se encuentra dentro de los métodos es igual a this
    def mostar_detalle(self):  # crear un método
        print(
            f'Persona: {self.nombre}, {self.apellido}, {self.edad}, la dirección es {self.args}, los datos importantes son: {self.kwargs}')


# necesitamos enviar argumentos
persona1 = Persona("Emilia", "Bazán", 36313614, 33)
print(
    f"El objeto1 de la clase Persona es: {persona1.nombre} {persona1.apellido} {persona1.edad}")

persona2 = Persona("Ariel", "Betancud", 31234879, 40)
print(
    f"El objeto2 de la clase Persona es: {persona2.nombre} {persona2.apellido} {persona2.edad}")

persona3 = Persona("Carlos", "Trejo", 34726738, 45,  'Telefono', '226358238', 'Calle Acha',
                   323, 'Manzana', 7, 'Casa 42', Altura=1.78, Peso=90, CFavorito='Negro', auto='Chevrolet', Modelo=2011)

persona1.nombre = "Paula"
persona1.edad = "30"

print(
    f"El objeto1 de la clase Persona se modifico por: {persona1.nombre} {persona1.apellido} {persona1.edad}")

# Los atributos son las caracteríasticas
# Los métodos son el comportamiento que van a tener los objetos.
# La diferencia entre un metodo y una función es que el método está asociado a una clase, se accede a los métodos con un punto

persona1.mostar_detalle()
persona2.mostar_detalle()

# Persona.mostar_detalle(persona1)

# Agregar atributos a un objeto:

persona1.telefono = 1234341

print(persona1.telefono)

persona3.mostar_detalle()

# print("dni", persona3._dni)  Esto no debe ser utilizado (esta encapsulado), indica que desconocemos python

# print(persona3.__nombre) queda totalmente encapsulado
