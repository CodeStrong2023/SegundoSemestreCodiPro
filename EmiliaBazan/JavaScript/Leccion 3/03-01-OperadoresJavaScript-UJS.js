// Ejercicio para encontrar numeros pares e impares
let parImpar = 11;
if (parImpar % 2 == 0) {
    console.log("Es PAR");
}
else {
    console.log("Es IMPAR")
}

// Ejercicio: es mayor de edad
let edad = 60, adulto = 18;
if (edad >= adulto) {
    console.log('Es mayor de edad');
}
else {
    console.log('Es menor de edad');
}

// Ejercicio: dentro de un rango, operador &&
let dentroRango = 10; // aqui vamos a ir cambiando el valor
let valMin = 0, valMax = 10;
if (dentroRango >= valMin && dentroRango <= valMax) {
    console.log('Esta dentro del rango establecido')
}
else {
    console.log('Esta fuera del rango establecido')
}

/*
Ejercicio: Si el padre puede asistir al juego de su hijo
con operador or ||
*/
let vacaciones = true, diaDescanso = false;
if (vacaciones || diaDescanso) {
    console.log('El padre puede asistir al juego de su hijo');
}
else {
    console.log('El padre NO puede asistir al juego de su hijo');
}

// Operador ternario parecido a if else, es para codigos cortos, para codigos largos se utiliza if else
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2);
let numero = 6;
resultado2 = numero % 2 == 0 ? "Es un numero PAR" : "Es un numero IMPAR";
console.log(resultado2);

// Convertir String a Number
let miNumero = "19";   // es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero);  // esta es una funcion que va a hacer la conversion
console.log(typeof edad2);

// Funcion isNaN, para verificar el valor de una variable de tipo numerica
// compara numero con numero y nos da un resultado booleano
if (isNaN(edad2)) {  // no es un numero = is Not a Number(devuelve un resultado booleano)
    console.log('Esta variable no contiene solo numeros');
}
else {
    if (edad2 >= 18) {
        console.log('Puede votar');
    }
    else {
        console.log('Muy joven para votar');
    }
}


// Operador ternario
let resultado3 = edad2 >= 18 ? "Puede votar" : "Muy joven para votar";
console.log(resultado3);



