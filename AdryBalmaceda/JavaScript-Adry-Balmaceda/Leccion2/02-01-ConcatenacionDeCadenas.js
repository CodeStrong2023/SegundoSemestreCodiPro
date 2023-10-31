var nombre = 'Jose';
var apellido = 'Montes';
var nombreCompleto = nombre+' '+apellido;
console.log(nombreCompleto);
var nombreCompleto2 = 'Felipe'+' '+'Astudillo';
console.log(nombreCompleto2);
var juntos = nombre + 219;  // lee de izq a der siguiendo la cadena como de tipo string
console.log(juntos);
juntos = nombre + 78 + 17;  // aqui se puede diferenciar a traves de los parentesis
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);
// a esto que hemos visto se lo llama contexto string o contexto cadena

// Tercera Concatenacion usando el operador simplificado
nombre += apellido;
console.log(nombre);

// Hoy ya no se usa var, se utiliza let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
// apellido2 = 'Peres';  // una constante no puede ser modificada
console.log(apellido2); // funcion que esta siendo llamada, adentro ponemos los argumentos

// Similitudes con Java
let x, y;  // se pueden crear varias variables dentro de una sola linea
x = 17, y = 21;  // se puede hacer asignacion de varias variables en una misma linea
let z = x + y;  // se asigna el valor de la operacion
console.log(z);

let _1num = 31;  // no esta permitido nombrar una variable primero con un numero, 
// podemos anteponer _guion bajo o $ simbolo
let rompiendo = "rompe";  // no utilizar palabras reservadas para variables ej: break

console.log(_1num);
console.log(rompiendo);
