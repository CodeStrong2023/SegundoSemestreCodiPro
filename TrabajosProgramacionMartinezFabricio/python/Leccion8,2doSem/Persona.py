class Persona: #Creamos una clase
    def __init__(self,nombre,apellido,edad): #Se lo llama método Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
    def mostrar_detalle(self): #La variable self solo se encuentra dentro de los métodos
        print(f"Persona: {self.nombre} {self.apellido} {self.edad}")
persona1  = Persona("Ariel","Betancud",40) #Necesitamos enviar argumentos
#print(persona1.nombre) #Tarea: Hacer el print igual que con el objeto 2
#print(persona1.apellido)
#print(persona1.edad)
print(f"El objeto1 de la clase persona: {persona1.nombre}{persona1.apellido} Su edad es: {persona1.edad}")

persona2 = Persona("Osvaldo","Giordanini",45)
print(f"El objeto2 de la clase persona: {persona2.nombre}{persona2.apellido} Su edad es: {persona2.edad}")

persona1.nombre = "Liliana"
persona1.apellido = "Buccella"
persona1.edad = 40
print(f"El objeto1 de la clase persona: {persona1.nombre}{persona1.apellido} Su edad es: {persona1.edad}")

#Los atributos son: características
#Los métodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle()
persona2.mostrar_detalle()