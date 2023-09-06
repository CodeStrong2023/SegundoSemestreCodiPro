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
print(nombres)

