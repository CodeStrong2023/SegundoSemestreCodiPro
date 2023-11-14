# lista = Ariel, Liliana, Natalia, Osvaldo
#Colecciones en Python

#Las listas es lo que se conoce en otros lenguajes como arreglos o vectores
nombres = ["Naty", "Osvaldo", "Lily", "Ariel"]
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-1])
print(nombres[-2])
print(nombres[0:2])  # Solo muestra el indice 0,1 pero no el indice 2
# Ir del inicio de la lista al indice (sin incluirlo)
print(nombres[:3])  # Indices a mostrar 0,1 y 2
# Desde el indice indicado hasta el final
print(nombres[1:])
# Modificamos un valor
nombres[3] = "Liliana"
nombres[0] = "Natalia"
print(nombres)
# Iterar una lista
for nombre in nombres:  # nombre es singular, la lista es plural
    print(nombre, end = " ")
else:
    print("")
    print("Se acabaron los elementos de la lista")

# Preguntamos cuantos elementos tiene
print(len(nombres))  # Le pasamos como parámetro la lista

# Agregamos un elemento
nombres.append("Marcelo")
nombres.append([1,2,3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4,5])
nombres.append(6)
print(nombres)

# Insertar un elemento en un indice especifico
nombres.insert(1, "Alberto")
print(nombres)
nombres.insert(3, "Debora")
print(nombres)

# Eliminamos un elemento
nombres.remove("Alberto")
print(nombres)

# Eliminar el ultimo elemento
nombres.pop()
print(nombres)

# Eliminar un indice especifo
del nombres[2]  # Eliminamos un indice especifico
print(nombres)

# Eliminar, borrar o limpiar todos los elementos de la lista
nombres.clear()
print(nombres)

# Eliminar la lista
del nombres
#print(nombres)#Aquí nos tirará un error

print("Rango de 0 a 10 con números divisibles entre 3")

for i in range(11):
    if i % 3 == 0:
        print(i)

print("Rango con valores de inicio 2 y fin 6")

for i in range(7):
    if i > 1:
        print(i)

print("Rango con valores de inicio 3, fin 10, incremento en 2")

rango = range(3,11,2)
for i in rango:
    print(i)

# Definimos una tupla
cocina = ("Cuchara","cuchillo","tenedor")
print(cocina)
print(len(cocina))

#Acceder a un elemento, se utilizan corchetes
print(cocina[0])
#Ahora de manera inversa
print(cocina[-1])

#Acceder a un rango
print(cocina[0:1])
#Ejemplo
verduras = ("Papa") #NO es una tupla, es un tipo string, la tupla necesita de un elemento, la coma

#Recorremos los elementos de la tupla

for cocinar in cocina: #Print está usando \n para saltos de líneas
    print(cocinar, end =" ") #Usamos end= para eliminar los saltos de linea

cocinaLista = list(cocina) #Conversión de tupla a lista
cocinaLista[0] = "plato" #Modificación
cocina = tuple(cocinaLista) #Conversión de lista a tupla
print("\n",cocina)

# del cocina Eliminamos la tupla

#Dada la siguiente tupla
tupla = (13,1,8,3,2,5,8) #Definimos la tupla
#Crear una lista que solo incluya los números menores a 5 e imprima por consola (1,3,2)

lista = [13,1,8,3,2,5,8]
for lista in tupla:
    if lista < 5:
      print(lista)

lista = []
for elementos in tupla:
    if elementos < 5:
        lista.append(elementos)
print(lista)

#Tipo Set
planetas = {"Marte", "Jupiter","Venus"}
print(len(planetas)) #Usamos la función len = lenght significa largo

#Revisar si un elemento existe dentro de set
print("Marte" not in planetas)

#Agregar un elemento a set
planetas.add("Tierra") #add es una función
print(planetas)

#Eliminar un elemento, puede arrojar un error si el elemento no existe
planetas.remove("Jupiter") #Arroja error si un elemento está mal ingresado
print(planetas)
planetas.discard("Tierra") #También elimina pero no arroja error
print(planetas)

#Limpiar set
planetas.clear()
print(planetas)

#Eliminar set o conjunto
del planetas #al eliminar nos muestra un error

# "Maradona":10 Un diccionario está compuesto por dos elementos
#UNA LLAVE Y UN VALOR
#dict(key,value)
diccionario = {
    "IDE" : "Integrated Development Environment",
    "POO" : "Programación Orientada a Objetos",
    "SABD": "Sistema de Administración de Base de Datos"
}

#Verificar la cantidad de elementos del diccionario
print(len(diccionario))
print(diccionario)

#Acceder a un diccionario con la llave (key)
print(diccionario["IDE"])

#Otra forma de recuperar un elemento
print(diccionario.get("POO"))
print(diccionario.get("SABD"))

#Modificamos elementos, es decir un diccionario puede ser modificado
diccionario["IDE"] = "Entorno de Desarrollo Integrado"
print(diccionario)

#Como recorrer los elementos
for termino in diccionario: #Recorremos mostrando solo las llaves
    print(termino)

#Se utiliza una función para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino,valor)

#Otras maneras de acceder a un diccionario:
for termino in diccionario.keys():
    print(termino)#Solo muestra las llaves

for valor in diccionario.values():
    print(valor)#Muestra los valores sin las llaves

#Comprobar la existencia de algún elemento
print("IDE" in diccionario)

#Agregar un elemento
diccionario["PK"] = "Primary key"
print(diccionario)

#Eliminar un elemento
diccionario.pop("SABD")
print(diccionario)

#Vaciar un diccionario
diccionario.clear()
print(diccionario)

#Eliminar diccionario
del diccionario #también muestra error al eliminarlo

#Concatenamos lista
lista1 = [1,2,3,1]
lista2= [4,5,6,1]
lista3= lista1+lista2
print(lista3)

#Función para agregar varios elementos a una lista
lista3.extend([7,8,9,1])
print(lista3)

#Función para saber en que índice se encuentra un elemento
print(lista3.index(5))
# print(lista3.index(0)) esto daría un error ya que el elemento no se encuentra en la lista

#Como saber cuantos valores repetidos hay dentro de una lista
print(lista3.count(1)) #Cuenta cuantos valores iguales hay dentro de la lista

#Para poner al revés una lista
lista3.reverse()
print(lista3)

#Para que una lista se multiplique repitiendo sus elementos
lista = lista3 * 2
print(lista)

#Métodos de ordenamiento en Python
lista3.sort() #Ordena los elementos ascendentemente
print(lista3)
lista3.sort(reverse=True) #Ordena los elementos descendentemente
print(lista3)

tupla = (4,"Hola", 6.78, [1,2,78],4,"Hola") #Puede tener diferentes tipos de datos dentro
print(tupla)

print(4 in tupla) #Acción booleana
#Lo que podemos usar dentro de tuplas son: index, count, len
#En tupla se pueden convertir de lista a tupla y de tupla a lista

print(len(tupla))
print(tupla.count(2))
print(tupla.index("Hola"))

#Repaso de set o conjunto
# para definir un conjunto
conjunto2 = set()
conjunto1 = {"bye",}
conjunto2.add(7)
conjunto2.add("Hola")
print(conjunto2)
conjunto1.add("Hola")
print(conjunto1)
print(not 3 in conjunto1)# Preguntamos si el numero 3 no está en el conjunto 1, devuelve BOL

#Como hacer la igualdad de dos conjuntos
print(conjunto2 == conjunto1) #Nos devuelve como respuesta un booleano

#Operaciones en conjuntos
conjunto3= conjunto1 | conjunto2 #La linea une los dos conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto2 #Que elemento tienen en comun
print(conjunto3)

conjunto3 = conjunto1 - conjunto2 #Asigna el valor que está en el conjunto 1 y no en el 2
print(conjunto3)

conjunto3= conjunto2 -conjunto1
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2 #Elementos que no comparten o son diferentes entre ambos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto1.issubset(conjunto3)) #Preguntamos si un conjunto es subconjunto dentro de otro
print(conjunto2.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

print(conjunto3.issuperset(conjunto1)) #Preguntamos si los elementos del conjunto1 están dentro del 3
print(conjunto3.issuperset(conjunto2)) #Si es verdadero quiere decir que el conjunto3 es un superconjunto
print(conjunto2.issuperset(conjunto3))

#Como saber si ambos conjuntos son disconexos, es decir si no comparten elementos en comun
print(conjunto1.isdisjoint(conjunto2)) #No hay

#Convertir un conjunto totalmente en inmutable
conjunto1 = frozenset #Esto hace que el conjunto sea inmutable, no se puede tocar

#Repaso Diccionarios
diccionarioNuevo = {"Azul": "Blue", "Rojo": "Red", "Verde": "Green", "Amarillo": "Yellow"}
print(diccionarioNuevo)

#Como eliminar
del (diccionarioNuevo["Azul"])
print(diccionarioNuevo)

#Los diccionarios pueden almacenar distintos tipos de datos
diccionario2 = {"Ariel": {"Edad":40, "Altura":1.83}, "Osvaldo": [45,1.85], "Natalia": [35,1.67]}
print(diccionario2)

seleccionArgentina = {
    10: {"Nombre": "Lionel Messi", "Edad":36, "Altura":1.70, "Precio": "50 millones", "Posición": "Extremo Derecho"},
    11: {"Nombre": "Angel Di Maria", "Edad":35, "Altura":1.78, "Precio":"12 millones", "Posición": "Extremo Derecho"},
    19: {"Nombre": "Nicolás Otamendi", "Edad":35, "Altura":1.83, "Precio":"2.5 millones", "Posición": "Defensor Central"},
    24: {"Nombre": "Paulo Dybala", "Edad":29, "Altura":1.77, "Precio":"35 millones", "Posición": "Media Punta"}
}
for llave, valor in seleccionArgentina.items():
    print(llave,valor)

print("Tenemos agregados la cantidad de jugadores: ", end="")
print(len(seleccionArgentina))

#Pilas usando listas
pila= [1,2,3]

#Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

#Sacamos elementos desde el final
elementoBorrado = pila.pop() #Quita el último elemento y lo guarda en la variable
print(f"Sacamos el elemento {elementoBorrado}")
print(f"La pila ahora queda así: {pila}")

#Colas con listas
#Estructura de datos de tipo fifo (first input/first outpot)
cola = ["Ariel","Osvaldo","Liliana","Pilar"]

#Agregamos elementos al final de la cola
cola.append("Natalia")
cola.append("Jose")
print(cola)

#Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f"Se retira el cliente {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Se retira el cliente {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Se retira el cliente {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Se retira el cliente {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Se retira el cliente {seRetira}")
print(cola)