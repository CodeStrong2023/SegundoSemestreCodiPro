class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}")

    @property #Decorador
    def nombre(self): #Metodo Getter
        print("Estamos utilizando el metodo Get:")
        return self._nombre

    @nombre.setter
    def nombre(self,nombre): #Metodo Setter
        print("Estamos utilizando el metodo Set:")
        self._nombre = nombre

    @property  # Decorador
    def apellido(self):  # Metodo Getter
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):  # Metodo Setter
        self._apellido = apellido

    @property  # Decorador
    def edad(self):  # Metodo Getter
        return self._edad
    @edad.setter  # Decorador
    def edad(self, edad):  # Metodo Setter
        self._edad = edad

    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido}{self._edad}")

if __name__ == "__main__":

    persona1 = Persona2("Ariel","Betancud",41)
    print(persona1.nombre) #Llamamos al metodo Getter
    print(persona1.apellido)
    print(persona1.edad)
    persona1.nombre = "Juan Pedro" #Llamamos al metodo Setter
    print(persona1.nombre) #Otra vez con el metodo Getter
    print(persona1.mostrar_detalles()) #Llamamos al metodo mostrar detalles
    #Atributo read-only (solo lectura) seria la edad porque no tiene el metodo Set
    print(persona1.edad)

    #Tarea: crear tres objetos más, utilizando los métodos getter and setter
    #para modificar, y mostrar los cambios

    #1
    persona2 = Persona2("Osvaldo", "Giordanini",50)
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad) #Trabajamos con Get
    persona2.nombre = "Florencia"
    persona2.apellido = "Villarroel"
    persona2.edad = 22 #Trabajamos con Set
    print(persona2.mostrar_detalles())

    #2
    persona3 = Persona2("Vlady", "Marti", 30)
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad) #Trabajamos con Get
    persona3.nombre = "Vladimir"
    persona3.apellido = "Martinez"
    persona3.edad = 19 #Trabajamos con Set
    print(persona3.mostrar_detalles())

    #3
    persona4 = Persona2("Claudy", "Martin",45)
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad) #Trabajamos con Get
    persona4.nombre = "Claudia"
    persona4.apellido = "Martinez"
    persona4.edad = 53 #Trabajamos con set
    print(persona4.mostrar_detalles())

    print(__name__)
