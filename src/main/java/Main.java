import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hej världen");
        System.out.println("Mitt namn är Michael ");
        System.out.println("Dagens datum är 2026-0");

         */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pris på varan: ");
        double productPrice = scanner.nextDouble();
        int percentageDiscount = 27;
        double discount = productPrice * percentageDiscount / 100.0;
        double finalPrice = productPrice - discount;
        System.out.println("Original pris: " + productPrice + " kr" + ", pris efter rabatt: " + finalPrice + " kr");
        scanner.close();

         */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej vad heter du");
        String name = scanner.nextLine();
        System.out.println("Hur gammal är du: ");
        int age = scanner.nextInt();

        System.out.println("Hej " + name + ", du är: " + age + " gammal.");

         */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv tempraturen i celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9 / 5.0 + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("%.2f(Celsius) är %.2f(Fahrenheit)%n", celsius, fahrenheit);
        System.out.printf("%.2f(Celsius) är %.2f(kelvin)%n", celsius, kelvin);
        scanner.close();

         */
        /*
        //Räknare

        Scanner scanner = new Scanner(System.in);
        System.out.println("Värde A: ");
        int a = scanner.nextInt();
        System.out.println("Värde B:");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.printf("%d + %d är lika med: %d%n", a, b, sum);
        scanner.close();

         */
        /*
        //BMI-räknare
        Scanner scanner = new Scanner(System.in);
        System.out.println("ditt namn: ");
        String name = scanner.nextLine();
        System.out.println("din längd: ");
        int length = scanner.nextInt();
        System.out.println("din vikt: ");
        int weight = scanner.nextInt();
        double heightInMeters = length/100.0;
        double bmi = weight / (heightInMeters * heightInMeters);
        if (bmi >= 18.5 && bmi < 25){
            System.out.println("**standard vikt**");

        }else if(bmi > 25){
            System.out.println("**över vikt**");
        } else if (bmi < 18.5) {
            System.out.println("**under vikt**");
        };
        double inMeter = length *0.01;
        System.out.println("din längd i meter är " +inMeter + " meter" );
        System.out.printf("Hej %s!%nDin längd är %d cm och din vikt är %d kg, du har BMI %.2f%n",
                name, length, weight, bmi);
                
         */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv 1-7");
        int tal = scanner.nextInt();
        String veckodag = "";
        switch (tal) {
            case 1 -> {
                veckodag = "måndag";
            }
            case 2 -> {
                veckodag = "tisdag";
            }
            case 3 -> {
                veckodag = "onsdag";
            }
            case 4 -> {
                veckodag = "torsdag";
            }
            case 5 -> {
                veckodag = "fredag";
            }
            case 6 -> {
                veckodag = "lördag";
            }
            case 7 -> {
                veckodag = "söndag";
            }
        }
        System.out.println(veckodag);
        scanner.close();

         */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("time to take off: ");
        int tal = scanner.nextInt();

        for (int i = tal; i >= 0; i--){
            System.out.println(i);
            if(i == 0){
                System.out.println("take off!");
            };
        };
         */

        //Fizzbuzz
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv ett tal:");
        int tal = scanner.nextInt();

        if (tal % 3 == 0 && tal % 5 == 0) {
            System.out.println("fizzbuzz");
        } else if (tal % 5 == 0) {
            System.out.println("fizz");
        } else if (tal % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("neither");
        }

        scanner.close();

         */



    }
}