#Ejercicio 2: Modificar los elementos de una lista
#Llenar una lista con los números del 1 al 10, luego modificar los
#elementos de una lista multiplicandolos por un valor ingresado por el usuario

#lista = list(range(1,11))
#print("Lista completa")
#for i in lista:
    #print(i,end="-")

lista = []
i = 1
while i <= 10:
    lista.append(i)
    i +=1
for i in lista:
    print(i,end="-")

valor = int(input("\nIngrese un valor a multiplicar: "))
#Multiplicamos los elementos de la lista
for indice, i in enumerate(lista): #Función para modificar los indices de la lista
    lista[indice] *= valor

print(f"Lista final con los elementos multiplicados por: {valor}")

for i in lista:
    print(i,end="-")