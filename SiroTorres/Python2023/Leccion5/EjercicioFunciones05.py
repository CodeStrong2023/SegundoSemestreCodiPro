# Ejercicio 5: Convertidor de temperaturas
# Realizar dos funciones para convertir de gradddos celsius
# a fahrenheit y viseversa.
#Investigar las formulas

#Funcion que convierte de celsius a fahrenheit
def celsius_fahrenheit(celsius):
    return celsius * 9 / 5 + 32 #La presedencia: multiplicacion, division y suma
#Funcion que convierte de fahrenheit a celsius
def fahrenheit_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9 #Respetar la presedencia usando parentensis

celsius = float(input('Digite el valor de celsius: '))
resultado = celsius_fahrenheit(celsius)
print(f'{celsius} C a F -> {resultado:.2f}')

fahrenheit = float(input('Digite el valor de Fahrenheit: '))
resultado = fahrenheit_celsius(fahrenheit)
print(f'{fahrenheit} F a C -> {resultado:.2f}')