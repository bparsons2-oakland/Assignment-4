import java.util.Scanner;

public class StringInverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to be inverted:");
        String original = scanner.nextLine();
        String inverted = new StringBuilder(original).reverse().toString();
        System.out.println(inverted);    
    }
} 