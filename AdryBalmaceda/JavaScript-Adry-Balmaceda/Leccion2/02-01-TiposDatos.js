// Tipos de Datos en JavaScript
/*
La sintaxis en lo que es comentarios
es muy similar a la de Java
realmente diriamos que es identica
Variables: son dinamicas en JavaScript, se puede
modificar el mismo tipo de dato reutilizando la misma
variable 
ctrl+shift+p: para ejecutar y para parar la ejecucion
ctrl+s: para guardar
typeof: sintaxis para mostrar el tipo de dato

Archivo index.html: clic derecho + open in browser
se abre el navegador: clic derecho + inspeccionar
pestaña consola: boton F5 para actualizar la pagina
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

x = undefined;
console.log(typeof x);

// null: significa ausencia de valor
var y = null;  // null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

// Tipo de dato array y Empty String
// Los arreglos en Javascript son de tipo object, diferencia con Java
var autos = ['Citroen', 'Audi', 'BMW', 'Ford'];
console.log(autos);
console.log(typeof autos);  // preguntamos que tipo de dato es:

var z = '';  // si no pusieramos = '' nos mostraria undefined
console.log(z);  // esto se refiere a que es una cadena vacia:
console.log(typeof z)