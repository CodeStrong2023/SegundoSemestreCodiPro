# # 5.1 Ejercicio 4 Sumar Números pares dentro de un rango

# lista = []

# inf = int(input('Ingrese el valor inferior del rango: '))
# sup = int(input('Ingrese el valor superior del rango: '))

# for i in range(inf, sup+1):
#     if i % 2 == 0:
#         lista.append(i)

# print(f'Los numeros pares de su lista son: {lista}')

# suma = sum(lista)

# print(f'Los elementos pares de su lista suman: {suma}')

# 5.2 Ejercicio 5 Factorial de un número positivo

# numero = int(input('Ingrese un numero positivo para factorizar: '))

# factorial = 1

# for i in range(1, numero+1):
#     factorial *= i

# print(f'El factorial de {numero} es: {factorial}')

# 5.5 Ejercicio 6: Tabla de multiplicar - Ingresar un numero y multiplicaarlo en una lista del 1 al 10.abs

# def tabla():
#     elementos = list(range(1, 11))
#     modificador = int(
#         input("\nIngrese el numero que quiera saber su tabla de multiplicar: "))
#     for indice, i in enumerate(elementos):
#         elementos[indice] *= modificador
#     print(f'\nLista de elementos multiplicada por {modificador}: ')
#     for i in elementos:
#         print(i, end='-')

# tabla()

# 5.6 Ejercicio 7: Adivina el numero - Realiza un juego para adivinar un numero, Se debe generar un numero aleatorio
# entre 1 - 100 y luego ir pidiendo numeros "Es mayor o es menor" según sea mayor o menor respecto a n. El proceso termina
# cuando el usuario acierta y se debe mostrar el numero de intentos.

# import random

# aleatorio = random.randint(0, 100)
# contador = 0
# while True:
#     nro = int(input('Digite un entero del 0 al 100: '))
#     contador += 1
#     if nro > aleatorio:
#         print("\tEs menor")
#     elif nro < aleatorio:
#         print("\tEs mayor")
#     else:
#         print(f'\nEncontraste el número y es: {aleatorio}')
#         break

# print(f"\nNumero de intentos: {contador}")

# 5.7 Ejercicio 8: Simular cajero con las siguientes opciones:
#     1. Ingresar dinero
#     2. Extraer dinero
#     3. Mostrar dinero disponible
#     4. Salir


# dinero = 1000

# while True:
#     opcion = int(input(
#         "Elija la opción que desea realizar: \n1. Ingresar dinero \n2. Extraer dinero \n3. Mostrar dinero disponible \n4. Salir \n -"))
#     if opcion == 1:
#         ingreso = int(input("Digite el monto que desea ingresar: $"))
#         dinero += ingreso
#         print(f"Se ha ingresado ${ingreso}. Saldo total: ${dinero}")

#     elif opcion == 2:
#         retiro = int(input("Digite el monto que desea extraer: $ "))
#         if retiro <= dinero:
#             dinero -= retiro
#             print(f"Se ha retirado ${retiro}. Saldo total: ${dinero}")
#         else:
#             print("Saldo insuficiente")

#     elif opcion == 3:
#         print(f"El dinero disponible es: ${dinero}")
#     elif opcion == 4:
#         print('Vuelva pronto!')
#         break
#     else:
#         print("La opción ingresada es inválida")
#         break

# 5.8 Ejercicio 9: Ingresar una frase, eliminar los espacios en blanco y contar los caracteres.

# frase = input('Ingrese una frase: ')

# fraseSinEspacios = frase.replace(" ", "")
# print(fraseSinEspacios)
# caracteres = len(fraseSinEspacios)

# print(f'Tu frase sin espacios tiene {caracteres} cantidad de letras')
