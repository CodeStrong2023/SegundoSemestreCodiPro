class Persona:
    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __str__(self):
        return f'Persona: [Nombre: {self._nombre}, Edad: {self._edad}.]'


class Empleado(Persona):
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self._sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f'Empleado: [{self._sueldo} {super().__str__()}]'


empleado1 = Empleado("Emilia", 33, 7500)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)

empleado2 = Empleado("Pedro", 50, 50000)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)

empleado2.nombre = "Juan"
empleado2.edad = 52
empleado2.sueldo = 30000

print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
