//Ejercicio 1: calcular estación del año
let mes = 8;
let estacion; //Undefined

if(mes == 12 || mes == 1 || mes == 2){
    estacion = ("Verano");
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = ("Otoño");
} 
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = ("Invierno");
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = ("Primavera");
}
else{
    estacion = ("Valor ingresado incorrecto");
}
console.log("La estación del año según el mes es: "+estacion)

//Ejercicio 2: hora del día
let horaDelDia = 21;
let otraHora;  //Undefined

if(horaDelDia >= 6 && horaDelDia <= 11){
    otraHora = ("La mañana, me levanto y desayuno")
}
else if(horaDelDia >= 12 && horaDelDia <= 13){
    otraHora = ("Mediodia y hora del almuerzo")
}
else if(horaDelDia >= 14 && horaDelDia <= 16){
    otraHora = ("Plena tarde, hago actividades")
}
else if(horaDelDia >= 17 && horaDelDia <= 18){
    otraHora = ("Mediatarde")
}
else if(horaDelDia >=19  && horaDelDia <= 21){
    otraHora = ("Cursado de la tecnicatura")
}
else if(horaDelDia >=22  && horaDelDia <= 23){
    otraHora = ("Cena y después acostarse a dormir")
}
else{
    otraHora = ("Valor incorrecto")
}
console.log("La parte del día es: "+otraHora)

//Estructura Switch (la sintaxis es igual a Java)
switch(mes){ //No solo se pueden utilizar números, también cadenas
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";      
}
console.log("Bienvenido a la estación de: "+estacion)

/*
const: se utiliza para variables constantes que no pueden ser reasignadas
*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento)

//fechaNacimiento = 2003;
//console.log(fechaNacimiento) SOLO SE EJECUTA EL CONSOLE ANTERIOR

//Evitar repetir tu código
//Dry don´t repeat yourself

let days = 4;
switch(days){ 
    case 1:
        console.log("Hoy es Lunes");
        break;
    case 2:
        console.log("Hoy es Martes");
        break;
    case 3:
        console.log("Hoy es Miércoles");
        break;
    case 4:
        console.log("Hoy es Jueves");
        break;   
    case 5:
        console.log("Hoy es Viernes");
        break;    
    case 6:
        console.log("Hoy es Sábado");
        break;    
    case 7:
        console.log("Hoy es Domingo");
        break;   
    default:
        console.log("Eror en el ingreso del día de la semana")    
        break;                  
}

//Esta es la opción mejorada

let days2 = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Viernes"];
function getDay(n){
    if (n < 1 || n > 7){
        throw new Error("Out of range");
    }
    return days2[n-1]
}
console.log(getDay(5))
//Hacer un ejercicio similar al que está hecho, pero ahora con los
//meses del año, debes hacerlo con la estructura switch y luego con
//la función en la opción mejorada.

let qlepasa = 9;
switch(qlepasa){ 
    case 1:
        console.log("Mes de Enero");
        break;
    case 2:
        console.log("Mes de Febrero");
        break;
    case 3:
        console.log("Mes de Marzo");
        break;
    case 4:
        console.log("Mes de Abril");
        break;   
    case 5:
        console.log("Mes de Mayo");
        break;    
    case 6:
        console.log("Mes de Junio");
        break;    
    case 7:
        console.log("Mes de Julio");
        break;   
    case 8:
        console.log("Mes de Agosto");
        break;
    case 9:
        console.log("Mes de Septiembre");
        break;   
    case 10:
        console.log("Mes de Octubre");
        break;   
    case 11:
        console.log("Mes de Noviembre");
        break;   
    case 12:
        console.log("Mes de Diciembre");
        break;          
    default:
        console.log("Eror en el ingreso del mes")
        break;                      
}

let qlepasa2=["Enero", "Febrero","Marzo","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"];
function getMes(n){
    if (n < 1 || n > 12){
        throw new Error("Out of range");
    }
    return qlepasa2[n-1]
}
console.log(getMes(1))