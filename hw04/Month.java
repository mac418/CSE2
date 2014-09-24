//HW04 Part 2: Month
//Maria Castro
//September 23, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose:To create a program that asks for an int the gives
//the number of a month and displays the number of days in such.
//But if February is entered then the year will be asked before 
//displaying the number of days.

    import java.util.Scanner;
    //Import of the scanner
        public class Month{
            //Start of public class
            public static void main (String [] args) {
                //Start of main method
                Scanner myScanner;
                //Declaring my scanner
                myScanner = new Scanner (System.in);
                //Constructing the scanner
                
            System.out.println(
                "Enter an int giving the number of the month (1-12)- ");
                //Prints out the space that asks for the month's #
                
            
            
            if (myScanner.hasNextInt()){
                int nMonth = myScanner.nextInt();
                //starts an if statement checking if the number entered is an int
                //declares the value for nMonth is the number entered
            
            
            switch (nMonth){
                 
                case 1: System.out.println("The month has 31 days"); break;
                case 2: System.out.println("Enter an int giving the year-");
                    int year =  myScanner.nextInt();
                    //creates the value for the year so can be used to find
                    // if the year is a leap year or not
                  if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                     //if else statements that create the conditions for a 
                   //leap year 
                      System.out.println("The month has 29 days");
                      //Prints that if leap year month #2 has 29 days
                      //since it meets conditions of the leap year
                  }
                   else
                   {System.out.println("The month has 28 days");} break;
                   //Prints that month has 28 days since it was not a leap year
                   //*Note*:we were not asked to print if the year is a leap year
                   //or not, so it was not printed by the program
                case 3: System.out.println("The month has 31 days"); break;
                case 4: System.out.println("The month has 30 days"); break;
                case 5: System.out.println("The month has 31 days"); break;
                case 6: System.out.println("The month has 30 days"); break;
                case 7: System.out.println("The month has 31 days"); break;
                case 8: System.out.println("The month has 31 days"); break;
                case 9: System.out.println("The month has 30 days"); break;
                case 10: System.out.println("The month has 31 days"); break;
                case 11: System.out.println("The month has 30 days"); break;
                case 12: System.out.println("The month has 31 days"); break;
                default: System.out.println("You did not enter an int between 1 and 12");
            }//Switch statement that gives the conditions and prints the info for each
            //number representing the month of the year between 1 and 12
            }
            else{
                System.out.println("You did not enter an int");
                return;
                //Prints a statement that tells you the original month entered 
                //is not an int and terminates the program
            }
                
            
            
    }//ends main method
}//ends public class
            