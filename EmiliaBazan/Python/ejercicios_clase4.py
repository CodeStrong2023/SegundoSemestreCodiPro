import math

# Ejercicio1: Eliminar duplicados de una lista - Escriba un programa dónde se tenga una lista y que
# a continuación elimine los elementos repetidos. Por ùltimo, mostrar la lista.

# print("Ejercicio 1:")

# array = [1, 2, 2, 3, 4, 4, 5, "a", "a", "casa", "pez", 1, 3]
# print('Lista con duplicados: ', array)
# array_unicos = set(array)
# print('Lista sin duplicados:  ', array_unicos)

# print("")


# Ejercicio2: Operaciones de conjuntos con listas. Escriba un programa que tenga dos listas y que
# a continuación cree las siguientes listas (en las que no deben haber repeticiòn)
# 1- Lista de palabras que aparecen en las listas
# 2- Lista de palabras que que paarecen en la primera lista, pero no en la segunda
# 3- Lista de palabras que aparecen en la segunda lista pero no en la primera.
# 4- Lista de palabras que aparecen en ambas listas

# lista1 = [3, 2, 6, "a", "b", "c", 33, 3.14, "as", "Vaso", "Moneda"]
# lista2 = [5, 2, 4, "t", "b", "d", 33, 3.16, "be", "Taza", "Pato"]

# conjunto1 = set(lista1)
# conjunto2 = set(lista2)

# lista = list[conjunto1 | conjunto2]
# print(lista)

# # print("1: Lista de palabras")

# lista = list[conjunto1 | conjunto2]
# print(lista)

# # print("2: Lista de palabras de lista 1")

# unicos1 = [conjunto1 - conjunto2]
# print(f'Lista de palabras de lista 1: {unicos1}')

# # print("3: Lista de palabras de lista 2")

# unicos2 = [conjunto2 - conjunto1]
# print(f'Lista de palabras de lista 2: {unicos2}')

# # print("4: Lista de palabras que aparecen en ambas listas")
# compartidos = [conjunto2 & conjunto1]
# print(f'Lista de palabras que aparecen en ambas listas: {compartidos}')

# Ejercicio 3: Agregar personajes a una lista
# Escriba una lista con los siguientes nombres de los personajes del señor de los anillos

# Nombre: Aragon
# Clase: Guerrero
# Raza: Dunadan del norte

# Nombre: Gandalf
# Clase: Mago
# Raza: Istar

# Nombre: Legolas
# Clase: Arquero
# Raza: Elfo Sindar

# print('Ejercicio 3: Lista con personajes del Sr de los anillos')

# listaPersonajes = {
#     'Personaje1': {'Nombre': 'Aragon', 'Clase': 'Guerrero', 'Raza': 'Dunadan del norte'},
#     'Personaje2': {'Nombre': 'Gandalf', 'Clase': 'Mago', 'Raza': 'Istar'},
#     'Personaje3': {'Nombre': 'Legolas', 'Clase': 'Arquero', 'Raza': 'Elfo Sindar'},
# }

# for valor in listaPersonajes.values():
#     print(valor)

# 4.4 Ejercicio 1 con Matemáticas y la clase math
# Sacar la raíz cuadrada de un número positivo

# numero = int(input('Ingrese un número positivo: '))
# while numero < 0:
#     print("Error, ingrese nro positivo")
#     numero = int(input('Ingrese un número positivo: '))

# print(f'\nLa raíz cuadrada de {numero} es: {math.sqrt(numero):.2f}')

# 4.6 Ejercicio 1 Llenar una Lista con nros del 1 al 50

# lista = list(range(1,51))

# for i in lista:
#     print(i, end ='- ')

# 4.7 Ejercicio 2 Modificar los Elemento de una Lista, llenar una lista con nros del 1 al 10
# Luego modificar los elementos multiplicandolos por un valor ingresado por el usuario

# elementos = list(range(1, 11))

# for i in elementos:
#     print(i, end='- ')

# modificador = int(input("\nIngrese un numero que modifique la lista: "))

# for indice, i in enumerate(elementos):
#     elementos[indice] *= modificador

# print(f' n\Lista de elementos multiplicada por {modificador}: ')

# for i in elementos:
#     print(i, end= '-')

# 4.8 Ejercicio 3 Insertar Elementos y Ordenarlos Función sort(), pedir nros al usuario hasta que ingrese 0 por ultimo ordenarlos
# de menor a mayor

# lista = []
# salir = False

# while not salir:
#     numero = int(input("Digite un numero: "))
#     if numero == 0:
#         salir = True
#     else:
#         lista.append(numero)
# lista.sort()
# print(lista)
