import java.util.Arrays;

public class ArrayEqualities {
    public static void main(String[] args) {
        int arr1[][]= {{2,3,4},{5,6,7}};
        int arr2[][]= {{1,2,3},{4,5,6}};

        System.out.println(Arrays.deepEquals(arr1,arr2));
    }
}
