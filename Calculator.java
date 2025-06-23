import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println(" Java Console Calculator ");

        while (true) {
            System.out.print("\nEnter first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /) or x to exit: ");
            operator = scanner.next().charAt(0);

            if (operator == 'x' || operator == 'X') {
                System.out.println("Exiting Calculator ");
                break;
            }

            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
