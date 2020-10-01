import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
       
        Scanner in = new Scanner(System.in);
        
        double sum;
        
        System.out.println("Enter the sales tax rate: ");
        double taxRate = in.nextDouble();
        System.out.println("How many boards do you need? ");
        int boards = in.nextInt();
        System.out.println("How many windows do you need? ");
        int windows = in.nextInt();
        
        Construction myRate = new Construction(8,11,taxRate);

        sum = myRate.lumberCost(boards) + myRate.windowCost(windows);
       
        
        System.out.println("Total: " + sum + "\nGrand Total: " +  myRate.grandTotal(sum));
 
    }
}
