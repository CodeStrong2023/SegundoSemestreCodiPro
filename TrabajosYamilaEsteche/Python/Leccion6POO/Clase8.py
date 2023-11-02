class Persona:
    def __init__(self, nombre, apellido,edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalle(self):
        print(f'Persona: {self.nombre} {self.apellido} {self.edad}')


print(type(Persona))

persona1 = Persona("yamila", "esteche", 29)  # instanciamos objeto
print(type(persona1))  # tipo de dato va a ser del tipo persona1
print(persona1.nombre)  # acceder a un atributo
print(persona1.apellido)
print(persona1.edad)

persona2 = Persona("alan", "sanabria", 30)
print(f'Nombre: {persona2.nombre}, Apellido: {persona2.apellido}, Edad: {persona2.edad}')

persona1.edad = 23  # modificar un atributo
print(persona1.edad)

# metodos, son funciones dentro de una clase
persona1.mostrar_detalle()
persona2.mostrar_detalle()


#
