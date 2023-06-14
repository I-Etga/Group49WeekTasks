package week1;

<<<<<<< HEAD
=======
import javax.swing.plaf.PanelUI;
import java.util.Scanner;
>>>>>>> 836fc3a606063d726c54632b3c7cf28300d760cc

public class Odd_Even {

    public static void odd_even() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: " );//we will see on console

        int number = scan.nextInt();

        if( number>0 &&  number%2 ==0){
            System.out.println("The given number is even: "+number);
        }else{
            System.out.println("The given number is odd: "+number);
        }

        scan.close();


    }

    public static void main(String[] args) {
        odd_even();
    }


    public static void main(String[] args) {
        System.out.println(oddOrEven(-4));
    }

    public static String oddOrEven(int number) {

        if (number % 2 == 0) {
            return number + " is even";
        }
        return number + " is odd";
    }


}




/* Numbers -- odd & even
        Write a method that can identify  a given number is even or odd.
        EX:
        identify(5) --> "Odd"
        identify(6) --> "Even"
        */
