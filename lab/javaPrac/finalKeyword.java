public class finalKeyword {
    public static void main(String[] args) {
        final int x = 10;
        x = 20; // Compilation error: cannot assign a value to final variable
        
        final String message = "Hello";
        message = "World"; // Compilation error: cannot assign a value to final variable
        
    }
}
