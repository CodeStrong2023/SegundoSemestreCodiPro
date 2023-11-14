# Ejercicio 05: Convertidor de temperaturas
# Realizar dos funciones para convertir de grados celsius
# a fahrenheit y viceversa.
# Investigar las formulas

#Convierte de celsius a fahrenheit
def celsius_fahrenheit(celsius):
    return celsius*9/5+32 #La precedencia: multiplicación, división y suma
#Convierte de fahrenheit a celsius
def fahrenheit_celsius(fahrenheit):
    return  (fahrenheit  - 32) * 5 / 9  #Respetar la precedencia utilizando parentesis
celsius = float(input("Ingrese el valor de Celsius: "))
resultado = celsius_fahrenheit(celsius)
print(f"Resultado de celsius a fahrenheit: {celsius}C a F -> {resultado:.2f}")

fahrenheit = float(input(("Ingrese el valor de Fahrenheit: ")))
resultado = fahrenheit_celsius(fahrenheit)
print(f"Resultado de fahrenheit a celsius: {fahrenheit}F a C -> {resultado:.2f}")