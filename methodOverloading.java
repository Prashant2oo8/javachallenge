public class methodOverloading {
    public static void main(String[] args) {
        calculation area1 = new calculation();
        calculation area2 = new calculation();
        double rect = area1.area(2, 5);
        double cube = area2.area(2, 5, 4);
        area1.display(rect);
        area2.display(cube);
    }
}
class calculation {
    double area(double l, double b){
        return l*b;
    }
    double area(double l, double b, double h){
        return l*b*h;
    }

    void display (double area){
        System.out.println(area);
    }
}        