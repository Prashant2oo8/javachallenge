public class inheritance {
    public static void main(String[] args) {
        male m = new male();
        m.intelligence();
        female f = new female();
        f.intelligence();
        
    }
    
}
class human{
     void intelligence() {
        System.out.println("human is a intelligent creature.");
    }
}
class male extends human{
       // we are not changing behaviour of parent class.      

}
class female extends human{
    void intelligence(){
        System.out.println("female is wise and emotioanl creature.");
    }
}

