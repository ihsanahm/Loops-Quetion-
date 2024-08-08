import java.util.Scanner;

public class sumOfNaturalNumbers {
    public void sumOfIntergerNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to integer calculator!");
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        int sum=0;
        for (int i = 0; i <=num1; i++){
            sum+=i;

        }
        System.out.println("The sum of the numbers is :"+sum);
    }
    public static void main(String[] args) {
        sumOfNaturalNumbers sum = new sumOfNaturalNumbers();
        sum.sumOfIntergerNumbers();

    }
}
