import java.util.Scanner;

public class drawTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter table number: ");
        int rows =input.nextInt();
        for (int i = 1; i <=10; i++) {

            System.out.println(rows+"*"+i+"="+(rows*i));
        }
        System.out.println("\n");
    }
}
