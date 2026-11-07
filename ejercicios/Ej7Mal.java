// clase de ejemplo
public class Ej7Mal {
    public static void main(String[] args) {
        try {
            Class.forName("Cuarto");
            int n = Integer.parseInt("x");
        } catch (RuntimeException e) {
            System.out.println("corriendo");
        } catch (NumberFormatException e) {
            System.out.println("clase");
        }
    }
}
