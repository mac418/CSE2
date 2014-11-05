//Hw09: Number Stack
//Maria Castro
//November 4, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose:To create a program in which the main method calls for a different
//method that checks with two other methods if the input form the user is an int
//and in the range between 1 and 9. Then the system returns to the main method
//and calls for the method all blocks which takes the input and uses it to print
//out a series of blocks of the number using the method block to print the blocks
//and the method line to make the lines.

import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
        int m;
        m = getInt(); 
        allBlocks(m);
    }

    public static int getInt(){
    
        Scanner scan = new Scanner(System.in);
        
            while (true){
            System.out.println("Enter an int between 1 and 9, inclusive: ");
            int m;
            //Asking for the user's input
                if  (checkInt(scan) == true);
                //checks of the result from checkInt is true
                //if so it calls for checkRange
                    m = checkRange(scan);
            
                if (m==10){
            //when the result from checkInt is false it returns 10
            //if so then the program doesn't do anything
            //if not it returns m to getInt        
                } else{
                return m;
                }
            }
    }

    public static boolean checkInt(Scanner scan){
 
        if  (scan.hasNextInt()){
        //checks if input is an integer, if so returns true
            return true;
        } else {
            System.out.println("You did not enter an integer. Try again:");
            scan.next();
            return false;
        //if not an integer returns false
        }
    
    }
    
    public static int checkRange(Scanner scan){
        
        int m = scan.nextInt();
        
        if (m >= 1 && m <=9){
        //checks if input is within range
        //returns value of m if in range
        return m;}
        else{ 
        return 10;}
    }
    
    public static void allBlocks(int m){
        for (int i = 1; i <= m; i++){
            block(i);
        //calls for block method
        }
    }
    
    public static void block(int j){
  
  
    int i = 1;
        while (i <= j){
            line(j);
            i++;
            //runs line enough to make each row
        }
    
    for (int r = 0; r <= j + (j-1); r++){
        System.out.print("-");    
    //makes the dashes and spaces required using a limit j + (j-i)
       } System.out.print("\n");
   
    }
    
    
    public static void line(int k){
    
  //  for (int c =0; c <= k+(k-1); k++){
  //                  System.out.print(" ");
  //  }
            
        for (int i = 1; i <= (k*2)-1; i++){
        // prints the number, its corresponding number of times in a line 
            System.out.print(k);
        }
        
        System.out.print("\n");
    }
}


