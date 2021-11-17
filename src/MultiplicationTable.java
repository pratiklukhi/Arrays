public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 0;
        int a = 1;
        System.out.println("Multiplication table of 9");
        num = 9;
        do {
            System.out.println(num + "x" + a + "=" + num * a);
            a++;
        } while (a<=10);
    }
}
