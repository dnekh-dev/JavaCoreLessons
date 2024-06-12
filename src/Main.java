import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        int userChoice = 0;

        while (userChoice != 7) {

            printMenu();
            userChoice = scanner.nextInt();

            switch(userChoice) {
                case 1, 2, 3, 4:
                    System.out.println("Enter two integers:");
                    int firstNum = scanner.nextInt();
                    int secondNum = scanner.nextInt();

                    if (userChoice == 1) {
                        System.out.println("Result of addition is " + calculator.sum(firstNum, secondNum));
                    } else if (userChoice == 2) {
                        System.out.println("Result multiplication is " + calculator.mult(firstNum, secondNum));
                    } else if (userChoice == 3){
                        try {
                            System.out.println("Result of division is " + calculator.division(firstNum, secondNum));
                        } catch (ArithmeticException ex) {
                            System.out.println(ex.getMessage());
                        }
                    } else {
                        System.out.println("Result of raising first number to a power of second number is " + calculator.pow(firstNum, secondNum));
                    }
                    break;
                case 5, 6:
                    System.out.println("Enter a number:");
                    int number = scanner.nextInt();

                    if (userChoice == 5) {
                        System.out.println(number + "! is " + calculator.factorial(number));
                    } else {
                        System.out.println("Absolute value of your number is " + calculator.abs(number));
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("There is no such option!");
            }
        }

        System.out.println("""
                --------
                See you!
                --------
                """);
    }

    public static void printMenu() {
        System.out.println("""
                --------------------------
                Welcome! Choose an action:
                --------------------------
                    1 - for addition
                    2 - for multiplication
                    3 - for division
                    4 - for raising a number to a power
                    5 - for calculate factorial
                    6 - obtain absolute value of number
                    7 - for exit""");
    }
}