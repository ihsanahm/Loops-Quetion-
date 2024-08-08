import java.util.Scanner;

public class drawTable {
    public static  void mutiplicationOfNimbers(int num){
        for (int i = 1; i <=10; i++) {

            System.out.println(num+"*"+i+"="+(num*i));
        }
        System.out.println("\n");
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication world!\n ");
        System.out.print("Enter table number: ");
        int num=input.nextInt();
        mutiplicationOfNimbers(num);


     }
}
