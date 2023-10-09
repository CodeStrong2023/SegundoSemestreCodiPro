#Ejercicio 3: Agregar personajes a una lista
#Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos
#Nombre: Aragorn
#Clase: Guerrero
#Raza: Dúnadan del norte

#Nombre: Gandalf
#Clase: Mago
#Raza: Istar

#Nombre: Legolas
#Clase: Arquero
#Raza: Elfo Sindar

anillos = [
    "Nombre: Gandalf",
    "Clase: Mago",
    "Raza: Istar",
    
    "Nombre: Aragorn",
    "Clase: Guerrero",
    "Raza: Dúnadan del norte",
    
    "Nombre: Legolas",
    "Clase: Arquero",
    "Raza: Elfo Sindar"
]
print(anillos)

personajes = [] #Creamos una lista vacia
#Utilizamos diccionarios
P = {"Nombre": "Aragorn", "Clase": "Guerrero", "Raza": "Dúnadan del norte"}
personajes.append(P) #Para agregar personajes
P = {"Nombre": "Gandalf", "Clase": "Mago", "Raza": "Istar"}
personajes.append(P)
P = {"Nombre": "Legolas", "Clase": "Arquero", "Raza": "Elfo Sindar"}
personajes.append(P)
print(personajes)