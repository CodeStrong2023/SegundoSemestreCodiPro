from Clase10 import persona2

print("Creación de objetos".center(50, "-"))

if __name__ == "__main__":
    Persona5 = persona2("lionel", "messi", 35)
    Persona5.Detalles()

    print(__name__)

print("Eliminación de objetos".center(50, "-"))
del Persona5