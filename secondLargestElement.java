public class secondLargestElement {

    public static void main(String[] args) {
        int arr[] = {10,20,30,35,50,49,50};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        if (arr.length < 2) System.out.println("array have only one element");
        for (int num : arr){
            if (num > first){
                second = first;
                first =  num;
            }
            else if (num > second && num != first){
                second = num;
            }
        }
        System.out.println("second largest no: "+second);
    }
}