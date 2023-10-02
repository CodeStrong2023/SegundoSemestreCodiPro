#Comenzamos con funciones
#mi_funcion()      No se puede llamar antes de definirla
#Definimos una función
def mi_funcion(): #Para identificar a la función usamos parentesis
    print("Saludo a todos los alumnos de la tecnicatura")

mi_funcion() #Estamos llamando a la función
mi_funcion()  #Se puede llamar N cantidad de veces

#Desempaquetado de listas o list unpacking
def show(Name,lastName):
    print(Name+ " "+lastName)
person= ["Ariel","Betancud"] #Lista
show(person[0],person[1]) #Pasamos uno por uno los datos de la lista a la función
show(*person) #En este caso hacemos lo mismo pero le pasamos todo junto
person2 = ("Osvaldo","Giordanini") #Desempaquetamos a través de una tupla
show(*person2)
person3 = {"lastName": "Lucero", "Name": "Natalia"} #Desempaquetamos a través de un diccionario
show(**person3)

numbers = [1,2,3,4,5] #Aún con la lista vacía se muestra el else
for n in numbers:
    print(n)
    if n == 5:
        break #Esta es la única manera en que no se muestre el else
else:
    print("Esto se termina")

#List comprehension, lista de comprensión
names = ["Paolo","Rodrigo","Lupe","Pepe"]
alongP = [p for p in names if p[0] == "P"] #Esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belgium"},
           ]
Arg = [b for b in bottleC if b["country"]=="Arg"]
print(Arg)
print(bottleC)

#Paso de Argumentos (funciones)
def mi_funcion2(name, lastName):
    print("Saludos a todos los que ven a través del canal de YouTube")
    print(f"Nombre: {name}, Apellido: {lastName}")
mi_funcion2("Jorge","Lucero")
mi_funcion2("Ariel", "Betancud")
mi_funcion2("Analia", "Pedrosa")

#La palabra return en funciones
#Creamos una función para sumar
def sumar(a,b):
    return a+b
#resultado = sumar(78,22)
#print(f"El resultado de la suma es: {resultado}")
print(f"El resultado de la suma es: {sumar(55,45)}")

def sumar2(a = 0,b=0): #Le damos un valor por default
    return a+b
resultado = sumar2()
print(f"Resultado de la suma: {resultado}")
print(f"Resultado de la suma: {sumar2(66,22)}")

#Argumentos, variables en funciones
def listarNombres(*nombres): #Normalmente se utiliza *args
    for nombre in nombres: #Se va a convertir en una tupla
        print(nombre)
listarNombres("Lucas","Jose","Claudia","Rosa","Maria")
listarNombres("Marcos","Daniel","Romina","Pepe","Marcela","Carlos")