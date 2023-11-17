class Vehiculo:
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    @property
    def color(self):
        return self._color

    @color.setter
    def color(self, color):
        self._color = color

    @property
    def ruedas(self):
        return self._ruedas

    @ruedas.setter
    def ruedas(self, ruedas):
        self.ruedas = ruedas

    def __str__(self):
        return f'Vehiculo: [Color: {self._color}, Ruedas: {self._ruedas}]'


class Auto(Vehiculo):
    def __init__(self, velocidad):
        self.velocidad = velocidad

    @property
    def velocidad(self):
        return self._velocidad

    @velocidad.setter
    def velocidad(self, velocidad):
        self.velocidad = velocidad

    def __str__(self):
        return f'Auto: [Velocidad: {self._velocidad} {super().__str()}]'


class Bicicleta(Vehiculo):
    def __init__(self, tipo):
        self.tipo = tipo

    @property
    def tipo(self):
        return self._tipo

    @tipo.setter
    def tipo(self, tipo):
        self.tipo = tipo

    def __str__(self):
        return f'Bicicleta: [Tipo: {self._tipo} {super()._str()}]'
