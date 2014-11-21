//Hw10:Poker Odds
//Maria Castro
//November 18, 2014
//CSE02 Section 112
//Professor Brian Chen

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
    

    
  public static void main(String [] arg){
   int arrayDeck[];
   final int deck = 51;
    arrayDeck = new int[deck];
    
    for(int i = 0; i < 51; i++){
	    arrayDeck[i] = i;
    }
    
    showHands();
   simulateOdds();
  }
  
  public static void showHands(){
    //Initiation of the Strings for the type of card and variables used in the loops
    String club = "";
    String diamonds = "";
    String hearts = "";
    String spades = "";
    int numRandom = 0;
    int n = 0;
    while(true) {
    //Infinite loop that runs until user quits
    int arrayHand[] = new int [5];
    //Adding the name of each type of card to the strings
    club = "Clubs: ";
    diamonds = "Diamonds: ";
    hearts = "Hearts: ";
    spades = "Spades: ";
    
    for (int j = 0; j < 5; j++){//For loop that runs 5 times assigning a value to each space in the arrayHand and adds the cards to each class that are drawn
        numRandom = (int)(Math.random()*51);//Creates random number from 0 to 51
        arrayHand[j] = numRandom;//Places the random number in the arrayHand
     
        
    switch (numRandom){//Depending on the value of the random number the switch adds to the correspoding string the card represented by the value
        case 0: club+="A "; break;
        case 1: club+="K "; break;
        case 2: club+="Q "; break;
        case 3: club+="J "; break;
        case 4: club+=" 10 "; break;
        case 5: club+=" 9 "; break;
        case 6: club+=" 8"; break;
        case 7: club+=" 7"; break;
        case 8: club+=" 6"; break;
        case 9: club+=" 5"; break;
        case 10: club+=" 4"; break;
        case 11: club+=" 3"; break;
        case 12: club+=" 2"; break;
        case 13: diamonds+="A "; break;
        case 14: diamonds+="K "; break;
        case 15: diamonds+="Q "; break;
        case 16: diamonds+="J "; break;
        case 17: diamonds+="10 "; break;
        case 18: diamonds+="9 "; break;
        case 19: diamonds+="8 "; break;
        case 20: diamonds+="7 "; break;
        case 21: diamonds+="6 "; break;
        case 22: diamonds+="5 "; break;
        case 23: diamonds+="4 "; break;
        case 24: diamonds+="3 "; break;
        case 25: diamonds+="2 "; break;
        case 26: hearts+="A "; break;
        case 27: hearts+="K "; break;
        case 28: hearts+="Q "; break;
        case 29: hearts+="J "; break;
        case 30: hearts+="10 "; break;
        case 31: hearts+="9 "; break;
        case 32: hearts+="8 "; break;
        case 33: hearts+="7 "; break;
        case 34: hearts+="6 "; break;
        case 35: hearts+="5 "; break;
        case 36: hearts+="4 "; break;
        case 37: hearts+="3 "; break;
        case 38: hearts+="2 "; break;
        case 39: spades+="A "; break;
        case 40: spades+="K "; break;
        case 41: spades+="Q "; break;
        case 42: spades+="J "; break;
        case 43: spades+="10 "; break;
        case 44: spades+="9 "; break;
        case 45: spades+="8 "; break;
        case 46: spades+="7 "; break;
        case 47: spades+="6 "; break;
        case 48: spades+="5 "; break;
        case 49: spades+="4 "; break;
        case 50: spades+="3 "; break;
        case 51: spades+="2 "; break;
        
    }
    }
    System.out.print(club + "\n" + hearts + "\n" + diamonds + "\n" + spades + "\n");//Prints the card hand generated
    
    Scanner scan = new Scanner(System.in);
    
    
    System.out.println("Go again? Enter 'y' or 'Y', anything else to quit ");//Asks user if they wish to draw another hand or quit
    String input = scan.nextLine();
    if(input.equals("Y") || input.equals("y")){//If user decides to quit they must enter Y or y to accept their request
        continue;
    }else{
        break;
    }
  }
  
  
}


 public static int exactlyOneDup(int num []){//Same as in the first program, this checks that there is exactly one duplicate in the array
      int numDup = 0;
      int rank = 0;
      
      for (int i=0; i < num.length - 1; i++){//Runs for length of the array
     
     for (int j = i + 1; j < num.length; j++){//Runs for length of array starting from the second value
         if (num[i]%13 == num[j]%13){//Checks to see if two of the values in the array are equal when using modulus 13 which gives the card the number represents
             numDup += 1;//Adds one to numDup saying there is one dupplicate
             rank = num[i];//Gives the value of the number who has a duplicate to indicate the rank
         }
     }
      }
            if (numDup == 1){//If numDup is one there is exactly only one pair
                return rank;//Returns the number being repeated
            }else{ 
                return -1;}//Returns a negative one if there is not exatly one duplicate
  }

    public static void simulateOdds(){
         int arrayHand[] = new int [5];
         int countDup[] = new int [13];
        for (int k = 0; k < countDup.length; k++){
            countDup[k] = 0;
        } 
        for (int i = 0; i < 10000; i++){
            for (int j = 0; j < 5; j++){
            int numRandom = (int)(Math.random()*51);
            arrayHand[j] = numRandom;
            }
            int result = exactlyOneDup(arrayHand);
            
            if(result != -1){//If the number returned by the exactlyOneDup method was -1 that means there was not exactly one dup in the hand array
                countDup[result % 13]++;//Checks type of card the value represents adn to the correspoding space in the array countDup it adds one
            }
        }
        int noDup = 10000;//Starts off with 10000 as the value of the amount of no duplicates
        System.out.println("Rank   Frequency of exactly one pair");//Prints out Rank and Frequency of exactly one pair starting the chartt
        for (int a = 0 ; a <countDup.length; a++){//Runs the program 13 times
            if (a == 0){//Prints the rank according to the type of card that has a duplicate in the array
                System.out.print(" A  ");
                
            }else if(a == 1){
                 System.out.print(" K  ");
            }else if(a == 2){
                 System.out.print(" Q  ");
            }else if(a == 3){
                 System.out.print(" J  ");
            }else {
                 System.out.print(" " + (14-a) + "  ");
            }
                
            System.out.println(countDup[a]);//Prints next to the rank the frequency for each card
            noDup -= countDup[a]; //Takes the amount of dups from the 10000 to get the number of cards without a duplicate
        }
        System.out.println("----------------------------");
        System.out.println("Total not exactly one pair: " + noDup);//Prints frequecy of times there was not exactly one duplicate
    }



}
