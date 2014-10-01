//HW05 Part 2: BoolaBoola
//Maria Castro
//September 30, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose:Create a program that showcases a random statement
//containing three randomized true or falses and asks to analyzing 
//if the statement is true or false


 import java.util.Scanner;
    //Import of the scanner
        public class BoolaBoola{
            //Start of public class
            public static void main (String [] args) {
                //Start of main method
                int random1 = (int)((Math.random()*10)+1);
                int random2 = (int)((Math.random()*10)+1);
                int random3 = (int)((Math.random()*10)+1);
                //Creation of 3 random ints that will be between 1 and 10
                //to make the possibilities for the three true or false
                //values in each randomized statement
                boolean n1;
                boolean n2;
                boolean n3;
                //Initializing 3 different booleans for the random 
                // true or falses
            if (random1<=5){
                n1 = true;
            }else {
                n1 = false;
            }
            if (random2<=5){
                n2 = true;
            }else {
                n2 = false;
            }
            if (random3<=5){
                n3 = true;
            }else {
                n3 = false;
            }
            //if else statement that makes a 50/50 chance
            //for a true or false value to be hled by the booleans
            int random4 = (int)(Math.random()*4+1);
            //Creates a new random int for the statement the 
            //system will showcase
            Scanner myScanner = new Scanner(System.in);
            
            
            switch (random4){
                case 1: 
                    System.out.println
                    ("Does "+n1+" && "+n2+" &&"+n3+" have the value true(t/T) or false(f/F)?");
                    String answer = myScanner.nextLine();
                    boolean ans = false;
                    if (answer.equals("t") || answer.equals("T")) {
                        ans = true; 
                    }
                    else if (!answer.equals("f") && !answer.equals("F")){
                        System.out.println("You did not enter t, T, f, or F");
                        return;
                    }
                    boolean trueVal = n1 && n2 && n3;
                    if (trueVal == ans) {
                        System.out.println("Correct");
                    } else{
                         System.out.println("Incorrect");
                    }//Prints one of the random statements and uses the scanner's input to
                    //set it to a value of true or false as a boolean
                    //if none of thr options of t, T, f, F are entered the system ends with a return
                    //this repeats it self for each case following the correspoding caracteristics
                    break;
                case 2:
                    System.out.println
                    ("Does "+n1+" && "+n2+" || "+n3+" have the value true(t/T) or false(f/F)?");
                    String answer1 = myScanner.nextLine();
                    boolean ans1 = false;
                     if (answer1.equals("t") || answer1.equals("T")) {
                        ans1 = true; 
                    }
                    else if (!answer1.equals("f") && !answer1.equals("F")){
                        System.out.println("You did not enter t, T, f, or F");
                        return;
                    }
                    boolean trueVal1 = n1 && n2 || n3;
                    if (trueVal1 == ans1) {
                        System.out.println("Correct");
                    } else{
                         System.out.println("Incorrect");
                    }
                    break;
                case 3:
                    System.out.println
                    ("Does "+n1+" || "+n2+" && "+n3+" have the value true(t/T) or false(f/F)?");
                    String answer2 = myScanner.nextLine();
                    boolean ans2 = false;
                     if (answer2.equals("t") || answer2.equals("T")) {
                        ans2 = true; 
                    }
                    else if (!answer2.equals("f") && !answer2.equals("F")){
                        System.out.println("You did not enter t, T, f, or F");
                        return;
                    }
                    boolean trueVal2 = n1 || n2 && n3;
                    if (trueVal2 == ans2) {
                        System.out.println("Correct");
                    } else{
                         System.out.println("Incorrect");
                    }
                    break;
                case 4:
                    System.out.println
                    ("Does "+n1+" || "+n2+" || "+n3+" have the value true(t/T) or false(f/F)?");
                    String answer3 = myScanner.nextLine();
                    boolean ans3 = false;
                     if (answer3.equals("t") || answer3.equals("T")) {
                        ans3 = true; 
                    }
                    else if (!answer3.equals("f") && !answer3.equals("F")){
                        System.out.println("You did not enter t, T, f, or F");
                        return;
                    }
                    boolean trueVal3 = n1 || n2 || n3;
                    if (trueVal3 == ans3) {
                        System.out.println("Correct");
                    } else{
                         System.out.println("Incorrect");
                    }
                //Switch case that specifies what happens with each kind of random statement
            }
                
            }
        }