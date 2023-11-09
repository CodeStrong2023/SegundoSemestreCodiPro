# Ejercicio 03: Funcion Recursiva
# Imprimir numeros de 5 a 1 de manera descendente
# usando funciones recursivas
# Puede ser cualquier valor positivo, por ejemplo, si pasamos el
# valor 5, debe imprimir:
# 5
# 4
# 3
# 2
# 1
# En caso de ser el numro 3 debe imprimir:
# 3
# 2
# 1
# Si se ingresan numeros negativos no imprime nada
def imprimir_numeros_recursivos(numero):
    if numero >= 1:  # caso Base
        print(numero)
        imprimir_numeros_recursivos(numero-1)  # caso Recursivo
    elif numero == 0:
        return
    elif numero <= 0:
        print('Valor ingresado incorrecto...')

# Tarea que el numero lo ingrese el usuario
# imprimir_numeros_recursivos(5)
imprimir_numeros_recursivos(int(input('Digite 5: ')))
imprimir_numeros_recursivos(int(input('Digite 3: ')))
imprimir_numeros_recursivos(int(input('Digite 0: ')))
imprimir_numeros_recursivos(int(input('Digite otro numero: ')))
imprimir_numeros_recursivos(int(input('Digite un numero negativo: ')))



