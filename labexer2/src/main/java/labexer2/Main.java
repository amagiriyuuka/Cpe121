package labexer2;
public class Main extends secondClass{
    public static void main(String[] args) {
        Main m = new Main();
        
        m.readInput();
        m.setTotalCost(m.itemQuantity, m.itemPrice);
        m.writeOutput();
    }
}