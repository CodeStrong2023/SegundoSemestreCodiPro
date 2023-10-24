#Ejercicio 3: Agregar personajes a una lista.
# Escriba un programa donde cree una lista con los siguientes personnajes del señor de los anillos
# Nombre: Aragon
# Clase: Guerrero
#Raza: Dunadan del Norte.

#Nombre: Gandalf
#Clase: Mago
#Raza: Istar

#Nombre: Legolas
#Clase: Arquero
#Raza: Elfo Sindar

personajes = [] #Creamos una lista vacia
#Creamos diccionarios
P = {'Nombre': 'Aragon', 'Clase': 'Guerrero', 'Raza': 'Dunadan del Norte'}
personajes.append(P) #Agregamoa a la lista un personaje
P = {'Nombre': 'Gandalf', 'Clase': 'Mago', 'Raza': 'Istar'}
personajes.append(P)
P = {'Nombre': 'Legolas', 'Clase': 'Arquero', 'Raza': 'Elfo Sindar'}
personajes.append(P)
print(personajes) #Tarea: Agregar por lo menos otros tres personajes, que sean a tu eleccion.
P = {'Nombre': 'Frodo', 'Clase': 'Guerrero', 'Raza': 'Hobbit'}
personajes.append(P)
P = {'Nombre': 'Sam', 'Clase': 'Mejor amigo de Frodo <3', 'Raza': 'Hobbit'}
personajes.append(P)
P = {'Nombre': 'Gimli', 'Clase': 'Guerrero', 'Raza': 'Enano'}
personajes.append(P)
print(personajes)