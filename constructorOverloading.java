public class constructorOverloading {
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student("jatin");
        student s3 = new student("Sajid", 22);

        s1.display();
        s2.display();
        s3.display();
    }
}
class student {
    String name;
    int age;
    student(){
        name = null;
        age = 0;
    }
    student (String st){
        name = st;
        age = 0;
    }
    student (String st, int a){
        name = st;
        age = a;
    }
    void display(){
        System.out.println("Student details : \n Name: "+name +"\n Age: "+age);
    }
}

