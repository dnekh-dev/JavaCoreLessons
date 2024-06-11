import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Choose an action:\n\t1 - for addition\n\t2 - for multiplication\n\t3 - obtain absolute value of number");
        String input = scanner.nextLine();
        if (input.equals("1") || input.equals("2")) {
            System.out.println("Enter two integers:");
            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();
            if (input.equals("1")) {
                System.out.println("Result of addition is " + calculator.sum(firstNum, secondNum));
            } else {
                System.out.println("Result multiplication is " + calculator.mult(firstNum, secondNum));
            }
        } else {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            System.out.println("Obtain value is " + calculator.abs(number));
        }
    }
}