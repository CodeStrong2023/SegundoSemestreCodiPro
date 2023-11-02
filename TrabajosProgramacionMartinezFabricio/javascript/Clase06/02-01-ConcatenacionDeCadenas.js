var nombre = "Jose";
var apellido = " Montes";
var nombreCompleto = nombre+" "+apellido; //Primera concatenación
console.log(nombreCompleto);
var nombreCompleto2 = "Ariel"+" "+"Betancud"; //Segunda concatenación
console.log(nombreCompleto2);
var juntos = nombre + 219; //Lee de izq a der siguiendo la cadena lee el numero como str
console.log(juntos)
juntos = nombre+(78+17); //Aquí se puede diferenciar a través de los parentesis
console.log(juntos);
juntos = 78+17+nombre;
console.log(juntos);

nombre += apellido; //Tercera concatenación usando el operador simplificado
console.log(nombre)