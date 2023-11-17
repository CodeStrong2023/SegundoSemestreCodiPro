"""Ejercicio 6: Ingresar N enteros, visualizar la suma de los nros pares de la lista,
cuántos nros pares existen y cuál es el promedio de los nros impares"""

elementos = int(input("Ingrese la cantidad de elementos de la lista:"))
# Generar lista
datos = []
for i in range(0, elementos):
    dato = int(input("Ingrese elemento: "))
    datos.append(dato)
print("Lista de datos", datos)
# Realizar suma de nros pares y el conteo de ellos
suma_pares = 0
pares = 0
for dato in datos:
    if dato % 2 == 0:
        suma_pares += dato
        pares += 1
print("La suma de los numeros pares es: ", suma_pares)
print("La cantidad de numeros pares es: ", pares)
# Realizar suma de nros pares y el promedio de ellos
suma_impares = 0
impares = 0
for dato in datos:
    if dato % 2 != 0:
        suma_impares += dato
        impares += 1
promedioImpares = suma_impares/impares
print("El promedio de impares es: ", promedioImpares)
