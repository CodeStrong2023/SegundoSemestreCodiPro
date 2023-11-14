# Ejercicio 02: Función con * args para multiplicar
# crear una función para multiplicar los valores recibidos
# de tipo numérico, utilizando argumentos variables *args
# como parámetro de la funcipon y regresar como resultado
# la multiplicación de todosls valores pasados como argumento


def multiplicar_valores(*numeros):
    resultado = 1  # El cero no nos ayuda a multiplicar
    for numero in numeros:
        resultado *= numero

    return resultado
# llamamos a la fución
print(multiplicar_valores(3, 5, 15))  # Le pasamos los argumentos


# Ejercicio 3: Función Recursiva
# Imprimir números de 5 a 1 de manera descendente usando funciones recursivas
# Puede ser cualquier valor positivo, por ejemplo si pasamos el
# valor de 5, debe imprimir:
# 5, 4, 3 ,2, 1
# En caso de ser el número 3 debe imprimir:
# 3, 2, 1
# Si se ingresa un número negativo no imprime nada

def imprimir_numeros_recursivos(numero):
    if numero >= 1:
        print(numero)
        imprimir_numeros_recursivos(numero - 1)  # caso recursivo
    elif numero == 0:
        return
    elif numero <= 0:
        print("valor ingresado incorrecto...")


imprimir_numeros_recursivos(5)

# Ejercicio 4: calculadora de impuestos
# crear una función para calcular el total de un pago incluyendo
# un impuesto aplicado. (IVA)
# Formula: pago_total = pago_sin_impuesto + (impuesto/100)
# Proporcione el pago sin impuesto: 1000
# Proporcione el monto del impuesto: 21%
# Pago con impuesto: xxxx

def calcular_total_pago(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
    return pago_total




# Ejecutamos la función
pago_sin_impuesto = float(input("Digite el pago sin impuestos: "))
impuesto = float(input("Digite el monto del impuesto a aplicar: "))
pago_con_impuesto = calcular_total_pago(pago_sin_impuesto, impuesto)
print(f"el pago con impuestos es: {pago_con_impuesto}")

# Ejercicio 05: Convertidor de temperaturas
# Realizar dos funciones para convertir de grados celsius
# a fahrenheit y viseversa
# Investigar las formulas: °C * 9/5) + 32 = 32 °F

# Funcion que convierte de celsius a fahrenheit
def celsius_fahrenheit(celsius):
    return celsius * 9 / 5 + 32  # Presedencia: multiplicacion, division y suma

def fahrenheit_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9  # respetar la Presedencia utizando parentesis

celsius = float(input('Digite el valor de celsius: '))
resultado = celsius_fahrenheit(celsius)
print(f'{celsius} C a F -> {resultado: .2f}')

fahrenheit = float(input('Digite el valor de fahrenheit: '))
resultado = fahrenheit_celsius(fahrenheit)
print(f'{fahrenheit} F a C -> {resultado: .2f}')