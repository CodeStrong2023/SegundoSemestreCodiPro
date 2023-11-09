# Ejercicio 1: eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuacion
# elimine los elementos repetidos, por ultimo mostrar la lista

# Lista
lista = ['perro', 1, 'gato', 1, 1, 'pajaro', 1, 'pajaro', 'Vaco', 'Nino', 'Pipo', 2, 3, 4, 2]
# con set se eliminan los repetidos
# conjunto = set(lista)  # convertimos la lista a un conjunto tipo set

# lista = list(conjunto)  # convertimos el conjunto a una lista

# codigo mas eficiente
lista = list(set(lista))  # conversion hecha en una sola linea de codigo
print(lista)