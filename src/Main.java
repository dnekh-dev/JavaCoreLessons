import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Choose an action:\n\t1 - for addition\n\t2 - for multiplication");
        String input = scanner.nextLine();
        System.out.println("Enter two integers:");
        int firstNum = scanner.nextInt();
        scanner.nextLine();
        int secondNum = scanner.nextInt();
        if (input.equals("1")) {
            System.out.println("Result of addition is " + calculator.sum(firstNum, secondNum));
        } else {
            System.out.println("Result multiplication is " + calculator.mult(firstNum, secondNum));
        }
    }
}