#Ejercicio 04: Sumar numeros pares dentro de un rango
# Hacer un programa para sumar numeros pares dentro
# de un rango, por ejemplo:
# Suma de numeros pares del 2 al 30
#suma = 240
a = int(input("Digite donde va a comenzar la suma: "))
b = int(input("Digite hasta donde quiere llegar a sumar: "))
suma = 0
for i in range(a,b+1):
    if i%2==0: #Esto es para determinar si el numero es par
        suma += i
print(f'\n La suma de los numeros pares dentro del rango especificado es: {suma}')

