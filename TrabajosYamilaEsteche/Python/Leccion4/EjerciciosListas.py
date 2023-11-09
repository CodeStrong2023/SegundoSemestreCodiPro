# Ejercicio 1: LLenar una lista
# LLenar una lista con los números del 1 al 50, luego mostrar
# La lista con el buble for, los elementos deben mostrarse
# de la siguiente forma:
# 1-2-3-4-5...50
"""
lista = []
i = 1
while i <= 50:
    lista.append(i)
    i += 1

for i in lista:
    print(i,end="-")
    """

lista = list(range(1, 51))
for i in lista:
    print(i, end="-")

# Ejercicio 2: Modificar los elementos de una lista
# Llenar una lista con los números del 1 al 10, luego modificar los
# elementos de la lista multiplicandolos por un valor ingresado por el usuario

lista = list(range(1, 11))
print("Lista Original")
for i in lista:
    print(i, end="-")

valor = int(input("\nDigite un valor a multiplicar: "))

# Multiplicamos los valores de la lista
for indice, i in enumerate(lista):
    lista[indice] *= valor

print(f"Lista final con los elementos multiplicados por {valor}")

for i in lista:
    print(i, end="-")

# Ejercicio 3: Instertar elementos y ordenarlos
# Pedir números y meterlos en una lista, cuando el usuario
# introduzca un número 0, nuestro programa dejaría de insertar.
#Por último, mostrar los números ordenados de menor a mayor
lista = []
salir = False

while not salir:
    numero = int(input("Digite un número: "))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)

lista.sort() # La lista está ordenada con esta función
print(f"Lista ordenada: \n{lista}")

