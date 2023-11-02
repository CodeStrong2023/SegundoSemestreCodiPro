""" Ejercicio: Número par o impar
Solicitamos que el usuario ingrese un número
Este se asigna a una variable
Utilizaremos la estructura ‘if else’
La formula: <num> % 2 == 0 Esta operación nos dice si es un número par
Si es True imprimimos que es par
Si es False imprimimos que es impar
"""
a = int(input("Digite un numero: "))
print(f"El residuo de la division es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es: {a} es un numero PAR")
else:
    print(f"El valor de a es: {a} es un numero IMPAR")