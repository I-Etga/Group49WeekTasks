package week1;

public class SwapNumbers {

    public static void main(String[] args) {

        int x = 10;
        int y = 15;

        x = y - x;
        y = y - x;
        x = y + x;
        System.out.println("y = " + y);
        System.out.println("x = " + x);


    }

}
