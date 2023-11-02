#Ejercicio 10: No repetir caracteres
# Hacer un programa que pida una cadena por teclado, luego
# meter los caracteres en una lista sin repetir caracteres
cadena = input("Dijite una Ccadena: ")
lista = []
for i in cadena:
    if i not in lista: #si el caracter no esta aun en la lista
        lista.append(i) # Lo agregamos a la lista
print(f"\nLista de caracteres sin repetir ninguno: \n {lista}")


# Ejercicio 11: Agenda telefonica
# Hacer un origrama que simule una agenda de contactos. Crear un
#diccionario donde la clave sea en nombre del usuario y el valor
# sea el telefono, el programa tendra el siguiente menu de opciones:
#       1. Nuevo contacto
#       2. Borrar contacto
#       3. Ver contacto
#       4. Salir
agenda = {}
while True:
    print('\t.:MENU:.')
    print('1. Nuevo contacto')
    print('2. Borrar contacto')
    print('3. Ver contactos existentes')
    print('4. Salir')
    opcion = int(input('Digite una opcion del menu: '))
    if opcion == 1:
        nombre = input('Digite el nombre del contacto: ')
        telefono = input('Digite el numero del contacto: ')
        if nombre not in agenda:
            agenda[nombre] = telefono
            print('contacto agregado exitosamente!')
        else:
            print('Este nombre ya existe')
    elif opcion == 2:
        nombre = input('cual es el nombre del contacto')
        if nombre in agenda:
            del  (agenda[nombre])
            print('Se ha eliminado el contacto requerido')
        else:
            print('Este contacto no existe en la agenda')
    elif opcion == 3:
        print('agenda de comtactos')
        for clave, valor in agenda.items():
            print(f'Nombre: {clave}, Telefono: {valor}')
    elif opcion == 4:
        print('Gracias por utilizar su agenda de contactos')
        break
    else:
        print('Se equivoco de opcion de menu')
    print()

# Ejercicio 12 o ejercicio 1 de funciones: crear una funcion para sumar los valores recibidos de tipo
# numerico, utilizando argumentos variables *args como parametro de la
# Funcion y agregar como resultado la suma de todos los valores pasados
# como argumentos
#Definimos una funcion
def sumar_valor(*args): # Recibimos una cantidad de parametros indefinidos
    resultado = 0
    #Interamos cada elemento
    for valor in args:
        resultado += valor
    return resultado


# Llamamos a la funcion
print(sumar_valor(3, 5, 9, 25))