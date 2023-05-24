package week1;

public class DivideWithoutOperator {
    public static void division(int x, int y) {

        if (x <= 0 || y <= 0) {
            System.err.println(" Numbers can not be zero or negative");
            System.exit(1);
        }

        int count = 0;
        while (x >= y) {
            x -= y;
            count++;
        }

       System.out.println("Division result = " + count);
        System.out.println("Remainder = " + x);
    }

    public static void main(String[] args) {
        division(11, 2);


    }
}
