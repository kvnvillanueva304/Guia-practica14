public class Multi {
    public static void main(String[] args) {
        String[] noches = {"3", "x", null};

        for (String n : noches) {
            try {
                System.out.println("Noche: " + Integer.parseInt(n.trim()));
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("Dato incorrecto: "
                        + e.getClass().getSimpleName());
            }
        }
    }
}
