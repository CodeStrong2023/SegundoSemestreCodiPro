//Ejercicio para encontrar números pares e impares
let parImpar = 7;
if(parImpar%2==0){
    console.log("El número es PAR");
}
else{
    console.log("El número es IMPAR");
}

//Ejercicio es mayor de edad
let edad = 17;
if(edad>=18){
    console.log("Es mayor de edad")
}
else{
    console.log("Es menor de edad")
}

//Ejercicio: Dentro de un rango
let dentroRango = 5; //Aquí vamos a ir cambiando el valor
let valMin = 0, valMax = 10;
if(dentroRango>=valMin&&dentroRango<=valMax){
    console.log("Está dentro del rango establecido")
}
else{
    console.log("Está fuera del rango establecido")
}

//Ejercicio: Si el padre puede asistir al juego de su hijo 
let vacaciones = true, diaDescanso = false;
if(vacaciones || diaDescanso){
   console.log("El padre puede asistir al juego de su hijo");
}
else{
    console.log("El padre NO puede asistir al juego de su hijo");
}

//Operador ternario
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2);

let numero = 9;
resultado2 = numero % 2 == 0 ? "Es un número PAR" : "Es un número IMPAR";
console.log(resultado2);

//Convertir string a number
let miNumero = "21"; //Es una cadena
console.log(typeof miNumero);
edad = Number(miNumero); //Esta es una función
console.log(typeof edad);

//Función isNan
if(isNaN(edad)){ //No es un número = is Not a Number(devuelve un resultado booleano) 
    console.log("Esta variable no contiene solo números")
}
else{
    if(edad >= 18){
        console.log("Puede votar")
    }
    else{
        console.log("Muy joven para votar");
    }
}

//Operador ternario
let resultado3 = edad >= 18 ? "Puede votar" : "Muy joven para votar";
console.log(resultado3);

