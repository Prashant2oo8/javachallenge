public class stringsAreImmutable {
    public static void main(String[] args) {
        String name = "pk";
        String nickName = "pk";
        String userName = new String("pk");
        if (name == nickName) {
            System.out.println("name and nickName are same");
        } else {
            System.out.println("otherwise not");
        }
        if (name == userName){
            System.out.println("name and userName are same.");
        } else{
            System.out.println("name and userName are not same.");
        }
// operator (==) checks the references
    }
    
}
