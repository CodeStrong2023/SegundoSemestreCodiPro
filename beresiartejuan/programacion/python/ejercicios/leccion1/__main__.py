from . import leccion1
from sys import path

path.append("..")

from app import menu


def app():
    menu.limpiar_pantalla()
    entrada_ejercicio = menu.mostrar_ejercicios(leccion1)

    menu.limpiar_pantalla()
    print(leccion1.__doc__, end="\n\n")
    print(entrada_ejercicio[1].__doc__, end="\n\n")
    entrada_ejercicio[1]()
    print("--- FIN DE LA EJECUCIÓN ---")


if __name__ == "__main__":
    app()
