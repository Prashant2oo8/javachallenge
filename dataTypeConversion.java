public class dataTypeConversion {
    public static void main(String[] args) {
        int num = 12;
        long number = 1456;
        float pi = 3.14f;
        byte roll = 121;
        double realPi = 3.143213241123 ;

        System.out.println(num);  
        System.out.println(number);
        System.out.println(pi); 
        System.out.println(roll);   
        System.out.println(realPi);

        // now data type conversion implicit and explicit
        long newNum = num;
        int newNumber = (int)number;
        double newPi = pi;
        float newRealPi = (float)realPi;
        int newRoll = roll;
        byte NewNum = (byte)num;

        System.out.println(newNum);  
        System.out.println(newNumber);
        System.out.println(newPi); 
        System.out.println(newRoll);   
        System.out.println(newRealPi);
        System.out.println(NewNum);


    }

}