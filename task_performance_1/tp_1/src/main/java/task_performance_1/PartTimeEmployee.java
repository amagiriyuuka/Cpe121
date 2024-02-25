package task_performance_1;
import java.util.Scanner;
public class PartTimeEmployee {
    Scanner sc = new Scanner(System.in);
    public static double ratePerHour;
    public static int hoursWorked;
    public static double wage;

    public static void setWage(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rate per hour and no. of hours worked separated by space (e.g., 107.50 13): ");
        ratePerHour = sc.nextDouble();
        hoursWorked = sc.nextInt();
        wage = ratePerHour * hoursWorked;
        Math.round(wage);
        sc.close();
    }

    public static double getWage(){
        return wage;
    }
}
