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