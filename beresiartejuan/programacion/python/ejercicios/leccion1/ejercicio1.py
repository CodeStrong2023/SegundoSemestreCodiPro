# Ejercicio 1: Iterar un rango de 0 a 10 e imprimir numeros divisibles entre 3
# Ejemplo: 0,3,6,9


def ejercicio1():
    """(Lección 1) Ejercicio 1: Rangos"""

    print(
        "Ejercicio 1: Iterar un rango de 0 a 10 e imprimir numeros divisibles entre 3"
    )
    print("Expectativa: 0,3,6,9", end="\n\n")

    rango = range(0, 11)

    for i in rango:
        if i % 3 == 0:
            print(f"{i} es divisible por 3")


if __name__ == "__main__":
    ejercicio1()
