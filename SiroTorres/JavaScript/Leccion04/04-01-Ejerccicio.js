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
//fechaNacimientooo = 2003;
console.log(fechaNacimientooo) //Solo se ejecuta el console anterior


//Ejercicoio 1: Calcular estacion del anio
let mes = 10;
let estacion; //Undefiend
if(mes == 1 || mes == 2 || mes ==12){
    estacion = "Verano";
}
else if(mes == 3 || mes ==4 || mes ==5){
    estacion = "Otonio"
}
else if(mes == 6 || mes == 7 || mes ==8){
    estacion = "Invierno"
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto"
}
console.log("La estacion del anio es: "+estacion);

//Ejercicio 2: Hora del dia
let horaDia = 4;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje = "Es de mañana"
}
else if(horaDia >=12 && horaDia <= 16){
    mensaje = "Es mediodia"
}
else if(horaDia >=17 && horaDia <= 19){
    mensaje = "Es la tarde"
}
else if(horaDia >= 20 && horaDia <= 23){
    mensaje = "Es de noche"
}
else if(horaDia >= 0 && horaDia <= 5){
    mensaje = "Es de madrugada"
}
else{
    mensaje = "Hora incorrecta"
}
console.log(mensaje)


//Estructura Switch(la sintaxis es igual a Java)
switch(mes){//No solo se puede utilizar numero, tambien cadenas
    
    case 1: case 2: case 12:
        estacion = "Verano"
        break;
    case 3: case 4: case 5:
        estacion = "Otonio"
    case 6: case 7: case 8:
        estacion = "Invierno"
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break
    default:
        estacion = "Valor incorrecto";

}
console.log("Bienvenidos a la estacion de: "+estacion)