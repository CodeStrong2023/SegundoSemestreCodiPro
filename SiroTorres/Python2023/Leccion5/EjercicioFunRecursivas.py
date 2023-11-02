# Funciones Recursivas
def factorial(numero):
    if numero == 1: #Caso base
        return 1
    else:
        return numero * factorial(numero-1) #Caso recursivo
numeroFactorial = int(input('Digite el numero para calcular el factorial: '))
resultado = factorial(numeroFactorial) #Lo hacemos en codigo duro
print(f'El factorial del numero {numeroFactorial} es: {resultado}')