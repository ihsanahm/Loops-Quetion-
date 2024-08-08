import java.util.Scanner;

public class sumOfIntegerNumbers {
     int sumOfIntegerNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <=number; i++) {
            int value=0;
            value = number%10;
            sum += value;
            number/=10;
        }
       // System.out.println("The sum of the numbers is : " + sum);
        return sum;  // return the sum of the numbers
    }
    public static void main(String[] args) {
        sumOfIntegerNumbers sum = new sumOfIntegerNumbers();
        System.out.println(STR."The sum of the numbers is : \{sum.sumOfIntegerNumbers()}");



    }
}
