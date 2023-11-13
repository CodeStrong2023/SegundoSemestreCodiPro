class Aritmetica:
    """
    El nombre de este tipo de comentario es: DocString
    esto es documentación de la clase en Python
    Vamos a hacer en esta clase algunas operaciones de: suma, resta, multiplicación y más
    """
    def __init__(self,operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB

    #Método para sumar
    def sumar(self):
        return self.operandoA + self.operandoB

    def restar(self):
        return self.operandoA - self.operandoB

    def multiplicar(self):
        return self.operandoA * self.operandoB

    def dividir(self):
        return self.operandoA / self.operandoB

aritmetica1 = Aritmetica(7,9) #Le pasamos los argumentos para los operadores
print(f"Suma: {aritmetica1.sumar()}")
print(f"Resta: {aritmetica1.restar()}")
print(f"Multiplicación: {aritmetica1.multiplicar()}")
print(f"División: {aritmetica1.dividir():.2f}")

