class Persona:  # Crea una clase
    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

 #La variable self solo se encuentra dentro de los métodos
    def mostar_detalle(self):
        print(f'Persona: {self.nombre}, {self.apellido}, {self.edad}')

persona1 = Persona("Emilia", "Bazán", 33)  # necesitamos enviar argumentos
print(
    f"El objeto1 de la clase Persona es: {persona1.nombre} {persona1.apellido} {persona1.edad}")

persona2 = Persona("Ariel", "Betancud", 40)
print(
    f"El objeto2 de la clase Persona es: {persona2.nombre} {persona2.apellido} {persona2.edad}")

persona1.nombre = "Paula"
persona1.edad = "30"

print(f"El objeto1 de la clase Persona se modifico por: {persona1.nombre} {persona1.apellido} {persona1.edad}")

#Los atributos son las caracteríasticas
#Los métodos son el comportamiento que van a tener los objetos. 
#La diferencia entre un metodo y una función es que el método está asociado a una clase

persona1.mostar_detalle()
persona2.mostar_detalle()