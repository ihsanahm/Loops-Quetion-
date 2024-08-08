import java.util.Scanner;

public class lcmOfTwoNumbers {
    public int lcmOfTwoNumbers(){
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to LCM Calculator of two numbers ");
        System.out.print("Enter  number one :");
        int num1 = input.nextInt();
        System.out.print("Enter  number two :");
        int num2 = input.nextInt();
       int i=1;
       while (true){
           int factor = num1*i;
           if (factor%num2==0){

               return factor;
           }
           i++;
       }
    }
    public static void main(String[] args) {
        lcmOfTwoNumbers lcm=new lcmOfTwoNumbers();
        System.out.println("The lcm Of two numbers are :"+( lcm.lcmOfTwoNumbers()));


    }
}
