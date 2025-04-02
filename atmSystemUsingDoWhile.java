import java.util.Scanner;
public class atmSystemUsingDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int realPin = 1432;
        int enterPin;
        int attempt = 0;
        final int maxAttempt = 3;
        do{
            System.out.println("Please! Enter your PIN: ");
            enterPin = sc.nextInt();
            attempt++;
            if(enterPin != realPin){
                System.out.println((maxAttempt-attempt)+" attempt left... Please! Enter your correct PIN: ");
            }else{
                System.out.println("Welcome to the ATM system.");
                break;
            }
        }while(attempt<=maxAttempt);

        if(enterPin != realPin){
            System.out.println("Too mant failed attempt. your ATM has been locked. ");
        }
        sc.close();
    }
    
}