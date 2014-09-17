//HW03 Part 3: Four Digits 
//Maria Castro
//September 16, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose: Creating a program using scanner that displays 
//the last four digits of a number inputed

        import java.util.Scanner;
         //Import of the scanner
        public class FourDigits{
            //Start of public class
            public static void main (String [] args) {
                //Start of main method
                Scanner myScanner;
                //Declaring my scanner
                myScanner = new Scanner (System.in);
                //Constructing the scanner
                
                System.out.print
                ("Enter a double and I display the four digits to the right of the decimal point: ");
                double number = myScanner.nextDouble();
                int nextnumber = (int)(number*10000);
                int digitfour = (nextnumber%10);
                int digitthree = ((nextnumber/10)%10);
                int digittwo = ((nextnumber/100)%10);
                int digitone = ((nextnumber/1000)%10);
                //Creates a separate int for each number we want
                //Uses division and remainder division to showcase 
                //the decimal place number desired
                
                System.out.println("The four digits are " + digitone + digittwo + digitthree + digitfour);
                //Prints the the last four digits of the number inputed
                
            }//End of main method
        }//End of public class