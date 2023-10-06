""" Ejercicio rectangulo
En el siguiente ejercicio se solicita calcular el area y el perimetro de un rectangulo.
Para ello debemos de crear las siguientes variables:
alto (int)
ancho (int)
El usuario debe de proporcionar los valores de alto y ancho, despues se debe de
imprimir el resultado en el siguiente formato:
Proporciona el alto del rectangulo: 5
Proporciona el ancho del rectangulo: 3
Area: 15
Perimetro: 16
Las formulas para calcular el area y el perimetro de un rectangulo son:
Area: alto * ancho
Perimetro: (alto + ancho) * 2
"""
# Debemos pedir valores al usuario
# Necesitamos la funcion input
# Hay que hacer una conversion porque la funcion input es tipo string
# pero el valor debe ser de tipo entero
# Formato: decir al usuario proporciona el alto del rectangulo
# Luego ancho
# Resultado: formulas para calcular
# La suma tiene prioridad en el parentesis y luego la multiplicacion
""" para documentar en multiples lineas
docs strings o cadenas para documentar
"""
# Pedimos dato al usuario
alto = int(input("Proporciona el alto del rectangulo: "))
ancho = int(input("Proporciona el ancho del rectangulo: "))
# Dato guardado de tipo entero
# Si no hacemos la conversion a int dara error
area = alto * ancho
perimetro = (alto + ancho) * 2
print("Area: ", area)
print("Perimetro: ", perimetro)
