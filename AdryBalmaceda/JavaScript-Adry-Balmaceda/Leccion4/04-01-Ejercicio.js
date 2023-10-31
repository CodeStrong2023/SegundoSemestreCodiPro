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
// console.log(nombre3);  // aqui no lee el dato en la funcion, da error
 
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
