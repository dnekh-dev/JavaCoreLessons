public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int mult(int a, int b) {
        return a * b;
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
}
