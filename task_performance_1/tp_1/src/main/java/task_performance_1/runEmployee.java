package task_performance_1;
import java.util.*;
public class runEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        employee setName = new employee();
        fullTimeEmployee setMonthlySalary = new fullTimeEmployee();
        PartTimeEmployee setWage = new PartTimeEmployee();

        //Asks user for name
        employee.setName();

        //Lets user choose if they are full-time or part-time
        System.out.print("Press F for full time and P for part time: ");
        char pOrF = sc.nextLine().charAt(0);
        pOrF = Character.toLowerCase(pOrF);
        
        //if-statement for choosing part-time or full-time
        if(pOrF == 'f'){
            fullTimeEmployee.setMonthlySalary();
            System.out.println("Name: " + employee.getName());
            System.out.println("Monthly salary: " + fullTimeEmployee.getMonthlySalary());
        }else if(pOrF == 'p'){
            PartTimeEmployee.setWage();
            System.out.println("Name: " + employee.getName());
            System.out.println("Wage: " + PartTimeEmployee.getWage());
        }

        System.out.println("");


        sc.close();
    }
}