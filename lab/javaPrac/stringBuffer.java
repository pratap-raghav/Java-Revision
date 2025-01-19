public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World!");

        System.out.println("StringBuffer content: " + stringBuffer);

        stringBuffer.insert(5, " Java");

        System.out.println("Modified StringBuffer content: " + stringBuffer);

        stringBuffer.reverse();

        System.out.println("Reversed StringBuffer content: " + stringBuffer);
    }
}
