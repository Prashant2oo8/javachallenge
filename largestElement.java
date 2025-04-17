public class largestElement {
    public static void main(String[] args) {
        int numbers [] = {1, 5, 5, 6, 8};
        int max = Integer.MIN_VALUE;
        for(int number : numbers){
            if (number > max) max = number;
        }
        System.out.println("largest element is : "+max);
    }
}