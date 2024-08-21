import java.util.Scanner;

public class b2d {
    static float convert(int bits){
        int counter = 0;
        float value = 0;
        while(bits!=0){
            int temp = bits%10;
            bits /= 10;
            value += temp*(Math.pow(2, counter));
            // System.out.println(value);
            counter++;
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bits- ");
        int bits = sc.nextInt();
        System.out.println("Binary to Decinal- "+convert(bits));
        sc.close();
    }
}
