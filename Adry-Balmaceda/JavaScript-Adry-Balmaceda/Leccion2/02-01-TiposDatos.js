// Tipos de Datos en JavaScript
/*
La sintaxis en lo que es comentarios
es muy similar a la de Java
realmente diriamos que es identica
*/
// Datos de tipo String
var nombre = 'Adriana';
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre);
var numero = 3000;  // Tipo numerico
console.log(numero);

var objeto = {
    nombre : 'Adry',
    apellido : 'Balmaceda',
    telefono : '261000300',
}
console.log(objeto);

// Tipo de dato boolean
var bandera = true;
console.log(typeof bandera)

// Tipo de dato funcion
function miFuncion(){}
console.log(typeof miFuncion);

// Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(typeof simbolo);

// Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(typeof Persona);