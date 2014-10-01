//HW05 Part 1: BurgerKing
//Maria Castro
//September 30, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose:
 
 
 
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
                
                switch (choice){
                default: 
                System.out.println
                ("A single character expected"); 
                System.out.println("You did not enter any of B, b, S, s, F, or f");
                    return;
              
                
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
                        }
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
                        }
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
                        }
                        break;
                    
                }
                
            }
        }