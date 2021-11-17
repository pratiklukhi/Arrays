public class CountChar {
    public static void main(String[] args) {
        String intro = "My name is Pratik";
        int count = 0;

        // count 'a' in the given string

        for (int i=0; i<intro.length(); i++){
            if (intro.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Number of 'a' in this string :" + count);
    }
}