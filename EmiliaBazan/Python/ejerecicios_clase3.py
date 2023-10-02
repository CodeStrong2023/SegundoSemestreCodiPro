# La tarea consiste en ingresar elementos al diccionario llamado seleccion Argentina, lo elementos a ingresar deben ser como mínimo
# 4, estos elementos son los jugadores con su número de camiseta,
# nombre, apellido, edad, altura, precio y posición de juego, por supuesto ver el video anterior.

seleccionArg = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.75, 'Precio': '50M', 'Posición': 'Delantero'},
    11: {'Nombre': 'Angel Di María', 'Edad': 35, 'Altura': 1.80, 'Precio': '50M', 'Posición': 'Delantero'},
    22: {'Nombre': 'Lautaro Martinez', 'Edad': 26, 'Altura': 1.77, 'Precio': '50M', 'Posición': 'Delantero'},
    9: {'Nombre': 'Julián Álvarez', 'Edad': 23, 'Altura': 1.70, 'Precio': '50M', 'Posición': 'Delantero'},
    21: {'Nombre': 'Paulo Dybala', 'Edad': 29, 'Altura': 1.77, 'Precio': '50M', 'Posición': 'Delantero'},
    15: {'Nombre': 'Angel Correa', 'Edad': 28, 'Altura': 1.71, 'Precio': '50M', 'Posición': 'Delantero'},
    7: {'Nombre': 'Rodrigo de Paul', 'Edad': 29, 'Altura': 1.77, 'Precio': '50M', 'Posición': 'Mediocampista'},
    5: {'Nombre': 'Leandro Paredes', 'Edad': 29, 'Altura': 1.82, 'Precio': '50M', 'Posición': 'Mediocampista'},
    20: {'Nombre': 'Alexis Mc Allister', 'Edad': 24, 'Altura': 1.74, 'Precio': '50M', 'Posición': 'Mediocampista'},
    18: {'Nombre': 'Guido Rodriguez', 'Edad': 29, 'Altura': 1.86, 'Precio': '50M', 'Posición': 'Mediocampista'},
    17: {'Nombre': 'Alejandro Gomez', 'Edad': 35, 'Altura': 1.67, 'Precio': '50M', 'Posición': 'Mediocampista'},
    24: {'Nombre': 'Enzo Fernández', 'Edad': 22, 'Altura': 1.78, 'Precio': '50M', 'Posición': 'Mediocampista'},
    14: {'Nombre': 'Excequiel Palacios', 'Edad': 24, 'Altura': 1.77, 'Precio': '50M', 'Posición': 'Mediocampista'},
    16: {'Nombre': 'Thiago Almada', 'Edad': 22, 'Altura': 1.71, 'Precio': '50M', 'Posición': 'Mediocampista'},
    26: {'Nombre': 'Nahuel Molina', 'Edad': 25, 'Altura': 1.75, 'Precio': '50M', 'Posición': 'Defensor'},
    4: {'Nombre': 'Gonzalo Montiel', 'Edad': 26, 'Altura': 1.75, 'Precio': '50M', 'Posición': 'Defensor'},
    13: {'Nombre': 'Cristian Romero', 'Edad': 25, 'Altura': 1.85, 'Precio': '50M', 'Posición': 'Defensor'},
    6: {'Nombre': 'Germán Pezzella', 'Edad': 32, 'Altura': 1.89, 'Precio': '50M', 'Posición': 'Defensor'},
    19: {'Nombre': 'Nicolas Otamendi', 'Edad': 35, 'Altura': 1.83, 'Precio': '50M', 'Posición': 'Defensor'},
    25: {'Nombre': 'Lisandro Martinez', 'Edad': 25, 'Altura': 1.75, 'Precio': '50M', 'Posición': 'Defensor'},
    8: {'Nombre': 'Marcos Acuña', 'Edad': 31, 'Altura': 1.72, 'Precio': '50M', 'Posición': 'Defensor'},
    3: {'Nombre': 'Nicolas Tagliafico', 'Edad': 31, 'Altura': 1.72, 'Precio': '50M', 'Posición': 'Defensor'},
    2: {'Nombre': 'Juan Foith', 'Edad': 25, 'Altura': 1.87, 'Precio': '50M', 'Posición': 'Defensor'},
    23: {'Nombre': 'Emiliano Martinez', 'Edad': 32, 'Altura': 1.95, 'Precio': '50M', 'Posición': 'Arquero'},
    12: {'Nombre': 'Geronimo Rulli', 'Edad': 31, 'Altura': 1.88, 'Precio': '50M', 'Posición': 'Arquero'},
    1: {'Nombre': 'Franco Armani', 'Edad': 36, 'Altura': 1.89, 'Precio': '50M', 'Posición': 'Arquero'},

}

print(seleccionArg[10])

print('')

for clave, valor in seleccionArg.items():
    print(clave, valor)
