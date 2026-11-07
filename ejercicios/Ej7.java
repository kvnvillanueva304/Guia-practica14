public class Ej7 {
    public static void main(String[] args) {
        try {
            Class.forName("Cuarto");
            int n = Integer.parseInt("x");
        } catch (NumberFormatException e) {
            System.out.println("Formato");
        } catch (RuntimeException e) {
            System.out.println("Corriendo");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no valida: " + e.getMessage());
        }
    }
}
