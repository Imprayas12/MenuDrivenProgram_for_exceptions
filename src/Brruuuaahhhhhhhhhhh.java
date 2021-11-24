import java.util.InputMismatchException;
import java.util.Scanner;

public class Brruuuaahhhhhhhhhhh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=1;
        while(k>0) {
            System.out.println("==========================Hellyoo==================");
            System.out.println("=====================You have the following choices===========");
            System.out.println("1.Interrupted Exception");
            System.out.println("2.Input Mismatch Exception");
            System.out.println("3.Arithmetic Exception");
            System.out.println("4.Array Index out of bounds Exception.");
            System.out.println("5.Number format exception");
            int choice;
            System.out.println("========Enter your choice my boiii=======");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        System.out.println("Hehe ruk gaya");
                    }
                }
                case 2 -> {
                    try {
                        System.out.println("Enter a number to raise input mismatch exception.");
                        int a = sc.nextInt();
                    } catch (InputMismatchException ob) {
                        System.out.println("Input mismatch exception Raised");
                    }
                }
                case 3 -> {
                    try {
                        System.out.println(10 / 0);
                    } catch (ArithmeticException obj) {
                        System.out.println("Arithmetic exception raised");
                    }
                }
                case 4 -> {
                    int[] b = new int[10];
                    try {
                        System.out.println("Size of array is 10");
                        System.out.println("Enter an index to print");
                        int d = sc.nextInt();
                        System.out.println(b[d]);
                    } catch (ArrayIndexOutOfBoundsException obj) {
                        System.out.println("Array index out of bounds exception raised");
                    }
                }
                case 5 -> {
                    try {
                        int a = Integer.parseInt(null);
                    } catch (NumberFormatException obj) {
                        System.out.println("Number format exception");
                    }
                }
                default -> System.out.println("Please enter a choice from list only");
            }
            System.out.println("If want to exit enter 0");
            k= sc.nextInt();
        }
    }
}
