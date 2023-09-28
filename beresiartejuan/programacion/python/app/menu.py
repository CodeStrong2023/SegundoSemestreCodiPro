from os import system
from platform import system as get_system


def limpiar_pantalla():
    system("cls" if get_system() == "Windows" else "clear")


def mostrar_opciones(opciones: list):
    for indice in range(0, len(opciones)):
        opcion = opciones[indice]
        print(f"{opcion.__doc__}")


def mostrar_menu(opciones: list, title: str | bool, mensaje_de_error: str):
    opcion_seleccionada = -1
    mostrar_mensaje_de_error = False

    while opcion_seleccionada < 0:
        limpiar_pantalla()

        if type(title) == str:
            print(f"{'-' * 10} {title} {'-' * 10}", end="\n\n")

        if mostrar_mensaje_de_error:
            print(mensaje_de_error, end="\n\n")

        mostrar_opciones(opciones)

        try:
            user_input = int(input("Selecciona numero de lección: "))
            if user_input > 0 and user_input <= len(opciones):
                opcion_seleccionada = user_input
            else:
                opcion_seleccionada = -1
                mostrar_mensaje_de_error = True
        except ValueError:
            opcion_seleccionada = -1
            mostrar_mensaje_de_error = True

    return [opcion_seleccionada - 1, opciones[opcion_seleccionada - 1]]


def mostrar_ejercicios(leccion: callable):
    return mostrar_menu(
        leccion(),
        leccion.__doc__,
        f"Por favor, seleccione un numeró de ejercicio valido (desde 1 hasta {len(leccion())})",
    )


def mostrar_lecciones(lecciones: list):
    return mostrar_menu(
        lecciones,
        "Ejercicios en Python",
        f"Por favor, seleccione un numeró de lección valido (desde 1 hasta {len(lecciones)})",
    )
