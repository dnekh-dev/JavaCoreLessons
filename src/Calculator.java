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
}
