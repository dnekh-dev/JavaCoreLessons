import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Welcome! Choose an action:
                    1 - for addition
                    2 - for multiplication
                    3 - for raising a number to a power
                    4 - for calculate factorial
                    5 - obtain absolute value of number""");
        String input = scanner.nextLine();
        if ("1".equals(input) || "2".equals(input) || "3".equals(input)) {
            System.out.println("Enter two integers:");
            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();

            if ("1".equals(input)) {
                System.out.println("Result of addition is " + calculator.sum(firstNum, secondNum));
            } else if ("2".equals(input)) {
                System.out.println("Result multiplication is " + calculator.mult(firstNum, secondNum));
            } else {
                System.out.println("Result of raising first number to a power of second number is " + calculator.pow(firstNum, secondNum));
            }
        } else if ("4".equals(input) || "5".equals(input)) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();

            if ("4".equals(input)) {
                System.out.println(number + "! is " + calculator.factorial(number));
            } else {
                System.out.println("Absolute value of your number is " + calculator.abs(number));
            }
        }
    }
}