  import java.util.Scanner;
  
//Lab03 BigMac
//September 10, 2014
//Maria Castro
//CSE 02
//Section 112
//Professor Brian Chen
//Purpose: To compute the cost of buying a Big Mac
//using the scanner class and arithmetic calculations
//Calculating the price, the sales tax (depending) on 
//the state, and the total cost.

  public class BigMac{
      //main method required for every java program
     
      public static void main (String[] args) {
       
       Scanner myScanner;
         myScanner=new Scanner(system.in);
         
         System.out.print(
             "Enter the number of Big Macs(an integer > 0): ");
         int nBigMacs = myScanner.nextInt();
         System.out.print("Enter the cost per Big Mac as"+ "a double (in the form xx.xx):" )
         double bigMac$ = myScanner.nextDouble();
         System.out.print( 
             "Enter the percent tax as a whole number (xx): ");
         double taxRate = myScanner.nextDouble();
         taxRate/=100;
         //user shows percent but I want proportion
         
         double cost$;
         int dollars, //whole dollar amount of cost 
          //dimes, pennies; for storing digits
          //to the right of the decimal point 
          //for the cost$ 
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //gets the whole amount, dropping decimal fraction
        
         
         
         
         
      }//end of main method
  }//end of class
    