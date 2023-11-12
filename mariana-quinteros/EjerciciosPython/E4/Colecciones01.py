#Ejercicio 1: Eliminar duplicados de una lista
#Escriba un programa donde tenga una lista y que a continuación
#elimine los elementos repetidos, por último mostrar la lista.

#Creamos una lista
lista1 = [6,7,8,9,1,6,1]
crearConjunto= set(lista1) # De lista a set
lista1 = list(crearConjunto) # De set a lista
print(lista1) # Se muestra la lista

lista1 = [6,7,8,9,1,6,1]
lista1.remove(6)
lista1.remove(1)
print(lista1)

