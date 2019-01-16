public class MathTest {

    public static void main(String[] args) {
        Math math = new Math();
        boolean isEvenWhenTwo = math.isEven(2);
        System.out.println("Is 2 even? " + isEvenWhenTwo);

        boolean isOddWhenThree = math.isOdd(3);
        System.out.println("Is 3 odd? " + isOddWhenThree);

        double field = math.circleField(1.0);
        System.out.println("Circle field is: " + field);

        int power = math.power(2);
        System.out.println("Power = " + power);

    }

}