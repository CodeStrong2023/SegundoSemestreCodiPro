class persona2:
    def __init__(self, nombre, apellido, edad):  # esta Encapsulado.
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def Detalles(self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}")

    @property  # Decorador.
    def nombre(self):  # Método Getter
        print("Estamos utilizando el método get")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # Método Setter
        print("Estamos utilizando el método set")
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")


if __name__ == "__main__":
    Persona1 = persona2("Ariel", "betancud", 41)
    print(Persona1.nombre)  # Llamamos al método Getter

    Persona1.nombre = "Juan pedro" #llamda metodo seter
    print(Persona1.nombre)
    Persona1.Detalles()  # Llamada al método Detalles.
    # Persona1.edad = 40 -- Atributo read-only sería la edad porque no tiene el método set.
    print(Persona1.edad)

    # Objeto 1
    Persona2 = persona2("flor", "romero", 21)
    print(Persona2.nombre)
    print(Persona2.apellido)
    print(Persona2.edad)

    Persona2.nombre = "Gonza"
    Persona2.apellido = "Morales"
    Persona2.edad = 25

    Persona2.Detalles()

    # Objeto 2
    Persona3 = persona2("yamila", "esteche", 29)
    print(Persona3.nombre)
    print(Persona3.apellido)
    print(Persona3.edad)

    Persona3.nombre = "Yami"
    Persona3.apellido = "esth"
    Persona3.edad = 16

    Persona3.Detalles()

    # Objeto 3
    Persona4 = persona2("naty", "lucero", 35)
    print(Persona4.nombre)
    print(Persona4.apellido)
    print(Persona4.edad)

    Persona4.nombre = "natalia"
    Persona4.apellido = "lu"
    Persona4.edad = 31

    Persona4.Detalles()

    print(__name__)