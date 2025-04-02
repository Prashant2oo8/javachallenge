import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maximum value until printing even numbers: ");
        int n = sc.nextInt();
        int a = 2;
        while (a <= n ){
            System.out.println(a);
            a+=2;
        }
        sc.close(); 
    }
}