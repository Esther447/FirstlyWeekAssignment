import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
        public static double add(double a, double b){
            return a + b;
        }
        public static double subtract(double a, double b){
            return a - b;
        }
        public static double multiply(double a, double b){
            return a * b;
        }
        public static double divide(double a, double b){
            if (b == 0){
                System.out.println("Divide by zero is not allowed");
                return 0;
            }
            return a / b;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");
        System.out.println("Available operators: +  -  *  /  %");
        System.out.println("Type 'exit' to quit the program.");

        while (true) { // infinite loop until exit
            System.out.print("\nEnter first number (or type 'exit' to quit): ");
            if (scanner.hasNext("exit")) {  // if user types exit
                System.out.println("Goodbye!");
                break;
            }
            double num1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    result = divide(num1, num2);
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    break;
                case '%':
                    result = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + result);
                    break;
                default:
                    System.out.println("Invalid operator! Please choose +, -, *, /, or %.");
            }
        }

        scanner.close();
    }
}