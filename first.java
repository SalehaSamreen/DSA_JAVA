import java.util.*;

public class first {
    public static void main(String args[]){
        //Sum of two numbers
    int num1 = 5;
    int num2 = 7;
    int sum = num1 + num2;
    System.out.println("Sum of two numbers is: " + sum);

    //Average of 3 numbers
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int avg = (a + b + c) / 3;
    System.out.println("Average of three numbers is: " + avg);

    //Area of a square
    System.out.println("Enter the side of the square: ");
    int side = sc.nextInt();
    int area = side * side;
    System.out.println("Area of square is:" + area);

    //Stationary bill
    System.out.println("Enter cost of the pencil: ");
    float pencil = sc.nextFloat();
    System.out.println("Enter cost of the pen: ");
    float pen = sc.nextFloat();
    System.out.println("Enter cost of the eraser: ");
    float eraser = sc.nextFloat();
    float totalCost = pencil + pen + eraser;
    float gst = totalCost * 0.18f;
    float totalwithgst = totalCost + gst;
    System.out.println("Total cost without GST:"+ totalCost);
    System.out.println("Total cost with GST:"+ totalwithgst);

    //Expression
    byte x = 4;
    char y = 'a';
    short s = 512;
    int i = 1000;
    float f = 3.14f;
    double d = 99.9954;
    double result = (f * b) + (i % c) - (d * s);
    System.out.println("Result of expression is:"+ result);
    }
}