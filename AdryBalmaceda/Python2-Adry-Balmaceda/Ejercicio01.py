# Ejercicio 01: llenar una lista
# Llenar una lista con los numeros del 1 al 50, luego mostrar
# la lista con el bucle for, los elementos deben mostrarse
# de la siguiente forma:
# 1-2-3-4-5...-50

# Algoritmo mas largo
# lista = []
# i = 1
# while i <= 50:
#    lista.append(i)
#    i += 1

# Algoritmo eficaz, pasamos de 5 lineas a una sola linea
lista = list(range(1, 51))
for i in lista:
    print(i,end='-')
