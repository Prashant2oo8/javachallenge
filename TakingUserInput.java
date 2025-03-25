import java.util.Scanner;

public class takingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        int num = sc.nextInt();
        int sqr = num*num;
        System.out.println("the square will be "+sqr);
        sc.close();
    }
    
}    