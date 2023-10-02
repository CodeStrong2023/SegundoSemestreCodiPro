# 6.1 Ejercicio 10 No Repetir Caracteres: ingresar una cadena y eliminar duplicados.

# cadena = input("Ingrese una frase: ")
# cadenaMin = cadena.lower()
# lista = list(cadenaMin)
# sinDobles = set(lista)
# print(f"Los caracteres en su frase son: {sinDobles}")

# 6.2 Ejercicio 11 Agenda Telefónica: Crear un diccionario para ingresar un contacto nuevo y luego las opciones:
# 1 - Crear contacto
# 2 - Borrar contacto
# 3 - Ver contactos existentes
# 4 - Salir


agenda = {}
while True:
    opcion = int(input(
        "\nElija la opción que desea realizar: \n1. Crear contacto \n2. Borrar contacto \n3. Ver contacots \n4. Salir \n -"))
    if opcion == 1:
        nombre = input("Ingrese nombre: ")
        telefono = input("Digite número de telefono: ")
        if nombre not in agenda:
            agenda[nombre] = telefono
            print('Contacto agregado sactifactoriamente!')
        else:
            print('Contacto existente!')
    elif opcion == 2:
        nombre = input('Ingrese el nombre del contacto que desea eliminar: ')
        if nombre in agenda:
            del (agenda[nombre])
            print("Se eliminó el contacto de la lista")
        else:
            print("Contacto inexistente")
    elif opcion == 3:
        print('Agenda:')
        for clave, valor in agenda.items():
            print(f'Nombre: {clave}, Telefono: {valor}')
    elif opcion == 4:
        print('Gracias por usar la agenda')
        break
    else:
        print('Dato inválido, vuelva a ingresar')
