package week1;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Odd_Even {

    public static void main(String[] args) {

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


}




/* Numbers -- odd & even
        Write a method that can identify  a given number is even or odd.
        EX:
        identify(5) --> "Odd"
        identify(6) --> "Even"
        */
