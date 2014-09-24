//HW04 Part 1: Income Tax 
//Maria Castro
//September 23, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose:To create a program that asks for an int the gives
//the number of thousands of dollars of income and under certain
//conditions gives the correspoding amount of income tax.

    import java.util.Scanner;
    //Import of the scanner
        public class IncomeTax{
            //Start of public class
            public static void main (String [] args) {
                //Start of main method
                Scanner myScanner;
                //Declaring my scanner
                myScanner = new Scanner (System.in);
                //Constructing the scanner
                
            System.out.println(
            "Enter an int giving the number of thousands of dollars of income: ");
            //Prints out the space that asks for the number 
            
            
           if (myScanner.hasNextInt()){
              int nThousands = myScanner.nextInt();
              int numberInT = nThousands *1000;
              //Declaring an if statement in which the number entered is tested to be
              //an int 
              //Declaring the variables nThousands and numberInT
              //numberInT is used later b/c if when calculating the tax we use nThousands
              //the answer will not be the income tax of a thousands number i.e. instead
              //of being the tax of 85,000 it would be the tax of 85
           if (nThousands < 20){
                System.out.println("The tax rate on $" + 
                (nThousands + ",000 is 5.0%, and the tax is $" + (numberInT * 0.05)));
                //Sets condition that if nThousands is less than 20 then the tax for it
                //is 5%
            }
            else if (nThousands >= 20){
                System.out.println("The tax rate on $" + 
                (nThousands + ",000 is 7.0%, and the tax is $" + (numberInT * 0.07)));
                //Sets condition that if nThousands is not less than 20 but instead is 
                //equal to or greater than, then the tax for it is 7%
            }
            else if (nThousands < 40){
                 System.out.println("The tax rate on $" + 
                (nThousands + ",000 is 7.0%, and the tax is $" + (numberInT * 0.07)));
                //Sets condition that if nThousands is not greater than or equal to 20
                //but instead is less than 40, then the tax for it is 7%
            }
            else if (nThousands >= 40){
                 System.out.println("The tax rate on $" + 
                (nThousands + ",000 is 12.0%, and the tax is $" + (numberInT * 0.12)));
                //Sets condition that if nThousands is not less than 40 but instead is 
                //equal to or greater than, then the tax for it is 12%
            }
            else if (nThousands < 78){
                 System.out.println("The tax rate on $" + 
                (nThousands + ",000 is 12.0%, and the tax is $" + (numberInT * 0.12)));
                //Sets condition that if nThousands is not greater than or equal to 40 
                //but instead is less than 78, then the tax for it is 12%
            }
            else if (nThousands >= 78){
                 System.out.println("The tax rate on $" + 
                (nThousands + ",000 is 14.0%, and the tax is $" + (numberInT * 0.14)));
                //Sets condition that if nThousands is not greater than or equal to 78 
                //but instead is equal to or greater than 78, then the tax for it is 14%
            }
               
           }
           else { System.out.println("You did not enter an int");
           return;
           //Prints message that the original number entered is not an int and ends the programm
           }
           
            
            }
            
            }
        
            
            
            