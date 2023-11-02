# Ejercicio 02: Funcion con *args para multiplicar
# Crear una funcion para multiplicar los valores recibidos
# de tipo numerico, utilizando argumentos variables *args
# como parametro de la funcion y regresar como resultado
# la multiplicacion de todos los valores pasados como argumentos

# Definimos la funcion para multiplicar
def multiplicar_valores(*args):  # el mas utilizado es *args
    resultado = 1  # el cero no nos ayuda a multiplicar
    for numero in args:
        resultado *= numero
    return resultado

# Llamamos la funcion
print(multiplicar_valores(3, 5, 15, 3))  # le pasamos los argumentos