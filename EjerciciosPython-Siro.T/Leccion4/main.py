# Lista: Siro, Ari, Lauti.

nombres = ['Ari', 'Lauti', 'Siro']
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[2])
print(nombres[-1]) #Muestra el ultimo elemento,y con los numeros negativos recorremos el indice de la lista

print(nombres[0:2]) #Muestra el elemento desde la posicion del indicie que le indiquemos.
print (nombres[ :2]) #Toma automaticamente el primero
print(nombres[1: ])#Indicamos que imprima del indice 1 al ultimo.

#Modificamos un valor

nombres[0] = 'Jose Juan'
nombres[2] = 'Jose Luis'
print(nombres)

#Iterar una lista
for nombre in nombres: #Nombre es singular, la lista es plural.
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

#Preguntamos cuantos elementos tiene la lista
print(len(nombres)) #Le pasamos como parametro la lista

#Agregamos un elemento
nombres.append('Paco')
nombres.append([1,2,3])
nombres.append(True)
nombres.append(10.45)
print(nombres)

#Insertar un elemento en un indice especifico
nombres.insert(4, 'Roberto')
print(nombres)
nombres.insert(5, 'Debora')
print(nombres)

#Eliminamos un elemento de la lista
nombres.remove('Roberto')
print(nombre)

#Eliminamos el ULTIMO elemento de la lista (no el el ultimo ingresado)
nombres.pop()
print(nombres)

#Eliminamos un indice especifico
del nombres[1]
print(nombres)

#Eliminar todos los elementos

nombres.clear()
print(nombres)

#Eliminar lista
del nombres
print(nombres)
