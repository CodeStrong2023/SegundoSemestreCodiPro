# Ejercicio 2: Operaciones de conjuntos con listas
# Escriba un programa que tenga 2 listas y que a continuacion
# cree las siguientes listas (en las que no deben haber repeticion)
# 1 lista de palabras que aparecen en las listas
# 2 lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 lista de palabras que aparecen en ambas listas

# listas de mascotas en cada casa
nombres1 = ['Floi', 'Juano', 'Dogui', 'Moncho', 'Diana']
nombres2 = ['Moncho', 'Diana', 'Pacho', 'Carozo', 'Bruno', 'Tincho', 'Nicolas']
# listas sin nombres repetidos
mascotas1 = set(nombres1)
mascotas2 = set(nombres2)
print('\n''Lista de mascotas')
# nota: la expresion f" :{ }" se usa para cadenas que contienen variables entre {}
# 1
mascotas = list(mascotas1 | mascotas2)
print(f"1 lista de palabras que aparecen en las listas: {mascotas}")
# 2
casa1 = list(mascotas1 -mascotas2)
print(f"2 lista de palabras que aparecen en la primera lista, pero no en la segunda: {casa1}")
# 3
casa2 = list(mascotas2 - mascotas1)
print(f"3 lista de palabras que aparecen en la segunda lista, pero no en la primera: {casa2}")
# 4
listaMascotas = list(mascotas1 & mascotas2)
print(f"4 lista de palabras que aparecen en ambas listas: {listaMascotas}")


# lista Profe
lista1 = [1,2,3,4,5,4,3,2,2,1,5]
lista2 = [4,5,6,7,8,4,5,6,7,7,8]

# eliminar repetidos de los dos conjuntos
conjunto1 = set(lista1)
conjunto2 = set(lista2)

# unir los dos conjuntos
union = list(conjunto1 | conjunto2)

# mostrar el conjunto1
solo1 = list(conjunto1 - conjunto2)

# mostrar el conjunto2
solo2 = list(conjunto2 - conjunto1)

# mostrar ambas listas
interseccion = list(conjunto1 & conjunto2)
print('\n'"Lista Profe")
print(f"lista de palabras que aparecen en las listas: {union}")
print(f"lista de palabras que aparecen en la primera lista, pero no en la segunda: {solo1}")
print(f"lista de palabras que aparecen en la segunda lista, pero no en la primera: {solo2}")
print(f"lista de palabras que aparecen en ambas listas: {interseccion}")
