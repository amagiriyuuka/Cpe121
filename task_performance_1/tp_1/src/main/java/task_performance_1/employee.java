package task_performance_1;
import java.util.Scanner;

public class employee {
    Scanner sc = new Scanner(System.in);

    public static String name;

    public static void setName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }
    public static String getName(){
        return name;
    }
}
