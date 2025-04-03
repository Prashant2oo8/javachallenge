public class breakContinue {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            System.out.println(i);
            if(i==3) break;
            System.out.println(i);
        }
        System.out.println(".....loop end.....");
        for(int i=1;i<5;i++){
            System.out.println(i);
            if(i==3) continue;
            System.out.println(i);
        }
    }
}