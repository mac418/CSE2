//HW06 Part 2: Roulette
//Maria Castro
//October 14, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose: Creating a program with a high value and a low value that are used 
//to compute an interval which its middle is called middle and gives the root
//of the inputed double value



import java.util.Scanner;

    public class Root{
        public static void main (String [] args){
            
            Scanner x = new Scanner(System.in);
            
            
            double low = 0.0;
            double input=-2.0;
            
            
           while (input<0.0){
             System.out.println("Enter a double greater than 0.0");
                input = x.nextDouble();
                //Asks for a double and
                //checks for double to be greater than 0
           }
           double high = (input + 1.0);
            double middle=(high+low)/2.0;
                while((high-low) > (0.0000001*(1+input))){
                    middle = (high+low)/2.0;
                //checks to see if the difference between 
                //high and low is less than some small multiple of 1+input
               if((middle*middle)>input){
                    high=middle;
            //checks if input is less than the result of middle squared
                }else if((middle*middle)<input){
                    low=middle;
            //checks if input is greater than the result of middle squared
                    }
            //while loop creates the interval so it makes the middle variable
            //equal to the square root of the input number
                }
              System.out.println("The root of "+input+" is equal to "+middle); 
        } //prints the input number and gives its root      
    }
