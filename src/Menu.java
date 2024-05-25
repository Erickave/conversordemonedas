import java.util.Scanner;

public class Menu {
    public void mostrarMenuConversor(){
        System.out.println("****************************************");
        System.out.println("¡Bienvenido al Conversor de Monedas!");
        System.out.println("1. Dólares >>> Soles");
        System.out.println("2. Soles >>> Dólares");
        System.out.println("3. Euros >>> Soles");
        System.out.println("4. Soles >>> Euros");
        System.out.println("5. Dólares >>> Euros");
        System.out.println("6. Euros >>> Dólares");
        System.out.println("7. Salir");
        System.out.println("Elija una opción válida: ");
        System.out.println("****************************************");
    }
    public int capturarOpcion(){
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        return opcion;
    }
    public double obtenerCantidad(){
        boolean valido = false;
        double cantidad = 0;
        while (valido == false) {
            System.out.println("Ingrese el valor válido que deseas convertir: ");
            Scanner scanner = new Scanner(System.in);
            cantidad = scanner.nextDouble();
            if (cantidad > 0){
                valido = true;
            }
        }
        return cantidad;
    }
}
