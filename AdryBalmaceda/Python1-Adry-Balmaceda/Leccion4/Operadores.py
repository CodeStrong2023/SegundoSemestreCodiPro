"""
# Reutilizacion de variables
miVariable = 3
print(miVariable)
miVariable = "a"
print(miVariable)
# Python subraya las palabras que no estan en ingles
miVariable = "Hola a todos los profes de la Tecnicatura"
print(miVariable)
miVariable = 3.5
# print muestra lo que esta entre parentesis
print(miVariable)
# Literal es el valor que se asigna a las variables
x = 10
y = 2
z = x + y
print(z)
# Funciones: print e id(para mostrar la direccion de memoria donde esta almacenado el valor)
print(id(x))
# Las literales se escriben de la siguiente manera: x320 (los 3 nros ultimos con x adelante)
# ejecutamos de nuevo
# x704 el nro cambio porque el programa finalizo y se borraron los archivos que guardo en la casilla
# son numeros hexagesimales
# A esto se lo conoce como referencia de memoria o referencia
# las literales se escriben: x656, la variable y = x400, la variable z = x720
print(id(y))
print(id(z))
# Tipos int, float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola Profe"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas (String)
miGrupoFavorito = "The Letter Black: "
caracteristicas = "The Best Rock Band"
print("Mi grupo favorito es: ", miGrupoFavorito, caracteristicas)

# numero1 = "7"
# numero2 = "8"
# print(int(numero1) + int(numero2))

# Tipos Booleanos (bool)
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

# Procesar la entrada del usuario
# funcion input
# resultado = input("Digite un numero: ") # regresa un dato tipo string
# print(resultado)

# Conversion de la entrada de datos
numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ", resultado)
"""
##################### Clase 4 #######################
# operador suma
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
# concatenacion
# print("Resultado de la suma: ", suma)

# interpolacion (se usa f para que funcione)
# letra f: formato nos ayuda a incluir la variable suma dentro de una cadena
# así no hace falta concatenar
# es la forma preferida de los programadores
print(f'El resultado de la suma es: {suma}')

# operador resta
resta = operandoA - operandoB
print(f"El resultado de la resta es: {resta}")

# operador multiplicacion
multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicacion es: {multiplicacion}")

# operador division
division = operandoA / operandoB
print(f"El resultado de la division es: {division}")

# para que el resultado sea int
division = operandoA // operandoB
print(f"El resultado de la division (int) es: {division}")

# operador modulo: el resultado es el residuo de la division
modulo = operandoA % operandoB
print(f"El resultado de la division o residuo (modulo) es: {modulo}")

# operador exponente
exponente = operandoA ** operandoB
print(f"El resultado del exponente es: {exponente}")



