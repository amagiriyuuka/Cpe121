
package labexer1b;
import java.util.Scanner;
public class LabExer1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        showNumberPlus10(number);
        showNumberPlus100(number);
        showNumberPlus1000(number);

        sc.close();
    }
    public static void showNumberPlus10(int number) {
        int ans = number + 10;
        System.out.println(number + " plus 10 is equal to " + ans);
    }
    public static void showNumberPlus100(int number){
        int ans = number + 100;
        System.out.println(number + " plus 100 is equal to " + ans);
    }
    public static void showNumberPlus1000(int number){
        int ans = number + 1000;
        System.out.println(number + " plus 1000 is equal to " + ans);
    }
}