# Ejercicio 02: Función con *args para multiplicar
# Crear una función para multiplicar los valores recibidos
# de tipo númerico, utilizando argumentos variables *args
# como parámetro de la función y regresar como resultado
# la multiplicación de todos los valores pasados como argumento

#Definimos la función para multiplicar
def multiplicarValores(*args):
    resultado = 1
    for numero in args:
        resultado *= numero
    return resultado

#Llamamos a la funcion
print(multiplicarValores(3,5,15,3)) #Le pasamos los argumentos