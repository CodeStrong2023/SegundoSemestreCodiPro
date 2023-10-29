# Ejercicio 09: mostrar una frase sin espacios y contar su longitur
# Hacer un programa donde el usuario ingrese una frase,
# se le devolvera la misma frase pero sin espacios en blanco,
# y ademas un contador de cuantos caracteres tiene la frase
# sin contar los espacios en blanco
# Ejemplo:
# frase = vivir por siempre en paz
# frase final = vivirporsiempreenpaz
# N° de caracteres = 20
frase1 = input('Digite una frase: ')
frase2 = " "
for i in frase1:
    if i != " ":
        frase2 += i
frase1 = frase2
print(f'\nFrase final: {frase1}')
print(f'N° de caracteres: {len(frase1)}')
