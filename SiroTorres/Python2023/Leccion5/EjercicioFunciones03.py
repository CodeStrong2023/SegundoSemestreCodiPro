# Ejercicio 3: Funcion Recursiva
# Imprimir numeros de 5 a 1 de manera descendente usando funciones recursivas
# Puede ser cualquier valor positivo, por ejemplo, si pasamos el valor de 5
# Debe imprimir:
# 5
# 4
# 3
# 2
# 1
#En caso de ser el numero 3 debe imprimir:
#3
#2
#1
#Si se ingresan numeros negativos no imprime nada
def imprimir_numeros_recursivos(numeroRecursivo):
    if numeroRecursivo >= 1: #Caso base
        print(numeroRecursivo)
        imprimir_numeros_recursivos(numeroRecursivo-1)# Caso recursivo
    elif numeroRecursivo == 0:
        return
    elif numeroRecursivo <= 0:
        print('Valor ingresado incorrecto')

numeroRecursivo = int(input('Digite un numero: '))
print(imprimir_numeros_recursivos(numeroRecursivo))
