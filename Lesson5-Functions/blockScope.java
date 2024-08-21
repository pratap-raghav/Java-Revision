public class blockScope {
    public static void main(String[] args) {
        // int value = 10;
        {
            int value = 5;
            System.out.println(value);
        }
        // System.out.println(value); 
        // Gives an error- Scope
    }
}
