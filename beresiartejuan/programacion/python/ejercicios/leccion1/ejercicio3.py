# Ejercicio 2: Crear un rango de 3 a 10 pero con incremento de 2 en 2, en lugar de 1 en 1
# Ejemplo: 3,5,7,9


def ejercicio3():
    """(Lección 1) Ejercicio 3: Rangos"""
    print(
        "Ejercicio 2: Crear un rango de 3 a 10 pero con incremento de 2 en 2, en lugar de 1 en 1"
    )
    print("Expectativa: 3,5,7,9", end="\n\n")

    [print(i, end="\n" if i == 9 else ",") for i in range(3, 11, 2)]


if __name__ == "__main__":
    ejercicio3()
