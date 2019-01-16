public class Math {

    public boolean isEven(int input) {
        boolean result = input % 2 == 0;
        return result;
    }

    public boolean isOdd(int number) {
        boolean result = !isEven(number);
        return result;
    }

    public double circleField(double r) {
        double result = 3.14 * r * r;
        return result;
    }

    public int power(int number) {
        int result = number * number;
        return result;
    }

}