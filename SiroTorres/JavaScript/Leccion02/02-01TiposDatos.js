//Tipos de datos en JavaScript
 /*
 La sintaxis en lo que es comentarios 
 es muy similiar a la de Java
 realmente diriamos que es identica
 */

var nombre = "Siro"; //Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre)
//Tipo numerico
var numero = 3000; //Tipo Numerico
console.log(numero);

var objeto = {
    nombre: "Siro",
    apellido: "Torres",
    edad: "19"

}
console.log(objeto);

//Tipo de dato Boolean
var bandera = true;
console.log(typeof bandera)

// Tipo de dato funcion
//Nos permite reutilizar lineas de coddigo
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de Dato Symbol
var simbolo = Symbol("Mi simbolo");
console.log(typeof simbolo);

//Tipo de dato Clase
//Una clase es una funcion
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;

    }
}

console.log(typeof Persona);

//Tipo de dato undefined
// se asigna undefined cuando la variable no le asignamos ningun valor
var x;
console.log(typeof x);

X = undefined;
console.log(typeof x);

//null: significa auusencia de valor
var y = null; //Null no es un tipo de dato pero su origen es de tipo object
console.log(typeof y);

// Tipo de dato Aray y Empty String
var autos = ['Citroen', 'Audi', 'BMW'];
console.log(autos);
console.log(typeof autos) //Peguntamos que dato es y es:

var z = '';
console.log(z); //Esto se refiere a que es una cadena vacia
console.log(typeof z);
