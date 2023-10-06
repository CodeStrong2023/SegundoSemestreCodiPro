""" Ejercicio: Determinar si es mayor de edad
Pedir un número al usuario
Almacenar el valor en una variable
Usar la estructura ‘if else’
La formula es: <num> >= 18
True: Eres mayor de edad, Imprimir
False: Eres menor de edad, Imprimir
"""
edadAdulto = 18
edadPersona = int(input("Digite su edad: "))
if edadPersona >= edadAdulto:
    print(f"Su edad es: {edadPersona} años, usted es mayor de edad")
else:
    print(f"Su edad es: {edadPersona} años, usted es menor de edad")