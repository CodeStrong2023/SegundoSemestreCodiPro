#    pass  # no se procesa nada mas (no tiene contenido)
'''
    def __init__(self):  # se lo llama metodo Init Dunder
        self.nombre = 'Juan'
        self.apellido = 'Zalazar'
        self.edad = 22
 '''
class Persona:  # creamos un clase
   def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):  # se lo llama metodo Init Dunder
      self.nombre = nombre
      self.apellido = apellido
      self._dni = dni  # este atributo esta encapsulado de una manera sugerida
      self.edad = edad
      self.args = args
      self.kwargs = kwargs
   def mostrar_detalle(self):  # self es igual a this
      print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self._dni} {self.apellido} {self.edad}, la direccion es: {self.args}, los datos importantes son: {self.kwargs}')


# print(type(Persona))
persona1 = Persona('Arturo', 'Baldo',32466789, 70)  # necesitamos enviar argumentos

# print(persona1.nombre)  # tarea: hacer el print igual que con el objeto2
# print(persona1.apellido)
# print(persona1.edad)
print(f'\nEl objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')
persona2 = Persona('Joan', 'Casal',28866321, 35)
print(f'\nEl objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')

persona1.nombre = 'Fabiana'
persona1.apellido = 'Rivas'
persona1.edad = 55
print(f'\nEl objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

# Los atributos son: caracteristicas
# Los metodos son: el comportamiento que van a tener los objetos
# (acciones)
persona1.mostrar_detalle()  # la referencia en este caso se pasa de manera automatica
persona2.mostrar_detalle()

# Persona.mostrar_detalle(persona1)  # vacio da error, debemos pasarle una referencia para el self o dara error
persona1.telefono = '261904569'
print(f'\nEste es el telefono de: {persona1.nombre} {persona1.telefono}')  # hemos creado una atributo de un objeto

# print(persona2.telefono)  # el objeto persona2 no tiene este atributo, da error
persona3 = Persona('Rogelio', 'Romero',25333900, 22, 'Telefono', '261444555', 'Calle Lopez', 823, 'Manzana', 77, 'Casa', 18, Altura =1.83, Peso=105, CFavorito='Azul', Auto='Citroen', Modelo=2021)
persona3.mostrar_detalle()
# print(persona3._dni)  # esto no se debe utilizar (esta encapsulado) esto dice que lo desconocemos
# persona3.__nombre  # esta totalmente encapsulado



