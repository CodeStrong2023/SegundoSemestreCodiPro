from os import system
from platform import system as get_system

from ejercicios.leccion1 import leccion1


def register():
    return [leccion1]


def mostrar_lecciones(lecciones: list):
    for indice_leccion in range(0, len(lecciones)):
        leccion = lecciones[indice_leccion]
        print(f"{indice_leccion + 1} - {leccion.__doc__}")


def mostrar_ejercicios(ejercicios):
    mostrar_lecciones(ejercicios)


def limpiar_pantalla():
    system("cls" if get_system() == "Windows" else "clear")


def mostrar_menu(lecciones: list):
    leccion_seleccionada = -1
    mostrar_mensaje_de_error = False

    while leccion_seleccionada < 0:
        limpiar_pantalla()
        print(("-" * 10) + " Ejercicios en Python " + ("-" * 10), end="\n\n")
        if mostrar_mensaje_de_error:
            print(
                f"Por favor, seleccione un numeró de lección valido (desde 1 hasta {len(lecciones)})",
                end="\n\n",
            )
        mostrar_lecciones(lecciones)

        try:
            user_input = int(input("Selecciona numero de lección: "))
            if user_input > 0 and user_input <= len(lecciones):
                leccion_seleccionada = user_input
            else:
                leccion_seleccionada = -1
                mostrar_mensaje_de_error = True
        except ValueError:
            leccion_seleccionada = -1
            mostrar_mensaje_de_error = True

    leccion = lecciones[leccion_seleccionada - 1]
    ejercicios = leccion()
    ejercicio_seleccionado = -1
    mostrar_mensaje_de_error = False

    while ejercicio_seleccionado < 0:
        limpiar_pantalla()
        print(f"{leccion.__doc__}", end="\n\n")
        if mostrar_mensaje_de_error:
            print(
                f"Por favor, seleccione un numeró de ejercicio valido (desde 1 hasta {len(ejercicios)})",
                end="\n\n",
            )
        mostrar_ejercicios(ejercicios)

        try:
            user_input = int(input("Selecciona numero de ejercicio: "))
            if user_input > 0 and user_input <= len(ejercicios):
                ejercicio_seleccionado = user_input
            else:
                ejercicio_seleccionado = -1
                mostrar_mensaje_de_error = True
        except ValueError:
            ejercicio_seleccionado = -1
            mostrar_mensaje_de_error = True

    ejercicio = ejercicios[ejercicio_seleccionado - 1]

    return [[leccion_seleccionada, leccion], [ejercicio_seleccionado, ejercicio]]


def app():
    lecciones = register()
    print(mostrar_menu(lecciones))
