# Ejercicio 8: Menú Interactivo - Cajero Automático
# Hacer un programa que simule un cajero automático con un saldo
# inicial de $1000 y tendrá el siguiente menú de opciones:
                              #                           1. Ingresar dinero en la cuenta
#                           2. Retirar dinero de la cuenta
#                           3. Mostrar dinero disponible
#                           4. Salir
saldo = 1000
while True:
    print("\t.:MENÚ:.")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")
    opcion = int(input("Ingrese una opción del menú: "))
    print()
    if opcion == 1:
        extra = float(input("Cuánto dinero desea ingresar ->"))
        saldo = saldo + extra
        print(f"Dinero en la cuenta actual: ${saldo}")
        print()

    elif opcion == 2:
        print(f"Dinero disponible en la cuenta para retirar ->{saldo}")
        retiro = int(input("Cuánto dinero desea retirar ->"))
        if retiro > saldo:
            print("No cuenta con esa cantidad de dinero para retirar")
        else:
            saldo = saldo-retiro
            print(f"Dinero en la cuenta: ${saldo}")
            
    elif opcion ==3:
        print(f"Dinero en la cuenta actual: ${saldo}")

    elif opcion == 4:
        print("Gracias por utilizar su cajero automático, hasta luego")
        break
    else:
        print("ERROR, se equivocó de opción de menú")
        print()