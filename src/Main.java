import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Írj programot, amely meghatározza egy számról, hogy az prímszám-e vagy sem!
        // prímszám: Az a természetes szám, amely csak 1-el és önmagával osztható
        //          --- pontosan két osztólya van: 1 és önmaga
        // természetes: 0-nál nagyobb egész szám (0 is lehet)
        //          nem negatív egész szám
        //          -------------->>>>>>>> 2 a legkisseb prímszám

        System.out.println("----------------- Ver. 1. ----------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number, please: ");
        //int myNumber = sc.nextInt();
        System.out.println("The largest int variable: " + Integer.MAX_VALUE);

        long start = System.nanoTime();

        int myNumber = Integer.MAX_VALUE;
        int counter = 0;
        System.out.println();
        for (int i = 1; i < myNumber ; i++) {
            if (counter > 1){
                break;
            }
            if (myNumber % i == 0){
                counter++;
            }
            if (i % 500000000 == 0) {
                System.out.println("...Still Working...");
            }
        }
        System.out.println();
        if(counter == 1) {
            System.out.println("First result: " + myNumber + " is a prime!");
        }else {
            System.out.println("First result: " + myNumber + " is not a prime!");
        }

        long finish = System.nanoTime() - start;
        double convertToSecond = (double)finish / 1000000000;
        System.out.println();
        System.out.println(finish);
        System.out.println("RunningTime: " + convertToSecond + " second!!!");

        System.out.println();
        System.out.println("---------------- Ver. 2. -------------------");
        System.out.println();

        System.out.println("The largest int variable: " + Integer.MAX_VALUE);
        long start2 = System.nanoTime();
        System.out.println();

        for (int i = 2; i <= myNumber / 2 ; i++) {
            if (counter > 1){
                break;
            }
            if (myNumber % i == 0){
                counter++;
            }
            if (i % 500000000 == 0) {
                System.out.println("...Still Working...");
            }
        }
        System.out.println();

        if(counter == 1) {
            System.out.println("Second result: " + myNumber + " is a prime!");
        }else {
            System.out.println("Second result: " + myNumber + " is not a prime!");
        }

        long finish2 = System.nanoTime() - start2;
        double convertToSecond2 = (double)finish2 / 1000000000;
        System.out.println();
        System.out.println(finish2);
        System.out.println("RunningTime: " + convertToSecond2 + " second!!!");

        System.out.println();
        System.out.println("--------------- Ver. 3. --------------------");
        System.out.println();

        System.out.println("The largest int variable: " + Integer.MAX_VALUE);
        long start3 = System.nanoTime();
        System.out.println();

        boolean isPrime = myNumber > 1;

        for (int i = 2; i <= Math.sqrt(myNumber) ; i++) {

            if (myNumber % i ==0){
                isPrime = false;
            }
            if (i % 500000000 == 0) {
                System.out.println("...Still Working...");
            }
        }
        System.out.println();

        if(isPrime) {
            System.out.println("Third result: " + myNumber + " is a prime!");
        }else {
            System.out.println("Third result: " + myNumber + " is not a prime!");
        }

        long finish3 = System.nanoTime() - start3;
        double convertToSecond3 = (double)finish3 / 1000000000;
        System.out.println();
        System.out.println(finish3);
        System.out.println("RunningTime: " + convertToSecond3 + " second!!!");

        System.out.println();
        System.out.println("--------------- Ver. 4. (with while) ---------------");
        System.out.println();

        System.out.println("The largest int variable: " + Integer.MAX_VALUE);
        long start4 = System.nanoTime();
        int i = 2;
        System.out.println();

        while (isPrime && i <= Math.sqrt(myNumber)){
            if (myNumber % i++ == 0) {
                isPrime = false;
            }
        }
        System.out.println();
        
        if(isPrime) {
            System.out.println("Third result: " + myNumber + " is a prime!");
        }else {
            System.out.println("Third result: " + myNumber + " is not a prime!");
        }

        long finish4 = System.nanoTime() - start4;
        double convertToSecond4 = (double)finish3 / 1000000000;
        System.out.println();
        System.out.println(finish4);
        System.out.println("RunningTime: " + convertToSecond4 + " second!!!");
    }
}