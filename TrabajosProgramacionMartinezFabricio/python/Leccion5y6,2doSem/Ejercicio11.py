# Ejercicio 11: Agenda telefónica
# Hacer un programa que simule una agenda de contactos. Crear un
# diccionario donde la clave sea el nombre del usuario y el valor
# sea el telefono, el programa tendrá el siguiente menú de opciones:
#               1. Nuevo teléfono
#               2. Borrar contacto
#               3. Ver contactos existentes
#               4. Salir
agenda = {}
while True:
    print("\t.:MENÚ:.")
    print("1. Nuevo teléfono")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")
    opcion = int(input("Ingrese una opción del menú: "))
    print()
    if opcion == 1:
        nombre = input("Ingrese el nombre del nuevo contacto: ")
        telefono = input("Ingrese el número de teléfono: ")
        if nombre not in agenda:
            agenda[nombre] = telefono #Para agregar un contacto al diccionario
            print("Contacto agregado exitosamente")
        else:
            print("Este nombre de contacto ya está agregado")
    elif opcion == 2:
        nombre = input("Cuál es el nombre del contacto?: ")
        if nombre in agenda:
            del (agenda[nombre])
            print("Contacto eliminado correctamente")
        else:
            print("Este contacto no existe en la agenda")
    elif opcion == 3:
        print("Agenda de contactos")
        for clave, valor in agenda.items():
            print(f"Nombre: {clave}, Teléfono: {valor}")
    elif opcion == 4:
        print("Gracias por utilizar su agenda de contactos")
        break
    else:
        print("ERROR, se equivocó de opción de menú")
        print()




