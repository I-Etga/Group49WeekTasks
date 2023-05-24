package week1;

public class FINRA {
    public static void main(String[] args) {

        Finra();


    }




    public static void Finra() {
        for (int i = 1; i <= 30; i++) {
            String result = "";

            if (i % 3 == 0) {
                result += "FIN";
            }
            if (i % 5 == 0) {
                result += "RA";
            }
            if (result.isEmpty()) {
                result = String.valueOf(i);
            }

            System.out.println(result);
        }
    }




    }








/*
Numbers -- FINRA
Write a method that prints out the numbers from 1 to 30 but;
for numbers which are multiple of 3 print "FIN" instead of the number,
for numbers which are multiple of 5, print "RA" instead of the number,
and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
 */