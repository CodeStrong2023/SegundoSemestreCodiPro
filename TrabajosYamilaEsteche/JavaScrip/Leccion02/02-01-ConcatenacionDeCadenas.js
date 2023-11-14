var nombre = "Jose ";
var apellido = "Montes";
var nombreCompleto = nombre+" "+apellido;//Primera concatenacion
console-console.log(nombreCompleto);
var nombreCompleto2 = "Yamila"+" "+"Esteche"; //Segunda concatenacion
console.log(nombreCompleto2)
var juntos = nombre + 219; //Lee de izq a der siguiendo la cadena lee el numero como str
console.log(juntos);
juntos = nombre + 78 + 17; //Aqui se puede diferenciar a traves de los parentesis
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos)

nombre += apellido; //Tercera cocatenacion usando el operador simplificado
console.log(nombre);

//Hoy ya no se usa var, se utiliza let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
//appellido2 = "Peres"; una constante no puede ser modificada
console.log(apellido2)

let x, y; //Se pueden crear varias variables dentro de una misma linea
x = 17, y = 21; //Se puede hacer asignacion de varias variables dentro de la misma linea
let z = x + y; //Se asigna el valor de la operacion
console.log(z);

let _1num = 31;// no utilizar numero para iniciar el nombre de una variable
let rompiendo = "rompe";//No utilizar palabras reservadas para variable

console.log(_1num);
console.log(rompiendo);