# Ciclo While (Mientras o durante)
# En este ejemplo1 se genera un bucle infinito:
# condicion = True
# while condicion:
#     print('Ejecutando el ciclo while')
# else:
#     print('Fin del ciclo while')
# ejemplo2:
# contador = 0
# while contador < 3:
#     print('Ejecutamos nuestro ciclo while ' , contador)
#     contador += 1
# else:
#     print('Fin del ciclo while')
'''
# Imprimir numeros del 0 al 5 con el ciclo while
maximo = 5
contador = 0
while contador <= maximo:
    print(contador)
    contador += 1  # es para que se cumpla la condicion de que true pase a ser false
'''
'''
minimo = 1
contador = 5
while contador >= minimo:
    print(contador)
    contador -= 1
'''
'''
# Ciclo for (ciclo para)
cadena = 'Hello'
for letra in cadena:
    print(letra)
else:
    print('Fin del ciclo for')
'''
# Palabra reservada break
# for letra in 'Alemania':
#     if letra == 'a':
#         print(f'Letra encontrada: {letra}')
#         break # rompe la estructura al encontrar el elemento y termina el programa
# else:
#     print('Fin del ciclo for')

# Palabra reservada continue

for i in range(6):
    if i % 2 == 0:
        print(f'Valor: {i}')

for i in range(6):
    if i % 2 != 0:
        continue
    print(f'Valor: {i}')
