class Persona2:

    def __init__(self, nombre, apellido, edad):

        self._nombre = nombre

        self._apellido = apellido

        self._edad = edad

    def mostar_detalles(self):
        print(

            f"Los datos a mostrar son los siguientes: {self._nombre} , {self._apellido}, {self._edad}")

    @property  # Decorador
    def nombre(self):  # Método getter

        # print("Usando método getter")

        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # Método Setter

        # print("Usando método setter")

        self._nombre = nombre

    @property  # Decorador
    def apellido(self):  # Método getter

        # print("Usando método getter")

        return self._apellido

    @apellido.setter
    def apellido(self, apellido):  # Método Setter
        # print("Usando método setter")
        self._apellido = apellido

    @property  # Decorador
    def edad(self):  # Método getter
       # print("Usando método getter")
        return self._edad

    @edad.setter
    def edad(self, edad):  # Método Setter
        # print("Usando método setter")
        self._edad = edad

        def __del__(self):
            print(f'Persona 2: {self._nombre} {self._apellido} {self._edad}')


if __name__ == "__main__":
    persona1 = Persona2(
        "Emilia", "Bazán", 33)
    print(persona1.nombre)
    # Llamamos al método por getter
    print(persona1.apellido)
    print(persona1.edad)
    persona1.nombre = "Juan"
    persona1.apellido = "Carlos"
    print(persona1.mostar_detalles())  # Llamamos al método mostrar detalles
    # El atributo read only sería la edad poreque no tiene el método setter

    # Taea: Crear 3 objetos más, utilizando
    #  los métodos getter and setter para mostrar y modificar los cambios

    persona2 = Persona2("Juan", "José", 50)
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = "Jon"
    persona2.apellido = "Charles"
    persona2.edad = 50
    print(persona2.mostar_detalles())

    persona3 = Persona2("Martin", "Pescador", 22)
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.nombre = "Marto"
    persona3.apellido = "Cazador"
    persona3.edad = 24
    print(persona3.mostar_detalles())

    persona4 = Persona2("Paul", "Perez", 19)
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.nombre = "Pol"
    persona4.apellido = "García"
    persona4.edad = 20
    print(persona4.mostar_detalles())

    print(__name__)

