import java.util.Scanner;

public class nestIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day(0-6): ");
        int a = sc.nextInt();
        System.out.println("enter time as 24 hours clock(0-23) : ");
        int b = sc.nextInt();

        if (a!=0){
            if (b==9){
                System.out.println("it's office time");
            }
            else {
                System.out.println("he may be in office");

            }
        }
        else {
            System.out.println("It isn't office time yet");
        }

        sc.close();
    }
    
}    