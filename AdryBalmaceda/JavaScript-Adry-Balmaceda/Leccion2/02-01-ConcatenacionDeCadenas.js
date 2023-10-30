var nombre = 'Jose';
var apellido = 'Montes';
var nombreCompleto = nombre+' '+apellido;
console.log(nombreCompleto);
var nombreCompleto2 = 'Felipe'+' '+'Astudillo';
console.log(nombreCompleto2);
var juntos = nombre + 219;  // lee de izq a der siguiendo la cadena como de tipo string
console.log(juntos);
juntos = nombre + 78 + 17;  // aqui se puede diferenciar a traves de los parentesis
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);
// a esto se lo llama contexto string o contexto cadena