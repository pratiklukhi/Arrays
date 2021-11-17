import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        int num=0;
        int reversenum=0;
        System.out.println("Input any number:");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        //Using While loop
        while (num!=0)
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num= num/10;
        }
        System.out.println("Reverse of input numbers is:" + reversenum);
    }
}
