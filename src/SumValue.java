public class SumValue {
    public static void main(String[] args) {
        int arr[]= {5,10,15,20,25,30};
        int sum = 0;

        for (int num : arr){
            sum = sum + num;
        }
        System.out.println("Sum of elements is:" + sum);
    }
}
