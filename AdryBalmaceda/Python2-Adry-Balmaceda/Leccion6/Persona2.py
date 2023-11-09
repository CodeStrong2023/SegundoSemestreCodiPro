# Encapsulamiento
# Metodos Set y Get
# Get: para obtener atributos de una clase
# Set: para modificar atributos de una clase
#from Persona import Persona  # en caso de importar tipos y funciones de otra clase
# Comentar multiples lineas: ctrl+diagonal


class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre  # encapsular con guion bajo_
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    # Crear metodo para acceder a los atributos
    # Para acceder al metodo de manera indirecta necesitamos un decorador @property
    @property
    def nombre(self):  # Metodo Getter: para crearlo se necesita @property
        print('\nEstamos utilizando el Metodo get')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # Metodo Setter
        print('Estamos utilizando el Metodo set')
        self._nombre = nombre

    # Tarea: agregar set y get al resto
    # apellido
    @property
    def apellido(self):
        return self._apellido
    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido
    # edad
    @property
    def edad(self):
        return self._edad
    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}')

if __name__=='__main__':  # comprobacion metodo principal en ejecucion
    # Para probarlo
    # Persona 1
    persona1 = Persona2('Felip', 'Castell', 48)
    print(persona1.nombre)
    print(persona1.apellido)
    print(persona1.edad)
    persona1.nombre = 'Felipe'
    persona1.apellido = 'Castillo'
    persona1.edad = 49
    print(persona1.mostrar_detalles())



    # Persona 2
    persona2 = Persona2('Silvina', 'Peres', 37)
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = 'Silvia'
    persona2.apellido = 'Perez'
    persona2.edad = 36
    print(persona2.mostrar_detalles())



    # Persona 3
    persona3 = Persona2('Rodrigo', 'Tiss', 30)
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.nombre = 'Rodolfo'
    persona3.apellido = 'Tisser'
    persona3.edad = 31
    print(persona3.mostrar_detalles())



    # Persona 4
    persona4 = Persona2('Marco', 'Hoyo', 55)
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.nombre = 'Marcos'
    persona4.apellido = 'Hoyos'
    persona4.edad = 56
    print(persona4.mostrar_detalles())

    print(__name__)  # nos indica donde estamos

# APUNTE:
# Atributo read-only sería la edad porque no tiene el metodo set
#print(persona1.edad)
# puede haber un atributo que no tenga su metodo set, read-only significa solo lectura

#Tests
# print(persona1._nombre)  # asi estaria mal, no se puede hacer en python
#print(persona1.nombre)  # llamamos al metodo getter, el decorador permite acceder de manera indirecta sin ()
#print(persona1.apellido)
##print(persona1.edad)
#persona1.nombre = 'Juan Felipe'  # llamamos al metodo setter
#persona1.apellido = 'Castillo Montes'
#print(persona1.mostrar_detalles())  # llamamos al metodo mostrar detalles


