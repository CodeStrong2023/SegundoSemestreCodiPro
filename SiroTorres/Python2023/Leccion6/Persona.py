class Persona:  # Creamos una clase
    def __init__(self, nombre, apelliddo,dni, edad, *args, **kwargs):  # Se lo llama metodo Init Dunder
        self.nombre = nombre
        self.apelliddo = apelliddo
        self._dni = dni #Este atributo esta encapsulado de una manera seguridad
        self.edad = edad
        self.args = args
        self.kwargs = kwargs


    def mostrar_detalle(self):
        print(f'La Clase Persona tiene los siguientes datos: {self.nombre} {self.apelliddo}{self._dni} {self.edad}, la direccion es: {self.args}, los datos importantes son: {self.kwargs}')


persona1 = Persona('Siro', 'Torres',45719029, 19)  # Necesitamos enviar argumentos
print(persona1.nombre)
print(persona1.apelliddo)
print(persona1.edad)

persona2 = Persona("Osvaldo", 'Girodanini',30459231, 45)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apelliddo} Su edad es: {persona2.edad}')
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apelliddo} Su edad es: {persona1.edad}')

persona1.nombre = 'Liliana'
persona1.apelliddo = 'Buccella'
persona1.edad = 40
print(f'El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apelliddo} Su edad es: {persona1.edad}')

# Los atributos son: caracteristicas
# Los metodos son: El comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle()
persona2.mostrar_detalle() #La referencia en este caso se pasa de manera automatica

#Persona.mostrar_detalle(persona1) #Es necesario poner una referencia para el self () o dara error
persona1.telefono = '12324435'
print(f'Este es el telefono de:{persona1.nombre} {persona1.telefono}') #Hemos creado un atributo de un objeto
#print(persona2.telefono) El objeto persona2 no tiene este atributo, da error
persona3 = Persona('Rogelio', 'Romero ', 34567923, 22, 'Telefono', '2614445557', 'Calle Lopez', 823, 'Manzana', 77, 'Casa', 18, Altura = 1.83, Peso = 105, CFavorito = 'Azul', Auto = 'Citroen')
persona3.mostrar_detalle()
persona4 = Persona('Jose', 'Petro ',30945123 ,20 , 'Telefono', '2614644457', 'Calle Alsina', 834, 'Manzana', 13, 'Casa', 32, Altura = 1.74, Peso = 89, CFavorito = 'Rojo', Auto = 'Fiat')
persona4.mostrar_detalle()
print(persona3._dni)
#Otra forma de encapsular de forma total es con __ doble guion bajo

