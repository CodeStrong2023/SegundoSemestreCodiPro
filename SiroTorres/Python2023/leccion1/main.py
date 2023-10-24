'''
miVariable = 3
print(miVariable)
miVariable = "Hola a todos los estudiantes de la Tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))
# Las literales se escriben de la siguiente manera x960
print(id(y))
print(id(z))

# Tipos Int, Float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas (String)
miGrupoFavorito = "Fugees"
caracteristicas = "The Best R&B Band"
print("Mi grupo favorito es: ", miGrupoFavorito, caracteristicas)

numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))

# Tipos Booleanos (Bol)
miBooleano = 1 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es: verdadero")
else:
    print("El resultado es: falso")

# Procesar la entrada del usuario.
# Funcion imput.

resultado = input("Digite un numero:")  # regresa un dato tipo string
print(resultado)

# Conversion de la entrada de datos

numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ", resultado)
'''
"""
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
#print("Resultado de la suma:",suma)
print(f'El resultado de la suma es: {suma}')

resta = operandoA - operandoB
print(f'El resultado de la resta es: {resta}')

mutiplicacion = operandoA * operandoB
print(f'El resultado de la multplicacion es: {mutiplicacion}')

divison = operandoA / operandoB
print(f'El resultado de la division es: {divison}')
division = operandoA // operandoB
print(f'El resultado de la division(Int) es:{division}')

modulo = operandoA % operandoB
print(f'El resultado de la divison o residuo (modulo) es: {modulo}')

exponente = operandoA ** operandoB
print(f'El exponente es: {exponente}')
"""
"""
alto = int(input('Proporcione el alto del rectangulo: '))
ancho = int(input('Proporcione el ancho del rectangulo: '))
area = alto * ancho
perimetro = (alto + ancho) * 2
print('Area: ',area)
print('Perimetro: ',perimetro)
"""
"""
miVariable = 10
print(miVariable)

#operadores de reasignacion

miVariable = miVariable + 1
print(miVariable)

miVariable += 1
print(miVariable)

# miVariable = miVariable - 2

miVariable -= 2
print(miVariable)

# miVariable = miVariable * 3

miVariable *= 3
print(miVariable)

# miVariable = miVariable / 2

miVariable /= 2
print(miVariable)

# Operadores de comparacion

d = 4
b = 2
resultado = d == b #Comprobamos si son iguales
print(resultado)

# Operador diferente

resultado = d != b #Comprobamos si son diferentes
print(resultado)

# Operador Mayor que

resultado = d > b
print(resultado)

# Operador menor o igual que

resultado = d <= b
print(resultado)

# Operador mayor o igual que

resultado = d >= b
print(resultado)
"""
"""
#Ejercicio 1
a = int(input("Digite un numero: "))
print(f"El residuo de la division es {a % 2}")
if a % 2 == 0:
    print(f"El valor de a: {a} es un numero PAR")
else:
    print(f"El valor de a: {a} es un numero IMPAR")
"""
"""
#Ejercicio 2
edadAdulto = 18
edadPersona = int(input("Digite su edad: "))
if edadPersona >= edadAdulto:
    print(f"Su edad es {edadPersona}, es mayor de edad")
else:
    print(f"Su edad es {edadPersona}, es menor de edad")
"""
"""
# Operadores logicos

a = True
b = True
resultado = a and b
print(resultado)

#Operador or

resultado = a or b
print(resultado)

# Operador not

resultado = not a
print(resultado)
"""
"""
# Ejercicio valor dentro de un rango
valor = int(input("Digite un numero dentro del rango de 0 a 5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = (valor >= valorMinimo and valor <= valorMaximo)
if dentroRango:
    print(f'El valor {valor} se encuentra dentro del rango')
else:
    print(f'El valor {valor} no se encuentra dentro del rango')
"""
"""
# Ejercicio Or

vacaciones = False
diaLibre = False
if vacaciones or diaLibre:
    print('Puede asistir al juego')
else:
    print('Tiene trabajo, no puede asistir al juego')

# Operador or y not

vacaciones = True
diaLibre = False
if not (vacaciones or diaLibre):
    print('Tiene trabajo, no puede asistir al juego')

else:
    print('Puede asistir al juego')
"""
"""
# Ejercicio rango entre edades 20 y 30 anos.

edad = int(input("Digite su edad: "))
# veinte = edad>= 20 and edad < 30
# print(veinte)
# treinta = edad >= 30 and edad < 40
# print(treinta)

# if veinte or treinta:
if (20 <= edad < 30) or (30 <= edad < 40):
    print('Estas dentro del rango de los (20\'0) a (30\'0)')
#   if veinte:
#       print('Estas dentro del rango de los (20\'0)')
#    elif treinta:
#        print('Estas dentro del rango de los (30\'0)')
else:
    print('No Estas dentro del rango de los (20\'0) a (30\'0)')
"""
"""
# Ejercicio mayor de dos numeros

numero1 = int(input('Digite el valor para numero1: '))
numero2 = int(input('Digite el valor para numero2: '))

if numero1 > numero2:
    print('El numero 1 es mayor')
else:
    print('El numero 2 es mayor')
"""
# Ejercicio datos de libro

print('Digite los siguientes datos del libro: ')
nombre = input('Digite el nombre del libro: ')
id = int(input('Digite el id del libro: '))
precio = float(input('Digite el precio del libro: '))
envioGratuito = input('Indicar si el libro es gratuito (True/False): ')
if envioGratuito == 'True':
    envioGratuito = True
elif envioGratuito == 'False':
    envioGratuito = False
else:
    envioGratuito = 'El valor es incorrecto, introduzca True/False'
print(f'''
 Nombre: {nombre}
 id: {id}
 precio: $ {precio}
 Envio Gratuito?: {envioGratuito}
''')


