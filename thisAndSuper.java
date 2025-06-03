    class Employee{
        Employee(){
            this.name();
        }
        void name(){
            System.out.println("Employee is prashant.");
        }
    }
    class Staff extends Employee {
        void name(){
            super.name();
            System.out.println("Staff name is prashant.");
        }
    }

    public class thisAndSuper {

        public static void main (String[] args){
            Employee emp = new Employee();
            emp.name();
            Staff stf = new Staff();
            stf.name();
        }

    }