#Ejercicio 3: Insertar elementos y ordenarlos
#Pedir numeros y meterlos en una lista, cuando el usuario
#introduzca un numero 0, nuestro programa dejaría de insertar
#Por último mostrar los numeros ordenados de menor a mayor

lista = []
salir = False
while not salir:
    numero = int(input("Ingrese un número: "))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)
lista.sort() #La lista está ordenada con esta función
print(f"\nLista ordenada: \n{lista}")