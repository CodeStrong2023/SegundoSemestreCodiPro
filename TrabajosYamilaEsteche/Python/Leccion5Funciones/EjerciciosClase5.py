
#Ejercicio 4: Sumar números pares dentro de un rango.
#Hacer un programa para sumar números pares dentro de un rango, por ejemplo:  suma de números pares del 2 al 30
# suma = 240


a = int(input("¿Desde que numero comenzara la suma?"))
b = int(input("¿Hasta que numero quiere llegar a sumar?"))

sumaNpares = 0

for i in range(a, b+1):
    if i % 2 == 0: # De esta manera verificamos si el numero es par o impar
        sumaNpares += i

print(f"\n La suma de números pares dentro del rango es: {sumaNpares}")


#Ejercicio 5: Factorial de un número positivo. Hacer un programa para calcular el factorial de un número positivo

numero = int(input('Digite un numero: '))

while numero < 0:
    print("Error: El número tiene que ser positivo.")
    numero =int(input("Digite un numero: "))
factorial = 1
for i in range(1, numero + 1):
    factorial *= i
print(f"\n El factorial del numero {numero} positivo ingresado es: {factorial}")


#Ejercicio 6: Tabla de multiplicar, hacer un programa que pida un número por teclado y guarde en una lista su tabla
#de multiplicar hasta el 10; por ejemplo:
#si digita el 5 la lista tendrá; 5,10,15,20,25,30,35,40,45,50



numero = int(input("digite un número: "))
multiplicado = []
multis = []
for i in range(1, 11):
    multis.append(i)
    multiplicado.append(i*numero)
print(f"\n Tabla de multiplicar del numero {numero}: \n {multiplicado}")

for i in range(1, 11):
    print(f"{numero} x {i} = {multiplicado[i-1]}")




#Ejercicio 7: Juego adivina el número.
#Realizar un juego para adivinar un número. Para ello se debe generar un número aleatorio entre 1 y 100, y luego ir pidiendo números indicando 'Es mayor' o 'Es menor' según corresponda.
#El proceso termina cuando el usuario acierta y allí se debe mostrar el número de intentos.



import random

print('\t |·| Juego adivina el número |·|')

NumAleatorio = random.randint(0, 100) # Tomara un número aleatorio entre 0 y 100
contador = 0
while True:
    Num = int(input('Digite un número'))
    contador += 1
    if Num > NumAleatorio:
        print('\t El número es menor')
    elif Num < NumAleatorio:
         print('\t El número es mayor')
    else:
        print(f'Ganaste! Adivinaste el número {NumAleatorio}')
        break #Rompemos el ciclo y bucle
print(f'\n Número de intentos: {contador}')



#Ejercicio 8: Menú interactivo - Cajero automático
#Hacer un programa que simule un cajero automático con un saldo inicial de $1000 y tendrá el siguiente menú de opciones:
#1- Ingresar dinero en la cuenta
#2- Retirar dinero de la cuenta
#3- Mostrar dinero disponible
#4- Salir



Saldo = 1000

while True:
    print('')
    print('\t |·| Cajero |·|')
    print('Opciones para hacer')
    print('1. Ingresar dinero a la cuenta')
    print('2. Retirar dinero de la cuenta')
    print('3. Mostrar dinero disponible')
    print('4. Salir')
    Opcion = int(input('Digite la opción que desea: '))
    print('')
    if Opcion == 1:
        IngresarSaldo = float(input('Cuanto dinero quiere ingresar: '))
        Saldo += IngresarSaldo
        print(f'El saldo que tiene en la cuenta es: ${Saldo}')
    elif Opcion == 2:
        print(f'El saldo disponible en la cuenta es: ${Saldo}')
        RetirarSaldo = int(input('Cuanto dinero desea retirar: '))
        if RetirarSaldo > Saldo:
            print('Saldo ingresado no disponible')
        else:
            Saldo -= RetirarSaldo
            print(f'Dinero disponible en la cuenta: ${Saldo}')
    elif Opcion == 3:
        print(f'El dinero disponible en la cuenta es: ${Saldo}')
    elif Opcion == 4:
        print('Gracias por utilizar el cajero automático')
        break
    else:
        print('La opción ingresada no es correcto')
        print('')



#Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
 # #Hacer un programa donde el usuario ingrese una frase, se le devolvera la misma frase pero sin espacios en blanco, y además un contador de cuántos caracteres tiene la frase (sin contar
# los espacios en blanco)
#Ejemplo: frase = vivir por siempre en paz  frase final = vivirporsiempreenpaz Nº de caracteres = 20

frase1 = input("digite una frase:")
frase2= " "
for i in frase1:
    if i != " ":
        frase2+= i
frase1 = frase2
print(f'\n frase final: {frase1}')
print(f'N° de caracteres: {len(frase1)}')


