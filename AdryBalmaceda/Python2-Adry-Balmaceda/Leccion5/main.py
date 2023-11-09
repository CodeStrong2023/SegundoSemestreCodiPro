 # Funciones
# Necesitan ser llamadas para que se use el codigo de la funcion

# mi_funcion() # no se puede llamar antes de definir una funcion

# 1 definir una funcion, usaremos estilo de escritura snake_case
def mi_funcion():  # para identificar la funcion se usa parentesis
    print('Saludos a todos los profesores de la Tecnicactura')

mi_funcion()  # estamos llamando a la funcion y se puede llamar n cantidad de veces
mi_funcion()

# Desempaquetado de listas o list Unpacking
def show(name, lastName):
    print(name+' '+lastName)
person = ['Anselmo', 'Linares']
show(person[0], person[1])  # pasamos uno por uno los datos de la lista a la funcion
show(*person)  # esto es lo mismo que lo anterior pero le pasamos todo junto
person2 = ('Antonio', 'Figueras')  # desempaquetamos a traves de una tupla
show(*person2)
person3 = {'lastName': 'Aldi', 'name': 'Facundo'}
show(**person3)

numbers = [1,2,3,4,5]
for n in numbers:
    print(n)
    if n == 3:
        break  # esta es la unica manera para que no se ejecute el else
else:  # el else siempre se ejecuta si no esta break
    print('Este ciclo se termino')

# List comprehension, lista de comprension
names = ['Paolo', 'Rodrigo', 'Lupe', 'Pepe']
alongP = [p for p in names if p[0] == 'P']  # esto regresa una nueva lista donde se guarda alongP
print(alongP)

bottleC = [{'name': 'Quilmes', 'country': 'Arg'},
           {'name': 'Corona', 'country': 'Mx'},
           {'name': 'Stella Artois', 'country': 'Belgium'}]
Arg = [b for b in bottleC if b['country'] == 'Arg']
print(Arg)
print(bottleC)

# Paso de Argumentos (funciones)
def mi_funcion2(name, lastName):
    print('Saludos a todos los compañeros de clase de la UTN')
    print(f'Nombre: {name}, Apellido: {lastName}')
mi_funcion2('Lucia', 'Vasquez')
mi_funcion2('Victor', 'Peña')
mi_funcion2('Noelia', 'Sanchez')

# La palabra return en funciones
# Creamos una funcion para sumar
def sumar(a, b):
    return a + b
resultado = sumar(78, 22)
# print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(55, 45)}')

def sumar2(a:int = 0, b:int = 0)-> int:  # le damos un valor por default
    return a + b
resultado = sumar2()
print(f'Resultado de la suma: {resultado}')
print(f'Resultado de la suma: {sumar2(22, 66)}')

# Argumentos, variables en funciones
def listarNombres(*nombres):  # Normalmente se utiliza: *args
    for nombre in nombres:  # se va a convertir en una tupla
        print(nombre)
listarNombres('Lucas', 'Jose', 'Claudia', 'Rosa', 'Maria')
listarNombres('Marcos', 'Daniel', 'Romina', 'Pepe', 'Marcela', 'Carlos')

def listarTerminos(**terminos):  # lo mas utilizado es **kwargs para recibir argumentos
    for llave, valor in terminos.items():  # kwargs significa: key word argument
        print(f'{llave} : {valor}')

listarTerminos()  # no recibe nada, nada se va a mostrar
listarTerminos(IDE='Integrated Development Environment', PK='Primary Key')
listarTerminos(Nombre='Leonel Messi')

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ['Tito', 'Pedro', 'Carlos']
desplegarNombres(nombres2)
desplegarNombres('Carla')
# desplegarNombres(10, 11)  # no es un objeto iterable
desplegarNombres((10, 11))  # la convertimos a una tupla
desplegarNombres([22, 55])  # la convertimos en una lista

# Funciones Recursivas
def factorial(numero):
    if numero == 1:  # caso Base
        return 1
    else:
        return numero * factorial(numero-1)  # caso Recursivo
numeroFactorial = int(input('Digite el numero para calcular el factorial: '))  # ejemplo tarea
# resultado = factorial(5)  # lo hacemos en codigo duro
resultado = factorial(numeroFactorial)  # ejemplo tarea
print(f'El factorial del numero es: {resultado}')

# Tarea: que el usuario ingrese el numero para calcular el factorial
# Otro ejemplo para comprobar el factorial
numero = int(input('Digite un numero: '))
while numero < 0:
    numero = int(input('Digite un numero mayor a 0: '))
factorial = 1  # inicializar en 1 para que haga el calculo
for i in range(1,numero+1):
    factorial *= i
print(f'\nEl factorial del numero {numero} ingresado es: {factorial} \nFACTORIAL COMPROBADO')