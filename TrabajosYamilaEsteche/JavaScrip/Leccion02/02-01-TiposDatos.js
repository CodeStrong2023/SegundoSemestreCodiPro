//Tipos de datos en JavaScript
/*
La sintaxis en lo que es comentario
es muy similar a la de java
realmente diriamos que es identica
*/
var nombre = "Yamila";//Tipo Str
console.log(typeof nombre)
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre)

var numero = 3000; //Tipo Numerico
console.log(typeof numero);

var objeto = {
nombre :"Yamila",
apellido :"Esteche",
telefono :"35229292929"
}

console.log(typeof objeto);

//Tipo de dato boolean

var bandera = true;
console.log(bandera);

//Tipo de dato Funcion

function mifuncion(){}
console.log(mifuncion);

//Tipo de dato symbol

var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

//Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(typeof Persona);

//Tipo de dato undefined
var x;
console.log(typeof x);

x = undefined
console.log(typeof x);

//null: significa ausencia de valor
var y = null; //null no es un tipo de dato, pero su origen es de tipo objet
console.log(typeof y);

//tipo de dato arrey y empy string
var autos = ['Citroen', 'Audi','BMW','Ford'];
console.log(autos)
console.log(typeof autos)//Preguntamos que tipo de dato es:

var z = " ";
console.log(z); //Esto se refiere a que es una cadena vacia:
console.log(typeof z);