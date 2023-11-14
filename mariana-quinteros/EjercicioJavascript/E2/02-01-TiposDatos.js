// Tipos de datos en JavaScript
/*
Comentario de muchas lineas. Sintaxis identica a Java
*/
var nombre = "Ariel"; //Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre)
nombre = 12.3
console.log(typeof nombre)
var numero = 3000; //Tipo Int
console.log(numero)

var objeto = {
    nombre: "Ariel",
    apellido: "Betancud",
    telefono: "2614050823"
}
console.log(objeto)

//Tipos de datos boolean
var bandera = true;
console.log(typeof bandera);

//Tipo de dato función
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

//Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
}

console.log(typeof Persona);

//Tipo de dato undefined
var x;
console.log(typeof x);

x=undefined
console.log(typeof x);

//null: significa ausencia de valor
var y = null; //null no es un tipo de dato, pero su origen es object
console.log(typeof y);

//Tipo de dato Array y Empty String
var autos = ["Citroen","Audi","BMW","Ford"];
console.log(autos); 
console.log(typeof autos) //Preguntamos también que tipo de dato es: 

var z = "";
console.log(z); //Esto se refiere a que es una cadena vacía
console.log(typeof z);

