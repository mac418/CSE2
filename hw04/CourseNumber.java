//HW04 Part 3: Course Number
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
        public class CourseNumber{
            //Start of public class
            public static void main (String [] args) {
                //Start of main method
                Scanner myScanner;
                //Declaring my scanner
                myScanner = new Scanner (System.in);
                //Constructing the scanner
                
            System.out.println("Enter a six digit number giving the course semester- ");
                int number = myScanner.nextInt();
                //Asks for the six digit number to be entered
                //declares the value of the int number
            if(number > 186510 || number < 201440){
                int digitsix = ((number/100000)%10);
                int digitfive = ((number/10000)%10);
                int digitfour = ((number/1000)%10);
                int digitthree = ((number/100)%10);
                int digittwo = ((number/10)%10);
                int digitone = (number%10);
                //Separates each digit into its own variable
                //so we can print the digits with their correct label
                    if (digitone == 0){
                        //the last digit is always 0 for the program to 
                        //run so this if statement sets the conditions that will 
                        //make it work
                        switch (digittwo){
                            case 1: System.out.println(
                            "The course was offered in the Spring semester of " 
                            + digitsix + digitfive + digitfour + digitthree); break;
                            case 2: System.out.println(
                            "The course was offered in the Summer 1 semester of " 
                            + digitsix + digitfive + digitfour + digitthree); break;
                            case 3: System.out.println(
                            "The course was offered in the Summer 2 semester of " 
                            + digitsix + digitfive + digitfour + digitthree); break;
                            case 4: System.out.println(
                            "The course was offered in the Fall semester of " 
                            + digitsix + digitfive + digitfour + digitthree); break;
                            default: System.out.println(""+ digittwo + digitone + " is not a legitimate semester");
                            //Using a switch statement each number before the 0 in the original number will
                            //have a printing statement that will show which semester and year the course is
                            //the digits 6 to 3 are used to print the year using the numbers of the original six
                            //digit number entered
                        }
                    }
                    else {
                        System.out.println("" + digittwo + digitone + " is not a legitimate semester");
                        return;
                        //In case the last two digits in the six digit number do not meet the conditions above
                        //in the program, this message prints showing which ones are not working b/c they don't represent
                        //any semester.
                    }
                
                        
                }
           
            else {
                System.out.println("The number was outside the range [186510,201440]");
                return;
                //Prints statement that the number entered does not meet the condition printed
            }
            
        }//end of main method
        }// end of public class