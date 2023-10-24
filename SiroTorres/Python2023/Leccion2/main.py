# Sentencia If else
'''
condicion = False
if condicion == True:
    print('Condicion verdadera')
elif condicion == False:
    print('Condicion Falsa')
else:
    print('Condicion sin especificar')
'''
num = int(input('Digite un numero del rango del 1 al 3: '))
numTexto = ''
if num == 1:
    numTexto = 'Numero uno'
elif num == 2:
    numTexto = 'Numero dos'
elif num == 3:
    numTexto = 'Numero tres'
else:
    numTexto = 'Error. Digite un numero dentro del rango especificado.'
print(f'El numero ingreso es: {num} - {numTexto}')

