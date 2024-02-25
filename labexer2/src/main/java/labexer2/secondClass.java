package labexer2;

import java.util.Scanner;

public class secondClass {
    public String itemName;
    public double itemPrice;
    public int itemQuantity;
    public double amountDue;

    public secondClass(){
        itemName = "";
        itemPrice = 0;
        itemQuantity = 0;
        amountDue = 0;
    }
    public void setItemName(String newItemName){
        itemName = newItemName;
    }
    public void setTotalCost(int quantity, double price){
        itemQuantity = quantity;
        itemPrice = price;
        amountDue = quantity * price;

    }
    public String getItemName(int setItemQuantity){
        return itemName;
    }
    public double getTotalCost(){
        return amountDue;
    }
    public void readInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the item you are purchasing: ");
        itemName = sc.nextLine();
        
        System.out.print("Enter the quantity and price separated by a space: ");
        itemQuantity = sc.nextInt();
        itemPrice = sc.nextDouble();

        sc.close();
    }
    public void writeOutput(){
        System.out.println("You are purchasing " + itemQuantity + " " + itemName + "(s) at PHP" + itemPrice  + " each.");
        System.out.println("Amount due is: PHP" + amountDue);
    }
    
}
