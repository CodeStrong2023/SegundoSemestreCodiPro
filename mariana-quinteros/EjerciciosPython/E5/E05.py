# Ejercicio 5: Factorial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo
numero = int(input("Ingrese un número: "))
while numero <= 0:
    print("Error, el número ingresado debe ser positivo")
    numero = int(input("Ingrese de nuevo un número: "))
factorial = 0 #La variable para calcular el factorial
for i in range (1,numero+1):
    factorial*=i
print(f"\n El factorial del número {numero} positivo es: {factorial}")