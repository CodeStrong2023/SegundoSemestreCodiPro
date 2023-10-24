#Ejercicio 05: Factorial de un numero positivo
# Hacer un programa para calcular el actorial de un numero positivo
numero = int(input("Digite un numero: "))
while numero < 0: #Mientras el numero sea negativo
    print("Error -> El numero tiene que ser positivo")
    numero = int(input("Digite un numero: "))
factorial = 1 #La variable para calcular el factorial
for i in range(1,numero+1):
    factorial *= i
print(f"\nEl factoria5l del numero positivo ingresado es: {factorial}")