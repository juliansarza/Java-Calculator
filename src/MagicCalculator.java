import java.util.Scanner;

public class MagicCalculator {
    
    private static int num1;
    private static int num2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Number 1:");
        int num1 = input.nextInt();

        double a = Math.toRadians(num1);

        double sqrt = Math.sqrt(a);
        System.out.println("Square root: " + sqrt);

        double sin = Math.sin(a);
        System.out.println("Sine: " + sin);

        double cos = Math.cos(a);
        System.out.println("Cosine: " + cos);

        double tan = Math.tan(a);
        System.out.println("Tangent: " + tan);

        int fact = 1;
        int number = num1;

        for (int i = 1; i < number; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}
 