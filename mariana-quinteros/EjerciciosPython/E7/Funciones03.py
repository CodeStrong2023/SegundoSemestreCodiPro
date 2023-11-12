# Ejercicio 03: Función Recursiva
# Imprimir numeros de 5 a 1 de manera descendente usando funciones recursivas
# Puede ser cualquier valor positivo, por ejemplo, si pasamos el valor
# de 5, debe imprimir:
# 5
# 4
# 3
# 2
# 1
# En caso de ser el número 3 debe imprimir:
# 3
# 2
# 1
# Si se ingresan números negativos no imprime nada
def imprimirNumerosRecursivos (numero):
    if numero >= 1:
        print(numero)
        imprimirNumerosRecursivos(numero-1)

    elif numero <= 0:
        print("Valor ingresado incorrecto, vuelva a ejecutar")

print("SI SE INGRESAN NÚMEROS NEGATIVOS O EL 0, NO IMPRIME NADA")
numero = int(input("Ingrese un número para la función: "))
resultado = imprimirNumerosRecursivos(numero)
