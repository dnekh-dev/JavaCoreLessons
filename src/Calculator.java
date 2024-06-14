public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division be zero!");
        }
        return a / b;
    }

    public int abs(int a) {
        if (a < 0) {
            return a * -1;
        }
        return a;
    }

    public int pow(int a, int b) {
        if (b > 1) {
            int buffer = a;
            while (b > 1) {
                a *= buffer;
                b--;
            }
            return a;
        } else if (b == 1) {
            return a;
        } else if (b == 0) {
            return 1;
        }
        return -1;
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int result = 1;
        for (var i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    //method for checking if number is prime
    public boolean isPrime(int number) {

        // Step 1: If number is less than 2, it is not prime
        if (number < 2) {
            return false;
        }

        // Step 2: Check divisibility from 2 to the square root of the number
        for (var i = 2; i <= Math.sqrt(number); i++) {
            // If the number is divisible by any number in this range, it is not prime
            if (number % i == 0) {
                return false;
            }
        }

        // If no divisors were found, the number is prime
        return true;
    }
}
