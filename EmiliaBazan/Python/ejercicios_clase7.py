# #Ejercicio2: función con *args para multiplicar.
# Crear una función par multiplicar los valores recibidos del tipo numérico, utilizando
# argumentos variables *args como paramaetro de la función y regresar como resultado
# la multiplicación de todos los valores pasados como argumentos.

# def multiplicar_valores(*numeros):
#     resultado = 1
#     for numero in numeros:
#         resultado *= numero
#     return resultado


# print(f'El producto de los argumentos es: {multiplicar_valores(7, 5, 15)}')

# Ejercicio recursividad. Hacer el factorial de un nro haciendo que el usuario ingrese ese nro en codigo duro

# from math import factorial

# nro = int(input("ingrese un numero: "))
# resultado = factorial(nro)
# print(f'El factorial de {nro} es: {resultado}')

# ejercicio 3: Imprimir numeros de manera descendente usando funcion recursiva, puede ser cualquier numero positivo.
# Si el nro ingresado es negativo no imprime nada.

# def listaDescendiente(nro):
#     if nro >= 0:
#         print(nro)
#         listaDescendiente(nro-1)
#     else:
#         print("Valor incorrecto")

# listaDescendiente(int(input("Ingrese un numero: ")))

# Ejercicio 4: Calculadora de impuestos. crear un acalculadora para calcular el total de un pago incluyendo impuestos.

# def calcPago(pago, iva):
#     pagoTotal= pago + pago*(iva/100)
#     return pagoTotal

# pago = float(input("Digite el pago libre de impuestos: "))
# iva = int(input("Digite el porcentaje de iva: "))
# pagoTotal = calcPago(pago, iva)

# print(f'El pago es de ${pago}, el impuesto es de {iva}%, el pago total es de {pagoTotal}.')

# Ejercicio 5: Conversor de farenheit a celcius y viceversa.

# def toFarenheit(centigrados):
#     farenheit = (centigrados * 9/5)+32
#     return farenheit


# def toCentigrados(farenheit):
#     centigrados = (farenheit - 32) * 5/9
#     return centigrados


# dato = input(
#     "Ingrese a que unidad quiere convertir, F para Farenheit y C para centigrados: ")

# if dato == 'c':
#     farenheit = float(input("Digite los ºF que desea pasar a ºC: "))
#     print(f'Los {farenheit}ºF ingresados, equivalen a {toCentigrados(farenheit)}ºC')
# elif dato == 'f':
#     centigrados = float(input("Digite los ºC que quiere pasar a ºF: "))
#     print(
#         f'Los {centigrados}ºC ingresados, equivalen a {toFarenheit(centigrados)}ºF')
# else:
#     print("Dato incorrecto!")
