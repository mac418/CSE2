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
         myScanner=new Scanner(System.in);
         
         System.out.print(
             "Enter the number of Big Macs(an integer > 0): ");
         int nBigMacs = myScanner.nextInt();
         
         if (nBigMacs > 0){
         System.out.print("Enter the cost per Big Mac as"+ "a double (in the form xx.xx):" );
         double bigMac$ = myScanner.nextDouble();
         
         if(myScanner.hasNextDouble()){
         System.out.print( 
             "Enter the percent tax as a whole number (xx): ");
         double taxRate = myScanner.nextDouble();
         if(myScanner.hasNextDouble()){
         taxRate/=100;
         //user shows percent but I want proportion
         
         
         int dollars; //whole dollar amount of cost 
          //dimes, pennies; for storing digits
          //to the right of the decimal point 
          //for the cost$ 
        double cost$ = nBigMacs*bigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction
        dollars=(int)cost$;
        //get dimes amount, e.g., 
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2 
        int dimes=(int)(cost$*10)%10;
        int pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +  
        " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+"."+dimes+pennies);
         }else{
             System.out.println("You did not enter a double");
         }
             
         }else{
             System.out.println("You did not enter a double");
         }
         }else{
             System.out.println("You did not enter an integer");
         }
         
         
         
         
      }//end of main method
  }//end of class
    