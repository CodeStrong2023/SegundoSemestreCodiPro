/*
HERENCIA PARTE 1
Modificadores de acceso:
 *modificador private: no se heredan a las clases hijas
 *modificador protected: si queremos que las clases hijas puedan acceder
no importa que las clases hijas esten en otro paquete porque podran acceder
esta pensado para el concepto de HERENCIA
 *sino ponemos modificador: sera default o package en las clases que 
esten dentro del mismo paquete

Constructor:
 *void: vacio para crear objetos sin necesidad de inicializar los
atributos de la clase
 *con parametros: el constructor vacio o por defecto automaticamente
no se va a crear y lo vamos a poner nosotros
 *deben ser de tipo public: llevan el mismo nombre de la clase

 *clic+boton der+insert Code: para generar los constructores
Constructor...
y generar metodos:
Getter and Setter...
toString()...

 *todas las clases heredan de la clase object
por eso el @Override: se sobreescribe el metodo toString

HERENCIA PARTE 2
 *cambio de atributos a private: ocurre cuando cargamos los metodos
getter and setter y al cargar toString
entonces los volvemos a su estado protected porque estamos 
trabajando con HERENCIA
Tenerlo en cuenta para trabajar con herencia
 *protected: es el tipo de encapsulamiento que utilizamos para
trabajar con la HERENCIA

 *constructores y metodos: tipo public cuando hay encapsulamiento
 *sobrecarga de constructores: 2 o más constructores de una misma clase
con diferentes parametros y argumentos
mismo identificador ej Persona, los parametros los hacen diferente
permite tener mas de 1 opcion para crear objetos de la 
clase padre a la clase hija
 */
package domain;

/*
 * @Adrybalmaceda
 */
public class Persona {

    // Atributos de herencia
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    // Constructor 1 vacio: es para crear objetos sin necesidad de
    //inicializar los atributos de la clase
    public Persona() {

    }

    // Constructor 2
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Constructor 3
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    // Metodo toString: sin usar StringBuilder

//    @Override // sobreescribe
//    public String toString() { // metodo de la clase padre Object
//        return "Persona{" + "nombre= " + nombre + ", genero= " + genero + ", edad= " + edad + ", direccion= " + direccion + '}';
//   
    // Metodo toString: usando StringBuilder para que sea mas eficiente
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
