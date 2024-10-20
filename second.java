import java.util.*;
public class second {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //Write a Java program to get a number from the user and print whether it is positive or negative.
        System.out.println("Enter a number:"); 
        int num=sc.nextInt();
        if(num%2 == 0){
            System.out.println("It is Even.");
        } else {
            System.out.println("Ti is odd.");
        }

        //You have a fever if your temperature is above 100 and otherwise prints You don't have a fever. 
         System.out.println("Enter a temperature:");
        double temp=sc.nextDouble();
        if(temp>100){
            System.out.println("You have a fever.");
        } else {
            System.out.println("You don't have a fever.");
        }

        //Write a Java program to input week number(1-7) and print day of week name using switch case. 
         System.out.println("Enter the day number: ");
        int weeknum=sc.nextInt();
        switch(weeknum){
            case 1:System.out.println("Sunday");
                   break;
            case 2:System.out.println("Monday");
                  break;
            case 3:System.out.println("Tuesday");
                   break;
            case 4:System.out.println("Wednesday");
                   break;
            case 5:System.out.println("Thursday");
                   break;
            case 6:System.out.println("Friday");
                   break;
            case 7:System.out.println("Saturday");
                   break;
            default:System.out.println("Invalid Input");
        }

        //Write a Java program that takes a year from the user and print whether that year is a leap year or not. 
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

