# 1. Importar clase
from Persona2 import Persona2  # con asterisco se importa completa la clase
print('Creacion de objetos'.center(50, '-'))
if __name__ == '__main__':  # comprobacion metodo principal en ejecucion
    persona5 = Persona2('Lionel', 'Messi', 35)
    persona5.mostrar_detalles()

    print(__name__)  # nos indica donde estamos

print('Eliminacion de objetos'.center(50, '-'))
# Para crear objetos con guiones etc: ------------Comienzo---------
del persona5  # no es comun usarlo pero sirve para ejecutar el metodo destructor
