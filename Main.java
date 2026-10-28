public class Main {
    public static void main(String[] args) {
        // --- 1. DATA TYPES ---
        int a = 15;
        double b = 4.5;
        char grade = 'A';
        boolean isActive = true;

        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Char: " + grade);
        System.out.println("Boolean: " + isActive);

        // --- 2. BASIC OPERATORS ---
        // Arithmetic Operators (+, %)
        int sum = a + 10;
        int rem = a % 4;
        System.out.println("Sum: " + sum);
        System.out.println("Remainder: " + rem);

        // Relational Operator (>)
        boolean isGreater = a > 10;
        System.out.println("Is a > 10? " + isGreater);

        // Logical Operator (&&)
        boolean check = (a > 10) && isActive;
        System.out.println("Logical AND Result: " + check);

        // Assignment Operator (+=)
        a += 5; // a = a + 5
        System.out.println("Updated a: " + a);
    }
}