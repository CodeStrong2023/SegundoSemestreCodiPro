# lista = Ariel, Liliana, Natalia, Osvaldo

nombres = ["Naty","Osvlado", "Lily", "Ariel"]
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-1])
print(nombres[-2])

print(nombres[0:2])

print(nombres[ :3])
print(nombres[1: ])

nombres[2] = "Liliana"
nombres[0] = "Natalia"
print(nombres)
#Iterar nuestra lista
for nombre in nombres:
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")


print(len(nombres))

#Agregamos un elemento a nuestra lista
nombres.append("Marcelo")
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4, 5])
nombres.append(7)
print(nombres)

nombres.insert(1,"Alberto")
print(nombres)
nombres.insert(3, "Debora")
print(nombres)


nombres.remove("Alberto")
print(nombres)

nombres.pop()
del nombres [2] 
print(nombres)

print(nombres)

nombres.clear()
print(nombres)

del nombres
print(nombres)

