import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day(0-6): ");
        int day = sc.nextInt();
        if (day==0||day==6){
            System.out.println("weekoff");
        }
        else {
            System.out.println("office day");
        }

        sc.close();
    }
    
}    