//Ampliando el usoo dde ver let y const
/*
Con var puedes reasignar en cualquier momento
este forma parte ddel ambito global
Un error es que se sobreescriba
*/

var nombre = 'Ariel';
nombre = 'Osvaldo';
console.log(nombre);

function saludar(){
    var nombre = 'Natalia';
    console.log(nombre);
}
console.log(nombre); //Aqui no lee el dddato en la funcion

if(true){
    var edad = 34;
    console.log(edad);

}
console.log(edad); //En la funcion funciono correctamente, en la estructura if fallo

/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de llaves
o dentro de una funcion
*/
function saludar2(){
    let nombre2 = 'Ariel';
    console.log(nombre2)
}
console.log(nombre2);

if(true){
    let edad = 33;
    console.log(edad);
}
console.log(edad);

/*
const se utiliza para valores constantes que no pueden ser reasignadas
*/

const fechaNacimientooo = 2006;
console.log(fechaNacimientooo)
fechaNacimientooo = 2003;
console.log(fechaNacimientooo) //Solo se ejecuta el console anterior
