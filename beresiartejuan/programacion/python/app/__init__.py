from ejercicios.leccion1 import leccion1

from app import menu


def register():
    return [leccion1]


def app():
    menu.limpiar_pantalla()
    entrada_leccion = menu.mostrar_lecciones(register())
    entrada_ejercicio = menu.mostrar_ejercicios(entrada_leccion[1])

    menu.limpiar_pantalla()
    print(entrada_leccion[1].__doc__, end="\n\n")
    print(entrada_ejercicio[1].__doc__, end="\n\n")
    entrada_ejercicio[1]()
    print("--- FIN DE LA EJECUCIÓN ---")
