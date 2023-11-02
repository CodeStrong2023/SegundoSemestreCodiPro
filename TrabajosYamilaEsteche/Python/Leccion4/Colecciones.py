#Ejercicio 1: Eliminar duplicados en una lista.
# Escriba un programa donde tenga una lista y que a continuacion
#elimine los elementos repetidos, por ultimo, mostrar la lista.
import math

#Creamos una lista.
lista = [1,2,3, "Ariel", 7, 7, 3, "Alberto", 1, "Ariel", 2, "Alberto"]
#Los tipos set son aquellos que no poseen elementos repetidso.
#conjunto = set(lista) #Convertimos la lista a un conjunto de tipo set.
#lista = list(conjunto) #Convertimos el conjunto a una lista.
#Hacemos lo anterior en una sola linea de codigo:
lista = list(set(lista))
print(lista)


#Ejercicio 2: Operaciones de conjuntos con listas.
#Escriba un programa que tenga 2 lista y que a continuacion
#Cree las siguientes listas (En las que no deben haber repeticion)
# 1 Lista de palabras que aparecen en las listas.
# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 Lista de palabras que aparecen en la segunda lista pero no en la primera.
# 4 Lista de palabras que aparecen en ambas listas.

lista1 = [1,2,3,4,5,4,3,2,2,1,5]
lista2 = [4,5,6,7,8,4,5,6,7,7,8]

#Eliminar los elementos de ambas listas con conjuntos.
conjunto1 = set(lista1)
conjunto2 = set(lista2)

union = list(conjunto1 | conjunto2) #Unimos los dos conjuntos
solo1 = list(conjunto1 - conjunto2) #Solo muestra el conjunto1
solo2 = list(conjunto2 - conjunto1) #Solo muestra el conjunto2
interseccion = list(conjunto1 & conjunto2) #Mostramos los elementos que coinciden en ambas listas

print(f"Lista de palabras que aparecen en las listas: {union}")
print(f"Lista de palabras que aparecen en la primera lista, pero no en la segunda: {solo1}")
print(f"Lista de palabras que aparecen en la segunda lista pero no en la primera: {solo2}")
print(f"Lista de palabras que coinciden en ambas listas: {interseccion}")


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
personajes.append(P) #Agregamos a la lista un personaje
P = {'Nombre': 'Gandalf', 'Clase': 'Mago', 'Raza': 'Istar'}
personajes.append(P)
P = {'Nombre': 'Legolas', 'Clase': 'Arquero', 'Raza': 'Elfo Sindar'}
personajes.append(P)
print(personajes) #Tarea: Agregar por lo menos otros tres personajes, que sean a tu eleccion.
P = {'Nombre': 'superman', 'Clase': 'super heroe', 'Raza': 'extraterrestre'}
personajes.append(P)
P = {'Nombre': 'clark', 'Clase': 'heroe', 'Raza': 'extraterrestre'}
personajes.append(P)
P = {'Nombre': 'thor', 'Clase': 'odinense', 'Raza': 'dios'}
personajes.append(P)
print(personajes)


#Ejercicio de matematica

# Importamos la clase math para hacer uso de la función sqrt(raíz cuadrada)
# Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8)  # definimos la tupla
# Crear una lista que solo incluya los números menores a 5
# e imprima por consola [1,3,2]

lista = []  # Definimos la lista
# filtramos los elementos menores a 5 de la tupla
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)

# Ejercicio de matemáticas
# Para sacar la raíz cuadrada de un número positivo

num = int(input("Digite un número positivo: "))
while num < 0:
    print("Error  : Debe ser un número positivo ")
    num = int(input("Digite un número positivo: "))

print(f"\n Su raíz cuadrada es : {math.sqrt(num):.2f}")


