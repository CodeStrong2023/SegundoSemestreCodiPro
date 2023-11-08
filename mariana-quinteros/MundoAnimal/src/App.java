import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigop;
        boolean precioEncontrado = false;

        do {
            System.out.println("1: Kit: Cama chica, manta chica, ropa");
            System.out.println("2: Kit: Cama grande, manta grande, ropa");
            System.out.println("3: Kit: Shampoo, cepillo, toalla chica");
            System.out.println("4: Kit: Shampoo, cepillo, toalla grande");
            System.out.println("5: Kit: correa, pretal chico, porta bolsa para juntar heces");
            System.out.println("6: Kit: correa, pretal chico, porta bolsa para juntar heces");

            try {
                System.out.print("Digite el código de producto que desea: ");
                codigop = scanner.nextInt();

                switch (codigop) {
                    case 1:
                        System.out.println("Kit: Cama chica, manta chica, ropa");
                        System.out.println("Precio: 3000");
                        precioEncontrado = true;
                        break;
                    case 2:
                        System.out.println("Kit: Cama grande, manta grande, ropa");
                        System.out.println("Precio: 3500");
                        precioEncontrado = true;
                        break;
                    case 3:
                        System.out.println("Kit: Shampoo, cepillo, toalla chica");
                        System.out.println("Precio: 4000");
                        precioEncontrado = true;
                        break;
                    case 4:
                        System.out.println("Kit: Shampoo, cepillo, toalla grande");
                        System.out.println("Precio: 4500");
                        precioEncontrado = true;
                        break;
                    case 5:
                        System.out.println("Kit: correa, pretal chico, porta bolsa para juntar heces");
                        System.out.println("Precio: 5000");
                        precioEncontrado = true;
                        break;
                    case 6:
                        System.out.println("Kit: correa, pretal chico, porta bolsa para juntar heces");
                        System.out.println("Precio: 5500");
                        precioEncontrado = true;
                        break;
                    default:
                        System.out.println("Producto no registrado, ingrese otro producto");
                        precioEncontrado = false;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Ingrese un número entero.");
                scanner.nextLine(); // Limpia el búfer del scanner
            }
        } while (!precioEncontrado);

}
    
    
}