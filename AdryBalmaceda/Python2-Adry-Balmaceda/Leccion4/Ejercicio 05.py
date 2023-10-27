# Ejercicio 05: Factorial de un numero positivo
# Hacer un programa para calcular el factorial de un numero positivo
numero = int(input('Digite un numero: '))
while numero < 0:  # mientras numero sea negativo
    print('Error -> El numero tiene que ser positivo')
    numero = int(input('Digite un numero: '))
factorial = 1  # variable para calcular el factorial inicializar en 1 para que haga el calculo
for i in range(1,numero+1):
    factorial *= i
print(f'\nEl factorial del numero {numero} positivo ingresado es: {factorial}')
