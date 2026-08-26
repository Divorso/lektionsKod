import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hej världen");
        System.out.println("Mitt namn är Michael ");
        System.out.println("Dagens datum är 2026-0");

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pris på varan: ");
        double productPrice = scanner.nextDouble();
        int percentageDiscount = 33;
        double discount = productPrice * percentageDiscount / 100.0;
        double finalPrice = productPrice - discount;
        System.out.println("Original pris: " + productPrice + " kr" + ", pris efter rabatt: " + finalPrice + " kr");
        scanner.close();
    }
}