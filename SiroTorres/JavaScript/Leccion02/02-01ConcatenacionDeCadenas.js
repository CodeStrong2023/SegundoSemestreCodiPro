var nombre = 'Jose';
var apellido = ' Montes';
var nombreCompleto = nombre +' '+apellido; //Primera concatenacion
console.log(nombreCompleto)
var nombreCompleto2 = 'Ariel'+ ' '+'Betancud'; //Segunda concatenacion
console.log(nombreCompleto2);
var juntos =  nombre + 219; //Lee de izq a derecha por lo tanto toma los numeros como string
console.log(juntos)
var juntos = nombre + (17 + 19); //Se puede diferenciar por medio de parentesis
console.log(juntos)
var juntos = 12 + 19 + nombre;
console.log(juntos);

nombre += apellido; //Tercera concatenacion usando el operador simplificado
console.log(nombre);

let x, y; //Se pueden crear varias variables dentro de una misma linea
x = 17, y = 21; //Se puede hacer asignacion de varias variables dentro de la misma linea
let z = x + y; //Se asigna el valor de la operacion
console.log(z)

let $1num = 31; //No utilizar numeros para iniciar el nombre de una variable
let $break = "ddd"; //No utilizar palabras reservadas para variables

console.log($1num)
console.log($break)

//Hoy ya no se usar var, se utiliza Let y const
nombre = "Pedro";
console.log(nombre)

const apellido2 = "Lepez";
//apellido2 = "Peres"; Una constante no puede ser modificada
console.log(apellido2)
