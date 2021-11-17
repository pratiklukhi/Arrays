public class AscedingOrder {
    public static void main(String[] args) {

        int arr[] = {5, 20, 15, 11, 10};
        int temp = 0;

        //elements of original array
        System.out.println("Elements of original array:");
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        // sort the array in ascending order
        for (int i =0; i< arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();

        //elements of array after sorting
        System.out.println("Elements of array in ascending order:");
        for (int i =0; i< arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
