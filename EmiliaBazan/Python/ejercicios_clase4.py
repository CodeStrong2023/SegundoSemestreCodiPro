# Ejercicio1: Eliminar duplicados de una lista - Escriba un programa dónde se tenga una lista y que
# a continuación elimine los elementos repetidos. Por ùltimo, mostrar la lista.

# print("Ejercicio 1:")
# array = [1, 2, 2, 3, 4, 4, 5, "a", "a", "casa", "pez", 1, 3]
# array_unicos = list(set(array))
# print(array_unicos)

# print("")


# Ejercicio2: Operaciones de conjuntos con listas. Escriba un programa que tenga dos listas y que
# a continuación cree las siguientes listas (en las que no deben haber repeticiòn)
# 1- Lista de palabras que aparecen en las listas
# 2- Lista de palabras que que paarecen en la primera lista, pero no en la segunda
# 3- Lista de palabras que aparecen en la segunda lista pero no en la primera.
# 4- Lista de palabras que aparecen en ambas listas

lista1 = [3, 2, 6, "a", "b", "c", 33, 3.14, "as", "Vaso", "Moneda"]
# lista2 = [5, 2, 4, "t", "b", "d", 33, 3.16, "be", "Taza", "Pato"]
# lista3 = lista1 + lista2
# print("Ejercicio 2:")

# print("1: Lista de palabras")

# lista_str = []
# for elemento in lista3:
#     if isinstance(elemento, str):
#         lista_str.append(elemento)
# print(elemento)


# print("2: Lista de palabras de lista 1")

# for elemento in lista1:
#     if isinstance(elemento, str):
#         print(elemento)

# print("3: Lista de palabras de lista 2")

# for elemento in lista2:
#     if isinstance(elemento, str):
#         print(elemento)


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

print('Ejercicio 3: Lista con personajes del Sr de los anillos')

listaPersonajes = {
    'Personaje1': {'Nombre': 'Aragon', 'Clase': 'Guerrero', 'Raza': 'Dunadan del norte'},
    'Personaje2': {'Nombre': 'Gandalf', 'Clase': 'Mago', 'Raza': 'Istar'},
    'Personaje3': {'Nombre': 'Legolas', 'Clase': 'Arquero', 'Raza': 'Elfo Sindar'},
}

print(listaPersonajes['Personaje1'])
