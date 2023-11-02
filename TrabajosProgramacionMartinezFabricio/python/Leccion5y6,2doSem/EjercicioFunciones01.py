# Ejercicio 01: Crear una función para sumar los valores recibidos de tipo
# numéricos, utilizando argumentos variables *args como parametro de la
# Función y agregar como resultado la suma de todos los valores pasados
# como argumentos.

def sumarValores(*args):
    resultado = 0
    for valor in args: #Se utiliza ciclo for para sumar los argumentos
        resultado = resultado + valor
    return resultado

resultado = sumarValores(5,4,2,7,8,9,10,15)
print(f"Resultado de la suma de valores: {resultado}")
