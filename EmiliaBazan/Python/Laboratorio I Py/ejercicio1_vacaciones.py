
"""Diseñar un programa que ingresado un año, nos diga si es biciesto o no."""

ano = int(input("Ingrese un año: "))
if (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0):
    print("Es año biciesto")
else:
    print("El año no es biciesto")
