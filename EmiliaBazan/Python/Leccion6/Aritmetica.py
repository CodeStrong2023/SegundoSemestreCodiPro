class Aritmetica:

    # """ El nombre de éste tipo de comentario es DocString esto es documentación de la clase en python
    # vamos a hacer en esata clase operaciones de suma, resta, multiplicación y más"""

    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB

    # Método para sumar
    def sumar(self):
        return self.operandoA + self.operandoB

    def restar(self):
        return self.operandoA - self.operandoB

    def multiplicar(self):
        return self.operandoA * self.operandoB

    def dividir(self):
        return self.operandoA / self.operandoB


aritmetica1 = Aritmetica(7, 9)  # Le pasamos argumentos

print(aritmetica1.sumar())

print(f'resta: {aritmetica1.restar()}, multiplicación: {aritmetica1.multiplicar()}, división: {aritmetica1.dividir(): .2f}')
