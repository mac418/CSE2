//Section 112
//Professor Brian Chen
//Purpose: To create a program that asks the user for the amount of
//Big Macs desired and if he/she wants fries, then prints out the total

import java.util.Scanner;

public class BigMacAgain{
    public static void main (String [] args){
    
        Scanner input = new Scanner(System.in);
        
        int numBigMac = input.nextInt();
        
        System.out.println("Enter the number of Big Macs: ");
        
        double costBigMac = (numBigMac * 2.22);
        
        if (input.hasNextInt() && numBigMac >= 0){
            
            System.out.println("You ordered "+numBigMac+" Big Macs for a cost of " +numBigMac+ " x $2.22 = $" +costBigMac);
        } 
        else { 
            System.out.println("You did not enter an int");
        }
        
        String fries = input.nextLine(); 
        System.out.println("Do you want an order of fries (Y/y/N/n)? ");
       
        double costWFries = (costBigMac + 2.15);
        
        switch (fries){
            
        case "Y": case "y":
             System.out.println("You ordered fries at a cost of $2.15");
       
             System.out.println("The total cost of the meal is $"+costWFries);
        case "N": case "n":
            System.out.println("The total cost of the meal is $"+costBigMac);
        }
       
    
    }
}