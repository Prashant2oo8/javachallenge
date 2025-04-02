import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any value (to print first n even numbers): ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i+"th even number: "+(2*i));
        }
        sc.close();
    }
}