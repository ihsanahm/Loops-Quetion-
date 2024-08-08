import java.util.Scanner;

public class factorial {
    public  static int FactorialCalculator(int factorial) {
        if (factorial == 0) {
            return 1;
        } else {
            return factorial * FactorialCalculator(factorial - 1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to factorial calculator ");
        System.out.print("Enter a number to calculate factorial :");
        int factorial = in.nextInt();
        System.out.println(STR."The fcatorial are \{FactorialCalculator(factorial)}");


    }
}
