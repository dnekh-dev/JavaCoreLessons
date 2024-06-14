import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var calculator = new Calculator();
        var scanner = new Scanner(System.in);

        var userChoice = 0;

        while (userChoice != 8) {

            printMenu();
            userChoice = scanner.nextInt();

            switch(userChoice) {
                case 1, 2, 3, 4:
                    System.out.println("Enter two integers:");
                    var firstNum = scanner.nextInt();
                    var secondNum = scanner.nextInt();

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
                case 5, 6, 7:
                    System.out.println("Enter a number:");
                    var number = scanner.nextInt();

                    if (userChoice == 5) {
                        System.out.println(number + "! is " + calculator.factorial(number));
                    } else if (userChoice == 6) {
                        System.out.println("Absolute value of your number is " + calculator.abs(number));
                    } else {
                        System.out.println("The number is " + (calculator.isPrime(number) ? "Prime" : "Not Prime"));
                    }
                    break;
                case 8:
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
                    7 - for checking if number is prime
                    8 - for exit""");
    }
}