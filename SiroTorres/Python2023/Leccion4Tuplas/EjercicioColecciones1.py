#Ejercicio 1: Eliminar duplicados en una lista.
# Escriba un programa donde tenga una lista y que a continuacion
#elimine los elementos repetidos, por ultimo, mostrar la lista.

#Creamos una lista.
lista = [1,2,3, "Ariel", 7, 7, 3, "Alberto", 1, "Ariel", 2, "Alberto"]
#Los tipos set son aquellos que no poseen elementos repetidso.
#conjunto = set(lista) #Convertimos la lista a un conjunto de tipo set.
#lista = list(conjunto) #Convertimos el conjunto a una lista.
#Hacemos lo anterior en una sola linea de codigo:
lista = list(set(lista))
print(lista)
