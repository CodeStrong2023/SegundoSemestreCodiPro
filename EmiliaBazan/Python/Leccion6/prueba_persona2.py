from Persona2 import Persona2

print('Creación de objetos'.center(50, '-'))

if __name__ == "__main__":

    persona5 = Persona2("Emilia", "Bazan", 33)
    persona5.mostar_detalles()

    print(__name__)


print('Eliminación de objetos'.center(50, '-'))
del persona5

# print(persona5.mostar_detalles()) #Ya no se muestra la persona5
