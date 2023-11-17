"""Ejercicio 7: Dadas las horas trabajadas de 5 personas y la tarifa de pago, calcular 
el salario y la sumatoria de todos los salarios"""

total = 0
for i in range(0, 5):
    hora = int(input("Ingrese tarifa: "))
    tarifa = int(input(
        "Ingrese horas trabajadas: "))
    parcial = hora*tarifa
    print(" Tarifa trabajador ", i+1, ":", parcial)
    total += hora*tarifa
print("La tarifa total de todos los salarios es: ", total)
