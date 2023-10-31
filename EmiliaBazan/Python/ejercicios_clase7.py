# #Ejercicio2: función con *args para multiplicar.
# Crear una función par multiplicar los valores recibidos del tipo numérico, utilizando
# argumentos variables *args como paramaetro de la función y regresar como resultado
# la multiplicación de todos los valores pasados como argumentos.

def multiplicar_valores(*numeros):
    resultado = 1
    for numero in numeros:
        resultado *= numero
    return resultado


print(multiplicar_valores(7, 5, 15))
