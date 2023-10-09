""" Ejercicio: Valor dentro de un rango
Pedimos al usuario un valor numérico
Verificar si el valor ingresado se encuentra entre el rango de 0 a 5
La formula es: <num> >= 0  and  <num> <= 5
"""
# Operadores logicos
a = False
b = False
resultado = a and b
print(resultado)

# Operador or
resultado = a or b
print(resultado)

# Operador not
resultado = not a
print(resultado)

# Ejercicio Valor dentro de un rango
valor = int(input("Digite un numero dentro del rango 0 al 5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f"El valor {valor} esta dentro del rango")
else:
    print(f"El valor {valor} No esta dentro del rango")