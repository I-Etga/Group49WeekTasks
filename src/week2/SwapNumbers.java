package week2;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        a = a * b;//50
        b = a / b;//50/10==5
        a = a / b;//50/5==10

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
/*
Numbers – Swap Numbers
Swap two variables' values without using a third variable.
*/

/*
By multiplying a and b, we store the combined value in a.
Then, by dividing a by b, we obtain the original value of b and store it in b.
Finally, by dividing the new value of a by the new value of b, we get the original value of a and store it back in a.
*/