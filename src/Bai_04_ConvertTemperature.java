import java.util.Scanner;

public class Bai_04_ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**********MENU**********");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Type Fahrenheit Degree: ");
                    float fahrenheit = Float.parseFloat(scanner.nextLine());
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Type Celsius Degree: ");
                    float celsius = Float.parseFloat(scanner.nextLine());
                    System.out.println("Fahrenheit to Celsius: " + celsiusToFahrenheit(celsius));
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Re-type your choice 1 - 3");
                    break;
            }
        } while (true);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double Fahrenheit = celsius * (9.0 / 5) + 32;
        return Fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
