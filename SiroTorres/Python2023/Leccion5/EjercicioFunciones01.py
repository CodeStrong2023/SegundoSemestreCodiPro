# Ejercicio 01: Crear una funcion para sumar los valores recibidos de tipo
# numericos, utilizando argumentos variables *args ccomo parametros de la
# funcion y agregar como resultado la suma de todos los valores pasados
# como argumentos.
# Definimos la funcion
def sumar_valor(*args):  # Recibimos una cantidad de parametros indefenidos
    resultado = 0
    #Iteramos cada elemento
    for valor in args:
        resultado += valor
    return resultado

# Llamamos a la funcion
print(sumar_valor(3, 5, 9, 2, 1))
