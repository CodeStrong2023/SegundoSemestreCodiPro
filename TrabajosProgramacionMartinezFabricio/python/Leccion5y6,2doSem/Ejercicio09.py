# Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
# Hacer un programa donde el usuario ingrese una frase, se le
# devolverá la misma frase pero sin espacios en blanco, y además
# un contador de cuantos caracteres tiene la frase
# (sin contar los espacios en blanco)
# Ejemplo:             frase = vivir por siempre en paz
#                      frase final = vivirporsiempreenpaz
#                      N° de caracteres = 20

frase = input("Ingrese una frase: ")
frase2 = ""
for i in frase:
    if i != " ":
        frase2 += i

frase = frase2
print(f"\nFrase final: {frase}")
print(f"N° de caracteres: {len(frase)}")
