# Ejercicio1: Iterar un rango de 0 a 10 e imprimir nros divisibles por 3.
print("Ejercicio 1: Iterar un rango de 0 a 10 e imprimir nros divisibles por 3")

for i in range(0, 10):
    if i % 3 == 0:
        print(i)

print("")
# Ejercicio2: Escribir un rango de nros de 2 a 6 e imprimirlos.
print("Ejercicio2: Escribir un rango de nros de 2 a 6 e imprimirlos.")
for i in range(2, 7):
    print(i)
print("")
# Ejercicio3: Crear un rango de 3 a 10 pero con incremento de 2 en 2.
print("Ejercicio3: Crear un rango de 3 a 10 pero con incremento de 2 en 2.")

rango = range(3, 11, 2)
for nro in rango:
    print(nro)

print("")
# Dada la siguiente tupla:
# tupla = (13,1,8,3,2,5,8) , definir la tupla, crear una lista e imprimir por consola los nros menores a 5."""

tupla = (13, 1, 8, 3, 2, 5, 8)
for dato in tupla:
    if dato < 5:
        print(dato)
