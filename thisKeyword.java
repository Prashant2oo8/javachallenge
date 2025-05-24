public class thisKeyword{
    public static void main(String [] args){
        Complex num1 = new Complex(2);
        Complex num2 = new Complex(5, 2);
        num1.display();
        num2.display();
        System.out.println("sum of bothcomplex no is : ");
        Complex result = num1.add(num2);
        result.display();

    }
}
class Complex{
    int a;
    int b;

    Complex(int real){
        this.a = real;
        this.b = 10;
    }
    Complex (int real, int imagenary){
        this.a = real;
        this.b = imagenary;
    }
    
    
    Complex add (Complex other){
        return new Complex(this.a+other.a, this.b+other.b);
    }

    void display(){
        System.out.println(a+"+"+b+"i");
    }
}
