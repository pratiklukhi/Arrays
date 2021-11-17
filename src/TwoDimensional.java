public class TwoDimensional {
    public static void main(String[] args) {
        int arr[][] = {{7, 8, 9}, {6, 5, 4}, {10, 11, 12}};

        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                System.out.print(arr[a][b] + " ");
            }
            System.out.println();
        }
    }
}