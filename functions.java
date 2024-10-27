import java.util.*;
public class functions{
    public static void main(String args[]){
        avg(3,5,7);

        boolean ans=isEven(68);
        System.out.println(ans);

        isPalindrome(1234321);

        sumOfDigits(567);
    }

    //Write a Java method to compute the average of three numbers.. 
    public static void avg(int a,int b,int c){

         System.out.println("The average is " + (a+b+c)/3);
    }

    //Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method. 
    public static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        } else {
           return false;
        }
    }

    //Write a Java program to check if a number is a palindrome in Java?
    public static void isPalindrome(int num){
        int originalNum=num;
        int reverseNum=0;
        while(num>0){
            int lastDigit=num%10;
            reverseNum=reverseNum*10+lastDigit;
            num=num/10;
        }
        if(originalNum==reverseNum){
        System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }

    //Write a Java method to compute the sum of the digits in an integer. 
    public static void sumOfDigits(int Number){
        int sum=0;
        while(Number>0){
            int lastDigit=Number%10;
            Number=Number/10;
            sum=sum+lastDigit;
        }
        System.out.println(sum);
    }

}