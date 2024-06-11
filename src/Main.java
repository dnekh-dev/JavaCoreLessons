import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Choose an action:\n\t1 - for addition\n\t2 - for multiplication\n\t" +
                "3 - for raising a number to a power\n\t4 - obtain absolute value of number");
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
        } else {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            System.out.println("Absolute value of your number is " + calculator.abs(number));
        }
    }
}