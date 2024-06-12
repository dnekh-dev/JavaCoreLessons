import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Welcome! Choose an action:
                    1 - for addition
                    2 - for multiplication
                    3 - for division
                    4 - for raising a number to a power
                    5 - for calculate factorial
                    6 - obtain absolute value of number""");

        String userChoice = scanner.nextLine();

        switch(userChoice) {
            case "1", "2", "3", "4":
                System.out.println("Enter two integers:");
                int firstNum = scanner.nextInt();
                int secondNum = scanner.nextInt();

                if ("1".equals(userChoice)) {
                    System.out.println("Result of addition is " + calculator.sum(firstNum, secondNum));
                } else if ("2".equals(userChoice)) {
                    System.out.println("Result multiplication is " + calculator.mult(firstNum, secondNum));
                } else if ("3".equals(userChoice)){
                    try {
                        System.out.println("Result of division is " + calculator.division(firstNum, secondNum));
                    } catch (ArithmeticException ex) {
                        System.out.println(ex.getMessage());
                    }
                } else {
                    System.out.println("Result of raising first number to a power of second number is " + calculator.pow(firstNum, secondNum));
                }
                break;
            case "5", "6":
                System.out.println("Enter a number:");
                int number = scanner.nextInt();

                if ("5".equals(userChoice)) {
                    System.out.println(number + "! is " + calculator.factorial(number));
                } else {
                    System.out.println("Absolute value of your number is " + calculator.abs(number));
                }
                break;
            default:
                System.out.println("There is no such option!");
        }
    }
}