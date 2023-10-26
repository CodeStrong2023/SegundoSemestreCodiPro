# Ejercicio 02: modificar los elementos de una lista
# Llenar una lista con los numeros del 1 al 10, luego modificar
# los elementos de la lista multiplicandolos por un valor
# ingresado por el usuario
lista = list(range(1, 11))
print('Lista original')
for i in lista:
    print(i, end='-')
valor = int(input('\nDigite un valor a multiplicar: '))
# multiplicamos todos los elementos de la lista usando funcion enumerate
# enumerate: funcion par modificar los indices de la lista
for indice, i in enumerate(lista):
    lista[indice] *= valor
# usamos interpolacion f
print(f'Lista final con los elementos multiplicados por {valor}')
for i in lista:
    print(i, end='-')
