
#    pass  # no se procesa nada mas (no tiene contenido)
'''
    def __init__(self):  # se lo llama metodo Init Dunder
        self.nombre = 'Juan'
        self.apellido = 'Zalazar'
        self.edad = 22
 '''
class Persona:  # creamos un clase

   def __init__(self, nombre, apellido, edad):  # se lo llama metodo Init Dunder
      self.nombre = nombre
      self.apellido = apellido
      self.edad = edad

   def mostrar_detalle(self):
      print(f'Persona: {self.nombre} {self.apellido} {self.edad}')

# print(type(Persona))
persona1 = Persona('Arturo', 'Baldo', 70)  # necesitamos enviar argumentos

print(persona1.nombre)  # tarea: hacer el print igual que con el objeto2
print(persona1.apellido)
print(persona1.edad)
print(f'\nEl objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

persona2 = Persona('Joan', 'Casal', 35)
print(f'\nEl objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')

persona1.nombre = 'Fabiana'
persona1.apellido = 'Rivas'
persona1.edad = 55
print(f'\nEl objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

# Los atributos son: caracteristicas
# Los metodos son: el comportamiento que van a tener los objetos
# (acciones)
persona1.mostrar_detalle()
persona2.mostrar_detalle()
