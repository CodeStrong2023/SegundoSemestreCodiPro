# listas = Ariel , Liliana , Natalia , Osvaldo

nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres)
print(nombres[0])#El primer item de la lista siempre comienza con Cero
print(nombres[1])
print(nombres[3])
print(nombres[-1]) #Cuando no sabes la cantidad de itens de una lista y queres llamar el ultimo empezas con (-1)
print(nombres[-2])

#SegundoVideo
print(nombres[0:2])#Solo muestra el indice 0, 1 pero no el indice 2
#ir del inicio de la lista al indice (sin incluirlo)
print(nombres[ :3]) #indices a mostrar 0, 1, 2
# desde el indice indicado hasta el final
print(nombres[1: ])

#modificamos un valor

nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)
#Iterar una lista
for nombre in nombres: #nombre es singular, la lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

#Tercer Video
#Preguntamos cuantos elementos tiene
print(len(nombres)) #Le pasamos como parametro la lista
# agregamos un elemento
nombres.append('Marcelo')
print(nombres)

#Incertar un elemento en un indice especifico

nombres.insert(1,'Alberto')
print(nombres)
nombres.insert(3, 'Debora')
print(nombres)

#Eliminar un elemento

nombres.remove('Alberto')
print(nombres)

#Eliminar el ultimo elemento de la lista

nombres.pop()
print(nombres)

#Eliminar un indice especifico

del nombres[2] #del significa eliminar
print(nombres)

#Eliminar, borrar o limpiar todos los elementos
nombres.clear()
print(nombres)

#Eliminar la lista

del nombres
#print(nombres)#aqui nos va a mostrar un error

#definimos una tupla

cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina))

#acceder a un elemento, para esto utilizamos corchetes no parentesis

print(cocina[0])
#mostrar de manera inversa
print(cocina[-1])

#acceder a un rango

print(cocina[0:2])

#ejemplo
verduras = ('papa',) #Una tupla necesita aunque sea  de un elememto: la coma
# de lo contrario solo seria un tipo str cadena

#Recorremos los elementos de una tupla
for cocinar in cocina:#print esta usando \n para saltos de lineas
    print(cocinar, end= ' ') #usamos end= para eliminar los saltos de lineas

cocinaLista = list(cocina)
cocinaLista[0] = ('Plato')
Cocina = tuple(cocinaLista)
print (cocina)
print('\n', cocina)

#del cocina esto es para eliminar una tupla

#tipo set
planetas = {'Marte', 'Júpiter', 'Venus'}
print(len(planetas)) #usamos la funcion len = length significa largo

#revisar si un elemento existe dentro de set
print('Júpiter' in planetas)

#agregar un elemento
planetas.add('Tierra') # add es una funcion
print(planetas)

#Eliminar elementos, puede arrojar error si el elemento no existe
planetas.remove('Júpiter')#esta funcion ante un mal ingreso u inexistencia del elemento da error
print(planetas)
planetas.discard('tierra')# Esta funcion no nos tira error si esta mal escroto
print(planetas)

#Limpiar set o conjunto
planetas.clear()
print(planetas)

# eliminar set o conjunto
del planetas
print(planetas) # al eliminar nos muestra fun error

#Diccionarios en Python\
#'Maradona': 10 Un diccionario esta compuesto por dos elementos
#UNA LLAVE Y UN VALOR
#dict(key,value)
diccionario = {
    'IDE':'Integrated Development Environment',
    'POO':'Programacion Orientadda a Objetos',
    'SABD':'Sistema de Administracion de Base de Datos'
}
#Verificar la cantidad de elementos del diccionario
print(len(diccionario))
print(diccionario)

#Acceder a un diccionario con la llave(key)
print(diccionario['IDE'])

#Otra forma de recuperar un elemento
print(diccionario.get('POO'))
print(diccionario.get('IDE'))
print(diccionario.get('SABD'))

#Modificar elementos
diccionario['IDE'] = 'Entorno de Desarollo Integrado'
print(diccionario)

#Como recorrer los elementos solo MOSTRANDO LAS LLAVES
for termino in diccionario:
    print(termino)

#Necesitamos una funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

#Otras maneras de acceder a un diccionario
for termino in diccionario.keys():
    print(termino) #Muestra SOLO LAS LLAVES

for valor in diccionario.values(): #Usamos una funcion para acceder al valor
    print(valor)

#Comprobamos la existencia de un elemento
print('IDE' in diccionario)

#Agregar un elemento
diccionario['PK'] = 'Primary Key'
print(diccionario)

#Eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

#Vaciar un diccionario
diccionario.clear()
print(diccionario)

#Eliminar diccionario
del diccionario #el diccionariose borro

#Conctatenamos listas

lista1 = [1,2,3,1]
lista2 = [4,5,6,1]
lista3 = lista1 + lista2 #Concatenacion
print(lista3)

lista3.extend([7,8,9,1]) #Funcion para agregar varios elementos a la lista
print(lista3)

#Ubicamos en que indice esta el valor indicadddo
print(lista3.index(5))
#En caso de que no se encuentre el indice indicado, devolvera error

#Como saber cuantos valores repetidos hay en una lista
print(lista3.count(1)) #.count cuenta cuantos valores repetidos hay dentro de la lista

#Para poner una lista al reves
lista3.reverse()
print(lista3)

#Para que una lista se multiplique repitiendo sus elementos
lista3 = lista3 * 2
print(lista3)

#Ordenar una lista de forma ascendente
lista3.sort()
print(lista3)

#De forma descendente
lista3.sort(reverse=True)
print(lista3)

#Repaso de tuplas
#Las tuplas pueden tener distintos datos
tupla = (4,'Hola',1,1.78,[1,2,3], 'Hola')
print(tupla)

print(4 in tupla) #Respuesta booleana

#Repaso del tipo SET
#Definir un conjunto
conjunto = set()
conjunto1 = {'bye'}
conjunto.add(7)
conjunto.add('Hola')
print(conjunto)
conjunto1.add('Hola')
print(conjunto1)
print(3 not in conjunto1) #Preguntamos si wl numero 3 NO esta en el conjunto1

#Como hacer la igualdad con dos conjuntos
print(conjunto == conjunto1) #Nos devuelve como respuesta un booleano

#Operaciones en conjuntos
conjunto3 = conjunto | conjunto1 #La linea une ambos conjuntos
print(conjunto3)

conjunto3 = conjunto & conjunto1 #Comprobamos que elemento tienen en comun y lo guardamos en conjunto3
print(conjunto3)

conjunto3 = conjunto - conjunto1 #Asigna el valor que esta en conjunto1 y no en el conjunto2
print(conjunto3)
conjunto3 = conjunto1 - conjunto
print(conjunto3)

conjunto3 = conjunto ^ conjunto1 #Nos muestra que elemento no comparten ninguno de los dos conjuntos
print(conjunto3)

conjunto3 = conjunto | conjunto1
print(conjunto.issubset(conjunto3)) #Preguntamos si un conjunto es subconjunto de otro
print(conjunto3.issuperset(conjunto)) #Preguntamos si conjunto3 es un superconjunto de conjunto1
# Es decir si los elementos de conjunto 1 estan dentro de conjunto 3

#Como saber si ambos conjuntos son disconexos, esto es si no comparten elementos en comun
print(conjunto.isdisjoint(conjunto1)) #No hay cosas en comun

#Como convertir un conjunto en totalmente inmutable
conjunto = frozenset #Esto lo hace totalmente inmutable
#No se le puede agregar o quitar elementos o eliminar el conjunto

#Repaso Diccionarios
DiccionarioNuevo = {'Azul': 'Blue', 'Rojo': 'Red', 'Verde': 'Green', 'Amarillo': 'Yellow'}
print(DiccionarioNuevo)

#Como eliminar
del (DiccionarioNuevo['Azul'])
print(DiccionarioNuevo)

#Los diccionarios pueden almacenar distintos tipo de datos
diccionario2 = {'Ariel':{'Edad': 40, 'Altura': 1.83}, 'Osvaldo': [45, 1.85], 'Natalia': [35, 1.67]}
print(diccionario2)

seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 millones', 'Posicion': 'Extremo derecho'},
    11: {'Nombre': 'Angel Di Maria', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 millones', 'Posicion': 'Extremo derecho'},
    21: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 millones', 'Posicion': 'Media Punta'},
    19: {'Nombre': 'Nicolas Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 millones', 'Posicion': 'Defensa central'},
    1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3.5 millones', 'Posicion': 'Portero'},
    40: {'Nombre': 'Walter Benítez', 'Edad': 30, 'Altura': 1.91, 'Precio': '12 millones', 'Posicion': 'Portero'},
    20: {'Nombre': 'Alan Velasco', 'Edad': 21, 'Altura': 1.68, 'Precio': '2 millones', 'Posicion': 'Extremo izquierdo'},
    32: {'Nombre': 'Leandro Paredes', 'Edad': 29, 'Altura': 1.84, 'Precio': '12 millones', 'Posicion': 'Centro'},
}
for llave, valor in seleccionArgentina.items():
    print(llave, valor)

# Como tarea agregar por lo menos 4 jugadores mas al diccionario: seleccionArgentina
print('Tenemos cargados en el diccionario la cantidad de: ', end=' ')
print(len(seleccionArgentina))

# Pilas usando listas
pila = [1,2,3]

#Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

#Sacamos elementos desde el final
elementoBorrado = pila.pop() #Quita el elemento y lo almacena en la variable indicada
print(pila)
print(elementoBorrado)
print(f'Sacamos el elemento {elementoBorrado}')
print(f'La pila ahora quedo asi:{pila}')

#Colas en la lista
#Estructura de datos fifo (first input / first output)
cola = ['Ariel', 'Osvaldo', 'Liliana', 'Pilar']

#Agregamos elemento al FINAL de la fila
cola.append('Natalia')
cola.append('Joseju')
print(cola)

#Sacamos elementos de la cola
seRetira = cola.pop(0) #Dentro de las parentesis indicamos el indice del elemento que se retira
print(f'Se atendio al cliente {seRetira}')
print(f'La cola queda de la siguiente manera: {cola}')

#Repetimos el proceso para que la cola avance
seRetira = cola.pop(0)
print(f'Se atendio al cliente {seRetira}')
print(f'La cola queda de la siguiente manera: {cola}')

#Mostramos otra forma de mostrar el diccionario ccon el ciclo for
for i in seleccionArgentina:
    print(f'{i} -> {seleccionArgentina[i]}')