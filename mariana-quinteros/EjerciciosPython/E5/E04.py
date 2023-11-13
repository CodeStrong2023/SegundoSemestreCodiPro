# Ejercicio 4: Sumar números pares dentro de un rango
# Hacer un programa para sumar números pares dentro de
# un rango, por ejemplo:
#                        suma de numeros pares del 2 al 30
#                        suma = 240

a = int(input("Ingrese el número de donde va a comenzar la suma: "))
b = int(input("Ingrese el número donde va a finalizar la suma: "))
suma = 0

for i in range(a,b+1):
    if i % 2 == 0:
        suma = suma+1
print(f"La suma de los números pares dentro del rango es: {suma}")        