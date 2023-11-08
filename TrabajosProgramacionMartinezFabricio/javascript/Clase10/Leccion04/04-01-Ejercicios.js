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
