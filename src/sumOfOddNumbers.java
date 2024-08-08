import java.util.Scanner;

public class sumOfOddNumbers {
    public static void calculation(int num){
        int result = 0;
        for (int i=0; i<=num; i++){
            if(i%2 != 0){
                result+=i;

            }


        }
        System.out.println("The sum of odd numbers is " + result);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculating the odd numbers");
        System.out.print("Enter a number :");
        int num=input.nextInt();
        calculation(num);

    }
}
