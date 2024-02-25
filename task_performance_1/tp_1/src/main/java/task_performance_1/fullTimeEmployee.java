package task_performance_1;
import java.util.Scanner;
public class fullTimeEmployee {
    Scanner sc = new Scanner(System.in);
    public static double monthlySalary;
    
    public static void setMonthlySalary(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter monthly salary: ");
        monthlySalary = sc.nextDouble();
        sc.close();
    }

    public static double getMonthlySalary(){
        return monthlySalary;
    }
    
}
