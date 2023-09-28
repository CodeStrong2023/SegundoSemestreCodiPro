# Ejercicio 2: Crear un rango de numeros de 2 a 6 e imprimelos
# Ejemplo: 2,3,4,5,6


def ejercicio2():
    """(Lección 1) Ejercicio 2: Rangos"""

    print("Ejercicio 2: Crear un rango de numeros de 2 a 6 e imprimelos")
    print("Expectativa: 2,3,4,5,6", end="\n\n")

    fin = 6
    rango = range(2, fin + 1)

    for i in rango:
        print(i, end="\n" if i == fin else ",")


if __name__ == "__main__":
    ejercicio2()
