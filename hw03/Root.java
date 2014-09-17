//HW03 Part 2: Root 
//Maria Castro
//September 16, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose:To create a program that will create a Scanner that takes a 
//number and using a guessing formula it begins to estimate the cubic root
//and at the end it shows the best estimated cubic root and the original number.

    import java.util.Scanner;
    //Import of the scanner
        public class Root{
            //Start of public class
            public static void main (String [] args) {
                //Start of main method
                Scanner myScanner;
                //Declaring my scanner
                myScanner = new Scanner (System.in);
                //Constructing the scanner
                
                System.out.print("Enter a double and print out its cubic root: ");
                //Prints out the space that asks for the number 
                //we will use for the cubic root
                double x = myScanner.nextDouble();
                double guess1=(x/3);
                double guess2=((2*guess1*guess1*guess1+x)/(3*guess1*guess1));
                double guess3=((2*guess2*guess2*guess2+x)/(3*guess2*guess2));
                double guess4=((2*guess3*guess3*guess3+x)/(3*guess3*guess3));
                double guess5=((2*guess4*guess4*guess4+x)/(3*guess4*guess4));
                double guess6=((2*guess5*guess5*guess5+x)/(3*guess5*guess5));
                
                //Creates every guess by starting of with (X/3) for the first 
                //guess and plugging in the prior guess to get the next guess
                
                double guess6cubed=(guess6*guess6*guess6);
                //Cubing the last guess to get our final estimate 
                //of the original number
                
                System.out.print("The cube root is: "+ (guess6) + "*" + 
                (guess6) + "*" + (guess6) + "=" + (guess6cubed));
                //Prints out the final guess and then it prints the final estimate
                //declared as the double guess6cubed previously
            } //End of main method
        }//End of public class