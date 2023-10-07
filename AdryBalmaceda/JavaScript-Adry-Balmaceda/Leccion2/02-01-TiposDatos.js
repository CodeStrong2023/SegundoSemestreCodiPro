// Tipos de Datos en JavaScript
/*
La sintaxis en lo que es comentarios
es muy similar a la de Java
realmente diriamos que es identica
Variables: son dinamicas en JavaScript, se puede
modificar el mismo tipo de dato reutilizando la misma
variable 
ctrl+shift+p: para ejecutar
ctrl+s: para guardar
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

// Tipo de dato clase: las clases tambien son funciones
class Persona{
    constructor(nombre,apellido){  // crea un objeto de la clase
        this.nombre = nombre;
        this.apellido = apellido; // this hace referencia a los atributos de nuestra clase
    }
}

console.log(typeof Persona);

// Tipo de dato undefined: lo tenemos automaticamente cuando definimos 
// cualquier tipo de variable cuando no esta inicializada por default
var x;
console.log(typeof x);

