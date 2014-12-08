//Lab05: Random Games
//Maria Castro
//September 24, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose:To create a program that asks for a series of inputs to 
//choose the random game that will be played


    import java.util.Scanner;
    //Import of the scanner
        public class RandomGames{
            //Start of public class
            public static void main (String [] args) {
                while (true){        //Start of main method
                Scanner myScanner;
                //Declaring my scanner
                myScanner = new Scanner (System.in);
                //Constructing the scanner
                
                System.out.println("Enter R or r for Roulette, C or c for Craps, P or p for Pick a Card: ");
                    char x = myScanner.next().charAt(0);
                        if (x=='R' || x=='r' || x=='C' || x=='c' || x=='P' || x=='p'){
                    
                            if(x=='R' || x=='r'){
                                int numberR = (int)(Math.random()*39);
                                    switch (numberR){
                                    //0 is equivalent to 00, 1 to 0, etc.
                                        case 0:
                                            System.out.println("Roulette:00");
                                                 break;
                                        default:
                                            System.out.println("Roulette:"+ (numberR-1));
                                                 break;
                                    }   
                            }
                            
                            if(x=='C' || x=='c'){
                                int numberC = (int)((Math.random()*6)+1);
                                int numberc = (int)((Math.random()*6)+1);
                                int crapsSum = numberc + numberC;
                                System.out.println("Craps:"+ numberC + " + " + numberc + " = " + crapsSum);
                            }
                            String out = "";
                            if(x=='P' || x=='p'){
                                int suit = (int) ((Math.random()*4)+1);
                                int rank = (int)((Math.random()*13)+1);
                                switch (rank){
                
                                    case 1: 
                                        out+="A";
                                            break;
                                    case 2: 
                                        out+="K";
                                            break;
                                    case 3: 
                                        out+="Q";
                                            break;
                                    case 4: 
                                        out+="J";
                                            break;
                                    case 5: 
                                        out+="10";
                                            break;
                                    case 6: 
                                        out+="9";
                                            break;
                                    case 7: 
                                        out+="8";
                                            break;
                                    case 8: 
                                        out+="7";
                                            break;
                                    case 9: 
                                        out+="6";
                                            break;
                                    case 10: 
                                        out+="5";
                                            break;
                                    case 11: 
                                        out+="4";
                                            break;
                                    case 12: 
                                        out+="3";
                                            break;
                                    case 13: 
                                        out+="2";
                                            break;
                                }
                                
                                switch (suit){
                
                                    case 1: 
                                        out+=" of clubs";
                                            break;
                                    case 2: 
                                        out+=" of diamonds";
                                            break;
                                    case 3: 
                                        out+=" of hearts";
                                            break;
                                    case 4: 
                                        out+=" of spades";
                                            break;
                                }   
                            
                            }
                    System.out.println(out);
                            } else{
                                System.out.println("'" + x +"' is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
                                    return;
                    
                            }
                   
                }
                
            }//end of main method
        }//end of public class