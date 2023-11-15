class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    class Empleado(Persona): #Esta clase es hija de la clase persona
        def __init__(self,sueldo):
            self.sueldo = sueldo

            empleado1 = Empleado(75000)
            print(empleado1)