# Ejercicio 03: insertar elementos y ordenarlos
# Pedir numeros y meterlos en una lista, cuando el usuario
# Introduzca una numero 0, nuestro programa dejaria de insertar
# Por ultimo, mostrar los numeros ordenados de menor a mayor

lista = []
salir = False  # en Python False/True es con mayusculas
while not salir:
    numero = int(input('Digite un numero: '))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)
# Funcion para ordenar sort() nuestra lista
lista.sort()
print(f'f\nLista ordenada: \n{lista}')