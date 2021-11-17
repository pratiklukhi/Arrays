public class ContainsSpecificValue {
    public static void main(String[] args) {

        int arr[]={5,10,15,20};
        int find= 16;
        boolean search = false;

        for (int i : arr){
            if (i==find){
                search=true;
            }
        }
        if (search)
            System.out.println(find + "is found");
            else
            System.out.println(find + "is not found");
        }
    }

