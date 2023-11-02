""" Ejercicio: Operador Or, Operador not
La pregunta es si un padre puede asistir al juego de su hijo
Verificamos si tiene vacaciones
Verificamos si tiene el día libre
Usar estructura ‘if else’ con el operador or
Imprimir
"""
vacaciones = False # Test con True
diaDescanso = True # Test con False
if not (vacaciones or diaDescanso):
    print("Puede asistir al juego") # Test con "Tiene trabajo que hacer"
else:
    print("Tiene trabajo que hacer") # Test con "Puede asistir al juego"