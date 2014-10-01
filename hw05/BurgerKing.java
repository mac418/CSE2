//HW05 Part 1: BurgerKing
//Maria Castro
//September 30, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose:Create a program that asks the user to order their food at burger king
//It gives the option between burgers, fries and soda
//Within each characteristic there are other questions, burgers:fixins,
//soda:flavors, and fries:size
 
 
 
 import java.util.Scanner;
    //Import of the scanner
        public class BurgerKing{
            //Start of public class
            public static void main (String [] args) {
                //Start of main method
                Scanner myScanner;
                //Declaring my scanner
                myScanner = new Scanner (System.in);
                //Constructing the scanner
                
            System.out.println
            ("Enter a letter to indicate a choice of\nBurger (B or b)\nFries (F or f)\nSoda (S or s)");
            String choice = myScanner.nextLine();
                //scanner asks the first option with this print statement
                
                switch (choice){
                default: 
                System.out.println("You did not enter any of B, b, S, s, F, or f");
                    return;
              //switch case that provides the options for burger, fries and soda
                
                    case "b": case "B":
                        System.out.println
                        ("Enter A or a for 'all the fixins'\nC or c for cheese\nN or n for none of the above");
                        String fixins = myScanner.nextLine();
                        switch (fixins) {
                            case "A": case "a":
                                System.out.println("You ordered a burger with all fixins");break;
                            case "C": case"c":
                                System.out.println("You ordered a burger with Cheese");break;
                            case "N": case"n":
                                System.out.println("You ordered a burger with no fixins");break;
                            default:
                                System.out.println("You did not enter any of the options for fixins");
                                return;
                        }//switch case that sets the options for the fixins and the reply whenever 
                        //the letter correspoding to the fixin option is entered
                    case "f": case "F":
                        System.out.println
                        ("Do you want a large or small order of fries (l,L,s, or S)");
                        String fSize = myScanner.nextLine();
                        switch (fSize) {
                            case "S": case "s":
                                System.out.println("You ordered small fries"); break;
                            case "L": case "l":
                                System.out.println("You ordered large fries"); break;
                            default:
                                System.out.println("You did not enter any of the sizes for fries");
                                return;
                        }//switch case that sets the options for the fries sizes and the reply whenever 
                        //the letter correspoding to the size option is entered
                    case "S": case "s":
                        System.out.println
                        ("Do you want Pepsi (p or P),\nCoke (c or C),\nSprite (s or S)\nor Mountain Dew (M or m)");
                        String sFlavor = myScanner.nextLine();
                        switch (sFlavor) {
                            case "P": case"p":
                                System.out.println
                                ("You ordered a Pepsi"); break;
                            case "C": case "c":
                                System.out.println
                                ("You ordered a Coke"); break;
                            case "S": case "s":
                                System.out.println
                                ("You ordered a Sprite"); break;
                            case "M": case "m":
                                System.out.println
                                ("You ordered a Mountain Dew"); break;
                            default:
                            System.out.println
                            ("You did not enter any of the flavor options");
                            return;
                        }//switch case that sets the options for the flavors and the reply whenever 
                        //the letter correspoding to the flavor option is entered
                        break;
                    
                }
                
            }
        }