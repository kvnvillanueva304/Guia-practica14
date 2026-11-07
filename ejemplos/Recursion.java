public class Recursion {
    static int contar(int n) {
        return contar(n + 1);
    }

    public static void main(String[] args) {
        try {
            contar(0);
        } catch (StackOverflowError e) {
            System.out.println("Error: " +
                    e.getClass().getSimpleName());
        }

        System.out.println("Error");
    }
}
