# Ejercicio 7: Juego adivina el número
# Realizar un juego para adivinar un número. Para ello se
# debe generar un número aleatorio 1-100, y luego ir pidiendo
# números indicando "es mayor" o "es menor" segun sea mayor o
# menor con respecto a N. El proceso termina cuando el usuario
# acierta y allí se debe mostrar el número de intentos.
import random
print("\t: Juego adivina el número")
aleatorio = random.randint(0, 100) # Generamos un número aleatorio
contador = 0
while True:
    numero = int(input("Ingrese un número: "))
    contador +=1
    if (numero < aleatorio):
        print("Ingrese un número mayor")
    elif numero > aleatorio:
        print("Ingrese un número menor")
    else:
        print(f"FELICIDADES, acabas de adivinar el número {aleatorio}")
        break #Rompe el ciclo y el bucle
print(f"\nSu número de intentos fue de: {contador}")


