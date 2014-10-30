//HW08
//Maria Castro
//October 28, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose: Create a program that asks the user for a C or c, y, Y, n, 
//or N and for a digit between 0 and 9. By using methods it takes the inputs
//and makes it print them


import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	
	if(input!=' '){
  	System.out.println("You entered '"+input+"'");	}
  	
	input=getInput(scan,"Choose a digit.","0123456789");
	
	System.out.println("You entered '"+input+"'");
  } 
  
  public static char getInput(Scanner x, String cLetter){
      
      x = new Scanner(System.in);
      String a = x.next();
      char b = a.charAt(0);
      int c = a.length();
      int counts = 0;
      
     if (c == 1) {
 //Checks the input is only one character long         
         while (counts < 9999){ //runs the program again and again if user doesn't input right character
            while (b == 'C' || b == 'c'){
          //checks for the input to match C or c
             return b;}
           //returns the input to the main method if it does match  
         }
             System.out.print("You did not enter 'C' or 'c'. Try Again: ");
             a = x.next();
             c = a.charAt(0);
             counts++;
         //asks the user to try again until the input does match
             
    
     } 
        else { System.out.println("You did not enter only one character.Try Again");
        }
    
    return ' ';}

        
         
    public static char getInput(Scanner scan , String sLetter, int x){
        
        scan = new Scanner(System.in);
        String c = scan.next();
        char d = c.charAt(0);
        int count = 0;
        
        while (count < x){//makes the program run of input doesn't match, the number of times the user wants it to
        while (d == 'Y' || d == 'y' || d == 'N' || d == 'n'){
       //checks that input matches the characters wanted   
             return d;} // returns the input to main method
             count++;
    
             System.out.print("You did not enter y, Y, n or N. Try Again: ");
             c = scan.next();
             d = c.charAt(0);
        }//asks user to try again
        System.out.println("You failed after " + x + " times");
             return ' '; //stops program when the user doesn't input the correct character after x number of times
    }
             
   
    public static char getInput(Scanner z, String word, String nums){
       System.out.println(word);
       z = new Scanner(System.in);
        String num = z.next();
        char e = num.charAt(0);
        int x = num.length();
        
      while (true){
        
        if (x == 1){ 
    //checks for the length of the character
      if (e == '0' || e == '1' || e == '2' || e == '3' || e == '4' || e == '5' || e == '6' || e == '7' || e == '8' || e == '9' ){
       //checks for character inputed to match the numbers the program wants
         return e;}//returns input to main method
         
        else{
            System.out.println("You did not enter an acceptable character");
             num = z.next();
             e = num.charAt(0);
           //asks the user to keep trying until input matches 
        }
             
             
            }else { System.out.println("You did not enter only one digit"); 
         }
      continue;}
      
    
}


}

  
