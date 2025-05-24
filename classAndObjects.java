public class classAndObjects {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.name = "jackey";
        d1.colors = "brown";
        d1.walk();
        d2.name = "tuffy";
        d2.colors = "white";
        d2.color();  
    }
}
class Dog {
    String name;
    String colors;
    void walk (){
        System.out.println(name+" walks on streets.");
    }
    void color(){
        System.out.println(name+" color is "+colors);
    }
}