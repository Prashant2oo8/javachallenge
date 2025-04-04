import java.util.Random;

public class timeTableNestedLoop {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i=1;i<=5;i++){
            System.out.println("Day "+i+";");
            for (int j=1;j<=6;j++){
                String subject = randomSubject(random.nextInt(6) + 1);
                System.out.println("Period"+j+":"+subject);
            }
            System.out.println();
        }

    }
    public static String randomSubject(int n){
        switch (n) {
            case 1: return "HINDI";    
            case 2: return "ENGLISH";  
            case 3: return "MATH";
            case 4: return "SCIENCE";
            case 5: return "SOCIAL SCIENCE";
            case 6: return "ART";
            default : return "FREE PERIOD";
        }
    }
}
