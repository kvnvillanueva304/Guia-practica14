public class Espera2 {
    public static void main(String[] args) {
        System.out.println("Cargando reserva");

        try {
            Thread.sleep(500);
            System.out.println("carga completa");
        } catch (InterruptedException e) {
            System.out.println("Espera interrumpida");
        }

        try {
            Class.forName("Reserva");
        } catch (ClassNotFoundException e) {
            System.out.println("No existe clase que se pide: " + e.getMessage());
        }
    }
}
