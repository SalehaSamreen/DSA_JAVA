import java.util.*;
public class loops{
    public static void main(String args[]){

        //ques1
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello");
            i+=2;
        }

        //Write a program that reads a set of integers, and then prints the sum of the even and odd integers. 
         Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        // Read numbers from user until user chooses to stop
        do {
            System.out.print("Enter the number: ");
            number = sc.nextInt();

            // Calculate sum of even and odd numbers
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.println("Do you want to continue? 1 for yes, 0 for no");
            choice = sc.nextInt();
        } while (choice == 1);

        // Print sum of even and odd numbers
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        //Write a program to find the factorial of any number entered by the user. 
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact *= i;
        }
        System.out.println("Factorial:"+fact);

        //Write a program to print the multiplication table of a number N, entered by the user. 
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        System.out.println("Multiplication table of " + N + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    } 
}