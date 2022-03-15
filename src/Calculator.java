import java.util.Scanner;

public class Calculator {

    private static int num1;
    private static int num2;

    public static void add(int num1, int num2) {
        int sum  = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public static void subtract(int num1, int num2) {
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);
    }

    public static void multiply(int num1, int num2) {
        int product = num1 * num2;
        System.out.println("Product: " + product);
    }
    
    public static void divide(int num1, int num2) {
        double quotient = num1 / num2;
        System.out.println("Quotient: " + quotient);
    }

    public static void square(int num1) {
        int squareResult = num1 * num1;
        System.out.println("Square result of number 1: " + squareResult);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Number 1:");
        int num1 = input.nextInt();
        
        System.out.println("Number 2:");
        int num2 = input.nextInt();
        input.close();

        add(num1, num2);
        subtract(num1, num2);
        multiply(num1, num2);
        divide(num1, num2);
        square(num1);

    }
}
