import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

           Menu menu = new Menu();
           Convertidor convertidor = new Convertidor();
           int opcion = 0;
           double monto = 0;
           while(opcion != 7){
               menu.mostrarMenuConversor();
               opcion = menu.capturarOpcion();
               if (opcion > 0 && opcion <= 7){
                   switch (opcion) {

                       case 1:
                           monto = menu.obtenerCantidad();
                           convertidor.conversor("usd","pen",monto);
                           break;
                       case 2:
                           monto = menu.obtenerCantidad();
                           convertidor.conversor("pen","usd",monto);
                           break;
                       case 3:
                           monto = menu.obtenerCantidad();
                           convertidor.conversor("eur","pen",monto);
                           break;
                       case 4:
                           monto = menu.obtenerCantidad();
                           convertidor.conversor("pen","eur",monto);
                           break;
                       case 5:
                           monto = menu.obtenerCantidad();
                           convertidor.conversor("usd","eur",monto);
                           break;
                       case 6 :
                           monto = menu.obtenerCantidad();
                           convertidor.conversor("eur","usd",monto);
                           break;
                       default:
                           opcion = 7;
                           System.out.println("Estás saliendo del sistema.");
                   }


               } else {
                   System.out.println("Ingrese opción válida");
               }

           }
    }
}
