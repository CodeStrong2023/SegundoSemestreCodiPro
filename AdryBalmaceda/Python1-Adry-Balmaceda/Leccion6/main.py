# Clase 6: Sentencia if/else
# Respetar identacion para evitar error
# Modo debug: (depurar/limpiar) paso a paso
# Seleccionar un punto de ruptura: va a detener el ejecutador
# Debug main: avanzar con boton step over o F8
# Entramos a cada linea paso a paso
'''condicion = True  # Testear con: # True # False # 10 # '' # 'hola mundo'
if condicion == True:
    print('Condicion Verdadera') # identacion: tabulador por defecto
elif condicion == False:
    print('Condicion Falsa')
else:
    print('Condicion sin especificar')'''

# Conversion de numero a texto
'''
num = int(input('Digite un numero en el rango del 1 al 3: '))
numTexto = ''
if num == 1:
    numTexto = 'Numero uno'
elif num == 2:
    numTexto = 'Numero dos'
elif numTexto == 3:
    numTexto = 'Numero tres'
else:
    numTexto = 'Has ingresado un numero fuera de rango'
print(f'El numero ingresado es: {num} - {numTexto}')

# Respetar siempre la identacion del bloque de codigo
'''

condicion = True
'''
if condicion:
    print('Condicion Verdadera')
else:
    print('Condicion Falsa')
'''
# Estructura con operador ternario en una linea, se recomienda solo para codigo pequeño
print('Condicion Verdadera') if condicion else print('Condicion Falsa')
