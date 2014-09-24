//HW04 Part 4: Time Padding
//Maria Castro
//September 23, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose:To create a program that asks for the
//number of seconds and changes it to show the hours:mins:secs.

    import java.util.Scanner;
    //Import of the scanner
        public class TimePadding{
            //Start of public class
            public static void main (String [] args) {
                //Start of main method
                Scanner myScanner;
                //Declaring my scanner
                myScanner = new Scanner (System.in);
                //Constructing the scanner
                
                System.out.println("Enter time in seconds: ");
                //Prints time request
                 int secs = myScanner.nextInt();
                //Declares the variable secs
                if(secs > 0){
                    int hours = (secs/3600);
                    int h = (secs/60);
                    int mins = (h) - (hours*60);
                    int s = (secs) - (h*60);
                //If statement that makes sure that if secs is greater than zero
                //the program moves on to next command
                //Below that variables are declared
                //hours converts the secs into hours
                //h changes the secs back into hours but since it is an int
                //it makes it a whole number
                //Then we use that h and substract the number of hours (times 60) found
                // which will give us the exact number of mins we want
                //Then s is the initial number of seconds minus the the number of hours (times 60)
                //which gives the exact number of seconds
                    if (mins < 10){
                    //Creates if statement so that if the # of mins is less than 0 then
                    // a 0 will be added before the number of mins in the printing 
                        if (s < 10){
                    System.out.println("The time is " + hours +":0" + mins +":0"+ s);
                    //Creates if statement so that if the # of seconds is less than 0 then
                    // a 0 will be added before the number of seconds in the printing
                    //It is also adding a 0 in front of mins in case the mins in this case
                    //also need a 0
                        }
                        else{
                            System.out.println("The time is " + hours +":0" + mins +":"+ s);
                        }//Prints the secs without a 0 because s is greater than 0 in this case
                        //but prints mins with a 0 before because in this condition the mins < 0
                        }
                    else{
                        if (s < 10){
                    System.out.println("The time is " + hours +":" + mins +":0"+ s);
                    //Prints the secs with a 0 before b/c they are less than 0 but the 
                    //mins are printed without the 0 before b/c they are > 0
                        }
                        else{
                            System.out.println("The time is " + hours +":" + mins +":"+ s);
                    }//Prints the mins and secs without 0's before b/c they are both > 0
                } 
                }
                else{
                    System.out.println("You did not enter a valid number");
                    return;
                    //Prints a statement saying that the secs entered originally
                    //are not valid since they are less than 0 and ends the program
                }
                
                
            }//end of main method
        }//end of public class