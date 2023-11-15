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

//Evitar repetir tu codigo
//Dry don't repeat yourself

let days = 1;
switch (days){
    case 1:
        console.log('Hoy es Lunes');
        break;
    case 2:
        console.log('Hoy es Martes');
        break;
    case 3:
        console.log('Hoy es Miercoles');
        break;
    case 4:
        console.log('Hoy es Jueves');
        break;
    case 5:
        console.log('Hoy es Viernes');
        break;
    case 6:
        console.log('Hoy es Sabado');
        break;
    case 7:
        console.log('Hoy es Domingo');
        break;
    default:
        console.log("Error en el ingreso del dia de la semana");
        break;

}

//Esta es la version mejorada

let days2 = ['Lunes','Martes','Miercoles','Jueves','Viernes','Sabado','Domingo'];
function getDays(n){
    if (n < 1 || n > 7){
        throw new Error('out of range');
    }
    return days2 [n-1];
}
console.log(getDays(5));

//Hacer un ejercicio similar al que esta hecho,pero ahora con los 
//meses del año, debes hacerlo con la estructura switch y luego con 
//la funcion en la opcion mejorada

let meses = 12;
switch (meses){
    case 1:
        console.log('Estamos en el mes de Enero');
        break;
    case 2:
        console.log('Estamos en el mes de Febrero');
        break;
    case 3:
        console.log('Estamos en el mes de Marzo');
        break;
     case 4:
        console.log('Estamos en el mes de Abril');
        break;
    case 5:
        console.log('Estamos en el mes de Mayo');
         break;
    case 6:
        console.log('Estamos en el mes de Junio');
         break;
    case 7:
        console.log('Estamos en el mes de Julio');
        break;
    case 8:
         console.log('Estamos en el mes de Agosto');
         break;
    case 9:
        console.log('Estamos en el mes de Septiembre');
         break;
    case 10:
        console.log('Estamos en el mes de Octubre');
        break;
    case 11:
        console.log('Estamos en el mes de Noviembre');
        break;
    case 12:
        console.log('Estamos en el mes de Diciembre');
        break;
    default:
        console.log('Ya no quedan meses, Vuelve a intentar');
        break;
}

//Esta es la version mejorada

let meses2 = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre','Diciembre'];
function getMonth(n){
    if (n < 1 || n > 12){
        throw new Error('out of range');
    }
    return meses2 [n-1];
}
console.log(getMonth(5));