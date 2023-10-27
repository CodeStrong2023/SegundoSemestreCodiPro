# Ejercicio 3: Agregar personajes a una lista
# Escriba un programa donde cree una lista con los siguientes
# personajes:
# Nombre: Aragon
# Clase: Guerrero
# Raza: Dunadan del norte

# Nombre: Gandalf
# Clase: Mago
# Raza: Istar

# Nombre: Legolas
# Clase: Arquero
# Raza: Elfo Sindar

# Pasos
# 1 crear lista vacia
personajes = []
# 2 crear diccionarios
P = {'Nombre': 'Aragon','Clase': 'Guerrero', 'Raza': 'Dunedain del Norte'}
# 3 agregar a la lista un personaje
personajes.append(P)
P = {'Nombre': 'Gandalf','Clase': 'Mago', 'Raza': 'Istar'}
personajes.append(P)
P = {'Nombre': 'Legolas','Clase': 'Arquero', 'Raza': 'Elfo Sindar'}
personajes.append(P)
P = {'Nombre': 'Galadriel','Clase': 'Hechicera', 'Raza': 'Elfa Noldor'}
personajes.append(P)
P = {'Nombre': 'Faramir','Clase': 'Guerrero', 'Raza': 'Dunedain'}
personajes.append(P)
P = {'Nombre': 'Frodo','Clase': 'Portador del Anillo', 'Raza': 'Hobbit'}
personajes.append(P)
print(personajes)

# Tarea: agregar por lo menos otros tres personajes a eleccion