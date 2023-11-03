//Ejercicios para encontrar numeros pares.
let parInpar = 2;
if(parInpar % 2 == 0){
    console.log("Es un numero PAR");
}
else{
    console.log("Es un numero IMPAR")
}

//Ejercicio: es mayor de edad.
let edad = 20, adulto = 18;
if( edad >= adulto){
    console.log('Es una persona Adulta');

}
else{
    console.log('Es menor de edad')
}

//Ejercicio: Dentro de un rango
let dentroRango = 5; //Aqui vamos a ir cambiando el valoor
let valMin = 0, valMax = 10;
if( dentroRango >= valMin && dentroRango < valMax){
    console.log('Esta dentro del rango establecido')
}
else{
    console.log('Esta fuera del rango establecido')
}
    //Ejercicio: Si el padre puede asistir al juego de su hijo
    let vacaciones = false, diaDescanso = false;
    if(vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego de su hijo")
    }
    else{
    console.log("El padre no puede asistir al juego de su hijo")
    }

    //Operador Ternario
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2)
let numero = 9;
resultado2 = numero %2 == 0 ? "Es el numero PAR" : "Es un numero impar"

//Convertir String a Number
let miNumero = "21"; //Es una cadena
console.log(typeof miNumero)
let edad1 = Number(miNumero); //Esta es una funcion de conversion
console.log(typeof edad1)
//Funcion isNaN
if(isNaN(edad1)){ //isNan no es un numero = Is Not a Numer (devuelve un boool)
    console.log("Esta variable no contiene solo numeros")

}
else{
    if (edad1 >=18){
        console.log('Puede votar');
    
    }
    else{
        console.log('No puede votar');
    }

}

//Operador Ternario
let resultado3 = edad1 >= 18 ? "Puede votar" : "No puede votar";
console.log(resultado3)


