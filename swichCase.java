import java.util.Scanner;
public class swichCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number to the operation: ");
        int a = sc.nextInt();
        System.out.println("enter any operation-(+,-,*,/,%) :");
        char operator = sc.next().charAt(0);
        System.out.println("enter second number : ");
        int b = sc.nextInt();
        switch (operator){
            case '+':
                System.out.println("addition : "+(a+b));
                break;
            case '-': 
                System.out.println("subtraction : "+(a-b));
                break;
            case '*': 
                System.out.println("multiplication : "+(a*b));
                break;
            case '/': 
                if (a==0||b==0){
                    System.out.println("Invalid values");
                }
                else{
                    System.out.println("division : "+(a/b));
                }
                break;
            case '%': 
                 if (a==0||b==0){
                    System.out.println("Invalid values");
               }
                else{
                    System.out.println("mode : "+(a%b));
                }
                break;
            default: 
                System.out.println("enter a valid operation");

        }
        sc.close();
    }
}