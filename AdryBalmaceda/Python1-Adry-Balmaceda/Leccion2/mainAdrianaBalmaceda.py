# Sintaxis y semantica en Python
# Las variables en Python son dinamicas
# Python es un lenguaje orientado a objetos = clases
a = 10
print(a)
a = "Hola Profes"
# para mostrar el tipo de dato que tiene nuestra variable
print(type(a))
# podemos poner pistas del tipo de dato necesario como una referencia
a: str = 10
print(type(a))
a = 10.78
print(type(a))
# Literales tipo booleanas
a = True  # Se pone en mayuscula para que no de error
print(type(a))
a = False
print(type(a))
a = "******************Tipos*******************"
print(a)
# Tipos int, float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola amigos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))
x = "******************Cadenas Concatenacion********************"
print(x)
# Manejo de cadenas (String)
miGrupoFavorito = "Coldplay: " + " " + "la mejor banda del mundo"
print(miGrupoFavorito)
# Concatenacion
print("Mi grupo favorito es: " + miGrupoFavorito)
miGrupoFavorito = "Coldplay:"
caracteristicas = " actualmente es la mejor banda del mundo"
print("Mi grupo favorito es: " + miGrupoFavorito + caracteristicas)
print("Mi grupo favorito es: ", miGrupoFavorito, caracteristicas)

numero1 = "7"
numero2 = "8"
print(numero1 + numero2)
# conversion a entero para sumar, si fueran letras daria error
print(int(numero1) + int(numero2))

x = "*********************Tipos booleanos**********************"
print(x)
# Tipos Booleanos (bool)
miBooleano = False
print(miBooleano)
miBooleano = 1 > 2
print(miBooleano)
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

x = "********************Entrada Usuario********************"
print(x)
# Procesar la entrada del usuario
# Codigo duro: es cuando hemos asignado los valores
# funcion input:
# regresa un dato tipo String
resultado = input("Digite un numero: ")
print(resultado)
x = "********************Conversion Entrada Datos*******************"
print(x)
# Conversion de la entrada de datos
# El dato tipo cadena que entra el usuario lo transforma a tipo entero
numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ", resultado)

x = "***********************Ejercicio1*******************************"
print(x)
calificacionDia = input("¿Cómo estuvo tu día (1 al 10)?: ")
print("Mi día estuvo de: " + calificacionDia)

x = "***********************Ejercicio2*******************************"
print(x)
titulo = input("Proporciona el titulo: ")
autor = input("Proporciona el autor: ")
print(titulo + " fue escrito por " + autor)

titulo = input("Proporciona el titulo: ")
autor = input("Proporciona el autor: ")
print(titulo + " fue escrito por " + autor)








