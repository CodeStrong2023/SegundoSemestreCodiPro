//Comentario de una linea

/* comentario de varias lineas
mas
y mas
*/

var nombre = "Emilia"; //Tipo str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre);

var nro = 300;
console.log(nro);

var objeto = {
    nombre: "Emilia",
    apellido: "Bazán",
    telefono: "29942334556"
}

console.log(objeto);

//Tipo de dato booleano

var bandera = true;
console.log(bandera);

//Tipo de dato funcion (qu enos permite reutilizar lineas de codigo)

function miFuncion() { }
console.log(typeof miFuncion);

//Tipo de dato symbol

// var simbolo = symbol("Mi simbolo");
// console.log(simbolo);

//Tipo de date clase

class Persona {
    constructor(nombre, aopellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(Persona);

//Tipo de dato undefined

var x;
console.log(typeof x);

x = undefined;
console.log(x);
//Null: significa ausencia de valor
var y = null; //null no es un tipo de dato pero su origen es object
console.log(typeof y);

//Tipo de dato array y Empty String
var autos = ["Citroen", "Audi", "BMW", "Ford"];
console.log(typeof autos);

var z = ""; //Cadena vacía
console.log(z);
console.log(typeof z);