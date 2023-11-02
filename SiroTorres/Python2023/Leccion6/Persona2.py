class Persona2:
    _edad: object

    def __init__(self, nombre, apellido, edad):  # Esta encapsulado
        self._nombre = nombre
        self._apelliddo = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apelliddo} {self._edad}')

    @property  # Decorador
    def nombre(self):  # Metodo getter
        print('Estamos utilizando el metodo get')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # Metodo setter
        print('Estamos utilizando el metodo set')
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apelliddo

    @apellido.setter
    def apellido(self, apellido):
        self._apelliddo = apellido

    @property
    def edad(self):
        return self._edad
    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apelliddo} {self._edad}')


if __name__ == '__main__':
    persona1 = Persona2('Ariel', 'Betancud', 41)
    print(persona1.nombre)  # Llamamos al metodo getter

    print(persona1._apelliddo)

    print(persona1._edad)

    persona1.nombre = 'Juan Pedro'  # Llamamos al metodo setter
    print(persona1.nombre)  # Otra vez con el metodo getter
    print(persona1.mostrar_detalles())  # Llamamos el motodo mostrar detalles
    # Atributo read-only seria la edad porque no tiene el metodo set
    print(persona1.edad)
    # Tarea crear tres objetos mas, utilizando los metodos getter and setter
    # para modificar, y mostrar los cambios con el metodo mostrar detalles

    # Objeto numero 1 de la tarea
    persona2 = Persona2('Juan', 'Perez', 13)
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = 'Florencia'
    persona2.apellido = 'Flores'
    persona2._edad = 32

    print(persona1.mostrar_detalles())

    # Objeto numero 2 de la tarea
    persona3 = Persona2('Carlos', 'Perez', 21)
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.nombre = 'Carolina'
    persona3.apellido = 'Rivero'
    persona3._edad = 34

    # Objeto numero 3 de la tarea
    persona4 = Persona2('Nati', 'Sosa', 35)
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.nombre = 'Natalia'
    persona4.apellido = 'Arispon'
    persona4._edad = 39
    print(persona4.mostrar_detalles())

print(__name__)
