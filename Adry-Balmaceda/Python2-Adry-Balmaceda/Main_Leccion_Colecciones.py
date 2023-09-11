# Clase Colecciones en Python
# lista = Ariel, Liliana, Natalia, Osvaldo
# creamos una variable que almacena una referencia
nombres = ['Naty','Osvaldo','Lily','Ariel']
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])

print(nombres[-1])
print(nombres[-2])
# manera inversa para recorrer la lista desde el ultimo al primero

print(nombres[0:2])
# solo muestra el indice 0, 1 pero no el indice 2

# ir del inicio de la lista al indice (sin incluirlo)
print(nombres[:3])
# indices a mmostrar 0,1,2

# Desde el indice indicado hasta el final
print(nombres[1:])

# Modificamos un valor
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)

#Iterar una lista
for nombre in nombres:  # nombre es singular, la lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

# Preguntamos cuantos elementos tiene
print(len(nombres))   # le pasamos como parametro la lista

# Agregamos un elemento
nombres.append('Marcelo')
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4, 5])
nombres.append(7)
print(nombres)

# Insertar un elemento en un indice especifico
nombres.insert(1, 'Alberto')
print(nombres)
nombres.insert(3, 'Debora')
print(nombres)

# Eliminar un elemento
nombres.remove('Alberto')
print(nombres)

# Eliminar el ultimo elemento (posicion) NO el ultimo ingresado
nombres.pop()
print(nombres)

# Eliminar un indice especifico
del nombres[2]   # del significa delete (eliminar)
print(nombres)

# Eliminar, borrar o limpiar todos los elementos (lista vacia)
nombres.clear()
print(nombres)

# Eliminar la lista (se borra la lista y da error)
del nombres
# print(nombres) # aquí muestra error

# GIT
# Verificar como trabajar dia a dia en Git
# Verificar que estemos trabajando en nuestra rama
# Git checkout + nombre rama
# Una vez realizados los cambios:
# Git status
# Git reset
# Git status
# Git checkout master
# Git restore + ruta del archivo para eliminar archivo
# Git status
# Git reset
# Git restore + ruta del archivo para eliminar archivo
# Git checkout master para cambiar de rama
# Git status para ver el cambio visible

# LISTAS
# Mantienen un orden
# Son modificables o mutables
# 3 funciones: append, insert, remov, pop, clear, del (delete)
# No todas estas funciones se pueden aplicar en tuplas

# TUPLAS 1: #
# Mantienen el orden de los elementos pero no se pueden eliminar
# Son inmutables e inmodificables
# Definimos una tupla
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina))

# Cómo acceder a un elemento, p/ ésto usamos corchetes no paréntesis
print(cocina[0])

# Mostrar de manera inversa
print(cocina[-1])  # [2] para mostrar cuchillo

# Cómo acceder a un rango
print(cocina[0:1])

# Ejemplo
verduras = ('papa',)  # Sino hay coma no es tupla es una cadena tipo string
# Necesita coma para que sea tupla y no tipo string
# Aunque sea de un elemento necesita coma

# GIT
# Controlar que estemos trabajando en rama master

# TUPLAS 2:
# Recorrer elementos de la tupla
for cocinar in cocina:
    print(cocinar, end=' ')
# Cada vez que ejecuta hace un salto de linea \n
# Con end = 'con espacio' no hara el salto de linea

# Para modificar una tupla hay que hacer conversion a lista
# cocina[0] = 'plato' # este ejemplo esta mal

# No es una buena practica convertir de tupla a lista y de lista a tupla
# Debemos considerar si nuestro programa sera modificable:
# entonces usaremos una lista
# Y si nuestro programa no es modificable usaremos tupla

# Ejemplo de conversión:
cocinaLista = list(cocina)
cocinaLista[0] = 'Plato'
cocina = tuple(cocinaLista)
print('\n', cocina)

# Para eliminar tupla y dará error más arriba
# Ejemplo:
# del cocina
print(cocina)

# SET
# Conexión de tipo Set o Conjunto
# No mantiene un orden
# No permite almacenar elementos
# No se puede modificar pero si agregar o eliminar
# No es completamente mutable ni completamente inmutable
# No mantiene ningun indice
# Cuando mandamos a imprimir el orden es completamente aleatorio
# Porque no indice donde apoyarnos y ordenar los elementos
# Un elemento de tipo set es una conexion sin orden y sin indice

planetas = {'Marte', 'Jupiter', 'Venus'}
print(planetas)
print(len(planetas))  # Muestra la cantidad de elementos del conjunto
# Función len = length significa largo

# Revisar si un elemento existe dentro de set
print('Marte' in planetas)  # Respuesta True
print('Martes'in planetas)  # Respuesta False
# Los elementos tienen que ser identicos (inclusive tildes) para ser True
print('Júpite' in planetas)

# Agregar un elemento
planetas.add('Tierra')  # Add es una funcion
# Si agregamos un elemento duplicado no se imprime y no lo veremos
planetas.add('Tierra')
# No hace ningun efecto o cambio cuando se imprime
planetas.add('Tierra')
print(planetas)
# La conexion de tipo Set nos sirve para evitar elementos duplicados
# en una lista de datos
# Ejemplos:
# n° de documentos, nombre y apellidos de una persona, matriculas de vehiculos

# Eliminar elementos, puede arrojar error si el elemento no existe
planetas.remove('Jupiter')
# planetas.remove('Martes')  # Da error porque el elemento no existe
print(planetas)

# Otra funcion
# Si ingresamos mal el elemento no da error
planetas.discard('tierra')
planetas.discard('Tierra')
print(planetas)

# Limpiar set
planetas.clear()
print(planetas)

# Eliminar set o conjunto
del planetas
# print(planetas)  # Al imprimirlo da error

# DICCIONARIOS
# En vez de lista tendremos una coleccion de elementos
# organizados de una manera particular
# Cómo se organiza un diccionario:
# 'Maradona':10 los dos elementos son un conjunto, LLAVE Y VALOR
# Maradona es tipo cadena y 10 es un valor tipo numerico
# Un diccionario esta compuesto por dos elementos
# UNA LLAVE Y UN VALOR
# dict(key,value)
diccionario = {
    'IDE':'Integrated Development Enviroment',
    'POO':'Programacion Orientada a Objetos',
    'SABD':'Sistema de Administracion de Base de Datos'
}
print(diccionario)
print(len(diccionario))  # Nos dice que hay 3 elementos, es para verificar la cantidad

# herramienta ctrl+z para volver atras cuando nos equivocamos

# Diccionario: se parece a un tipo Set porque no hay indice
# Podemos acceder al diccionario desde las llaves

# Cómo acceder a un diccionario con la llave(key)
print(diccionario['IDE'])
# Cuidado como escribimos, los datos deben ser precisos

# Otra forma de recuperar un elemento
# Funcion .get
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificar elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)
# Un diccionario puede modificarse

# Cómo recorrer los elementos
for termino in diccionario:  # Recorremos mostrando solo las llaves
    print(termino)

# Necesitamos una funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys():
    print(termino)  # Muestra solo las llaves

for valor in diccionario.values():  #  Usamos una funcion para acceder al valor
    print(valor)

# Comprobar la existencia de algun elemento
print('IDE' in diccionario)  # devuelve un booleano

# Agregar un elemento
diccionario['PK'] = 'Primary key'
print(diccionario)

# Eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar diccionario
del diccionario  # el diccionario se borro

# Concatenamos listas
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1+lista2  # concatenacion
print(lista3)

# Funcion extend para agregar varios elementos a una lista
lista3.extend([7, 8, 9, 1])
print(lista3)

# Funcion index para saber en que indice esta un elemento
# Sirve para ubicar en que indice esta el valor ingresado
print(lista3.index(5))
# Si le colocamos 0 daria error por no ser un elemento parte de la lista

# Como saber cuantos valores repetidos hay dentro de una lista
print(lista3.count(1))  # cuenta cuantos valores iguales hay dentro de la lista

# Para poner al reves una lista
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista3 = lista3 * 2
print(lista3)

# Metodos de ordenamiento, en Python es una funcion
lista3.sort()  # ordena los elementos ascendentemente
print(lista3)
lista3.sort(reverse=True)  # ordena descendentemente
print(lista3)

# Repaso de TUPLAS
# En tuplas se puede convertir de listas a tuplas y tuplas a listas
tupla = (4, 'Hola', 6.78, [1, 2, 78], 4, 'Hola')
print(tupla)

# Podemos buscar un elemento
print(4 in tupla)  # accion booleana, respuesta de tipo booleana
# Podemos usar: index, count, len

# Repaso de SET o conjunto
# para definir un conjunto
conjunto = set()
conjunto2 = set()
conjunto1 = {'bye', }  # tiene que tener un elemento dentro
# para poder añadir con la funcion add
conjunto2.add(7)
conjunto2.add('Hola')
# Conjunto: grupo de elementos desordenados
# Ppal caracteristica: no pueden haber duplicados, hay valores unicos
# Puede tener diferentes tipos de datos
# Funcion Add para agregar elementos, de a un elemento
conjunto.add(7)
conjunto.add('Hola')
print(conjunto)
# La funcion extend: no se puede usar para conjuntos
# No se pueden agregar varios elementos al mismo tiempo en un conjunto
# Funcion Add para {} necesita inicializar al menos con un elemento
conjunto1.add('Hola')
print(conjunto1)
print(3 not in conjunto1)  # pregunta si 3 NO esta en el conjunto1

# Como hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto2)  # nos devuelve como respuesta un booleano

