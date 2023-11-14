// Ejercicio 1: Calcular estacion del año, sintaxis igual a Java
let mes = 10;
let estacion; // undefined, ya está definida
if(mes == 1 || mes == 2 || mes == 12){
    estacion = 'Verano';
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = 'Otoño';
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion ='Invierno';
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = 'Primavera';
}
else{
    estacion = 'Valor incorrecto';
}
console.log('El valor corresponde a la estacion de: '+estacion);
// Ejercicio 2: Hora del día
/**
 * Rutinas
 * Hora de levantarse: 7 a 8
 * Hora de visita de obra: 9 a 15
 * Hora de oficina: 16 a 19
 * Hora de clases: 20 a 23
 * Hora de dormir: 0 a 6
 */
let hora = 8;
let rutina;
if(hora >= 7 && hora <= 8){
    rutina = 'Hora de levantarse';
}
else if(hora >= 9 && hora <= 15){
    rutina = 'Hora de visita de obra';
}
else if(hora >= 16 && hora <= 19){
    rutina = 'Hora de oficina';
}
else if(hora >= 20 && hora <= 23){
    rutina = 'Hora de clases';
}
else if(hora >= 0 && hora <= 6){
    rutina = 'Hora de dormir';
}
else{
    rutina = 'Opcion incorrecta';
}
console.log(rutina);
/**
 * Ampliando el uso de var let y const
 * con var puedes reasignar en cualquier momento
 * este forma parte del ambito global
 * un error es que se sobreescriba
 */

var nombre = 'Adriana';
nombre = 'Maria';
console.log(nombre);

function saludar (){
    var nombre3 = 'Fernando';
    console.log(nombre3);
}
//console.log(nombre3);  // aqui no lee el dato en la funcion, da error
 
if(true){
    var edad = 33;
    console.log(edad);
}
console.log(edad);  // en la funcion var funciono correctamente, en la estructura if falla y no muestra el fallo

/**
 * let: esta puede ser reasignada en cualquier momento
 * la diferencia es que su ambito es de bloque,
 * solo disponible dentro de un bloque de llaves
 * o dentro de una funcion
 * let funciona perfectamente y es mas confiable
 */
function saludar2(){
    let nombre2 = 'Adriana';
    console.log(nombre2);
}
//console.log(nombre2);  // aqui muestra el fallo:

if(true){
    let edad2 = 32;
    console.log(edad2);
}
//console.log(edad2);

/**
 * const: se utiliza para valores constantes que no pueden seer reasignadas
 */

const fechaNacimiento = 2005;
console.log(fechaNacimiento);
// fechaNacimiento = 2002; // falla
// console.log(fechaNacimiento);  // solo se ejecuta el console anterior y no permite mostrar el valor nuevo
