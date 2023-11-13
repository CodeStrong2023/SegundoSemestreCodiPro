# Ejercicio 04: Calculadora de impuestos
# Crear una función para calcular el total de un pago incluyendo
# un impuesto aplicado. (IVA)
# Formula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
# Proporcione el pago sin impuesto: 1000
# Proporcione el monto del impuesto: 21%
# Pago con impuesto: xxxxx

#Creamos la función que calcula todo
def calcularTotalPago(pago_sin_impuesto,impuesto):
     pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
     return pago_total

#Se ejecuta la función
pago_sin_impuesto = float(input("Proporcione el pago sin impuesto: "))
impuesto = float(input("Proporcione el monto del impuesto a aplicar: "))
pago_con_impuesto = calcularTotalPago(pago_sin_impuesto,impuesto)
print(f"El pago con impuesto es: {pago_con_impuesto}")

