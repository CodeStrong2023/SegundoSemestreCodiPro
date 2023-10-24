class Persona:  # Creamos una clase
    def __init__(self, nombre, apelliddo, edad):  # Se lo llama metodo Init Dunder
        self.nombre = nombre
        self.apelliddo = apelliddo
        self.edad = edad

    def mostrar_detalle(self):
        print(f'Persona: {self.nombre} {self.apelliddo} {self.edad}')


persona1 = Persona('Siro', 'Torres', 19)  # Necesitamos enviar argumentos
print(persona1.nombre)
print(persona1.apelliddo)
print(persona1.edad)

persona2 = Persona("Osvaldo", 'Girodanini', 45)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apelliddo} Su edad es: {persona2.edad}')
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apelliddo} Su edad es: {persona1.edad}')

persona1.nombre = 'Liliana'
persona1.apelliddo = 'Buccella'
persona1.edad = 40
print(f'El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apelliddo} Su edad es: {persona1.edad}')

# Los atributos son: caracteristicas
# Los metodos son: El comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle()
persona2.mostrar_detalle()
