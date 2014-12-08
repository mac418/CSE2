//Hw11:Poker Hands
//Maria Castro
//December 6, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose: To create a program that generates a hand with input form the user who is asked for the suit of the card and the rank
//then we check for the type of hand it is according to the rules of poker and then displays the hand and the type.


import java.util.Scanner;
public class PokerHands{
    
    public static void main(String [] args){
        
        int hand[] = new int [5];
        Scanner myScan = new Scanner(System.in);
        
       while (true){
       System.out.println("Enter 'y' or 'Y' to enter a (nother) hand: ");//Asks user if they wish to draw another hand
                 String yOrY = myScan.nextLine();
               
            if(yOrY.equals("Y") || yOrY.equals("y")){  
       
                hand = generateHand();//Gives the value to the hand array
        
            }else{
                System.out.println("You did not enter a valid response");
                    break;
            }  
        
        showOneHand(hand);//Displays hand
        
        int handRank[] = new int[13];//Array has 13 places in its index and will have a one added to each place depending on the rank of the cards in the hand array
        int handCount[] = new int[5];//Array has 5 places in its index and will have a one added to each place which stands for 0 1 2 3 4, whenever there is a 0 1 2 3 or 4 in the handRank array
        int handSuit[] = new int[4];//Array had 4 places in its index that correspond to the suit and adds a one to each place whenever a card of that suit is found in the hand array 
        
        for (int d = 0; d < handRank.length; d++){
            handRank[d]=0;
            
        }
        for (int f = 0;f < 5;f++){ //Declares the value of handRank using the rank of the hand array
            switch (hand[f]%13){
                case 0:
                    handRank[0]+=1;
                    break;
                case 1:
                    handRank[1]+=1;
                    break;
                case 2:
                    handRank[2]+=1;
                    break;
                case 3:
                    handRank[3]+=1;
                    break;
                case 4:
                    handRank[4]+=1;
                    break;
                case 5:
                    handRank[5]+=1;
                    break;
                case 6:
                    handRank[6]+=1;
                    break;
                case 7:
                    handRank[7]+=1;
                    break;
                case 8:
                    handRank[8]+=1;
                    break;
                case 9:
                    handRank[9]+=1;
                    break;
                case 10:
                    handRank[10]+=1;
                    break;
                case 11:
                    handRank[11]+=1;
                    break;
                case 12:
                    handRank[12]+=1;
                    break;
                default:
                break;
            }
        } 
        
        for (int h = 0; h < handCount.length; h++){
            handCount[h]=0;
        }
        for (int g = 0; g < handRank.length; g++){//Declares values for handCount using handRank's values
            switch (handRank[g]){
                case 0:
                    handCount[0]+=1;
                    break;
                case 1:
                    handCount[1]+=1;
                     break;
                case 2:
                    handCount[2]+=1;
                     break;
                case 3:
                    handCount[3]+=1;
                     break;
                case 4:
                    handCount[4]+=1;
                     break;
                    
            }
        }
        
        for (int n = 0; n < handSuit.length; n++){
            handSuit[n]=0;
        }
        for (int m = 0; m < handCount.length; m++){
            int casted = (int)(hand[m]/13);
            
            switch (casted){//Declares values for suit using the values from casted which gets the rank of the cards in hand
                case 0:
                    handSuit[0]+=1;
                    break;
                case 1:
                    handSuit[1]+=1;
                     break;
                case 2:
                    handSuit[2]+=1;
                     break;
                case 3:
                    handSuit[3]+=1;
                     break;
            }
        }
        
        int[] sortedHand = new int[5];
        sortedHand = sort(hand);
        boolean checker = false;
        //CHECK FOR ROYAL FLUSH
        boolean royal = false;
        if ((sortedHand[0]%13)==0 && (sortedHand[1]%13)==1 && (sortedHand[2]%13)==2 && (sortedHand[3]%13)==3 && (sortedHand[4]%13)==4){
             //CHECK FOR STRAIGHT
            
            for (int flush = 0; flush < handSuit.length; flush++){
                if (handSuit[flush] == 5){
                    royal = true;
                
                    if (sortedHand[0]%13 < sortedHand[1]%13 && sortedHand[1]%13 < sortedHand[2]%13 && sortedHand[2]%13 < sortedHand[3]%13 && sortedHand[3]%13 < sortedHand[4]%13){
                        checker = true;
                    }
            //CHECK FOR STRAIGHT
                    }
            }
                    if ((handCount[1]==5) && checker==true && royal==true){
                        System.out.println("This is a Royal Flush");
                    }
        }else{
        
        //CHECK FOR STRAIGHT FLUSH
        
            //CHECK FOR FLUSH
            for (int flush = 0; flush < handSuit.length; flush++){
                if (handSuit[flush] == 5){
                    royal = true;
                
                    if (sortedHand[0]%13 < sortedHand[1]%13 && sortedHand[1]%13 < sortedHand[2]%13 && sortedHand[2]%13 < sortedHand[3]%13 && sortedHand[3]%13 < sortedHand[4]%13){
                        checker = true;
                    }
            //CHECK FOR STRAIGHT
                    if ((handCount[1]==5) && checker==true && royal==true){
                        System.out.println("This is a Straight Flush");
                    }else if((handCount[1]==5) && checker==false && royal==true){
                        System.out.println("This is a Flush");
                    }else if(checker==true && royal==false){
                        System.out.println("This is a Straight");
                    }
                }
            }
        }
       int pairsCount = 0;
       
        //CHECK FOR FOUR OF A KIND
        
            if (handCount[4]==1){
                System.out.println("This is a Four of a Kind");
            }else if ((handCount[2]==1) && (handCount[3]==1)){
                //CHECK FOR FULL HOUSE
                System.out.println("This is a Full House");
            } else if (handCount[2]==1){
            //CHECK FOR PAIRS
            System.out.println("This is a One Pair");
            pairsCount = 0;
            }else if(handCount[2]==2){
            System.out.println("This is a Two Pairs");
            pairsCount = 0;
        }else{
        
        //CHECK FOR HIGH CARD
        
                                System.out.println("This is a High Card");
                            }
                
    }    
}
    
    public static int[] generateHand(){
        
    int temp [] = new int[5];
    Scanner scan = new Scanner(System.in);
    int suitVal = 0;
    int rankVal = 0;
    int i = 0;
                    while ( i < 5){
                    System.out.println("Enter the suit: 'c', 'd', 'h', or 's': ");
                    String suit = scan.nextLine();
                        
                    if (suit.equals("c") || suit.equals("d") || suit.equals("h") || suit.equals("s")){
                        suitVal = 0;
                        //Since the suit of clubs starts at 0 and goes to 12, then the suit of diamonds starts at 3 and so on, the value of suitVal is assigned with the first number of where the suit starts from 0 to 51
                        if (suit.equals("c")){
                         suitVal=0;
                        }else if(suit.equals("d")){
                            suitVal+=13;
                        }else if(suit.equals("h")){
                            suitVal+=26;
                        }else if(suit.equals("s")){
                            suitVal+=39;
                        }
                        System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2': ");
                        String rank = scan.nextLine();
                        
                        if(rank.equals("a") || rank.equals("k") || rank.equals("q") || rank.equals("j") || rank.equals("10") || rank.equals("9") || rank.equals("8") || rank.equals("7") || rank.equals("6") || rank.equals("5") || rank.equals("4") || rank.equals("3") || rank.equals("2")){
                            rankVal = 0;
                            if (rank.equals("a")){
                                rankVal=0;
                            }else if(rank.equals("k")){
                                rankVal+=1;
                            }else if(rank.equals("q")){
                                rankVal+=2;
                            }else if(rank.equals("j")){
                                rankVal+=3;
                            }else if(rank.equals("10")){
                                rankVal+=4;
                            }else if(rank.equals("9")){
                                rankVal+=5;
                            }else if(rank.equals("8")){
                                rankVal+=6;
                            }else if(rank.equals("7")){
                                rankVal+=7;
                            }else if(rank.equals("6")){
                                rankVal+=8;
                                System.out.println("val");
                            }else if(rank.equals("5")){
                                rankVal+=9;
                            }else if(rank.equals("4")){
                                rankVal+=10;
                            }else if(rank.equals("3")){
                                rankVal+=11;
                            }else if(rank.equals("2")){
                                rankVal+=12;
                            }
                         
                         
                         int result = suitVal + rankVal;
                   
                         for(int k = 0; k < temp.length; k++){
                            if (temp[k] == result){
                            System.out.println("You already entered that card");
                            
                        }else{
                            
                            temp [i] = result;//Assigns value to the arrray that will be returned
                            i++;
                            break;
                        }
                        }
          
           }else{
                System.out.println("You did not enter a valid response");
            }
                            
                        }else{
                          System.out.println("You did not enter a valid response");
                         
                        }
                        
                    }
          
    return temp;}
    
    public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",  "Spades:   "};
	
	String face[]={ "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	                "4 ","3 ","2 "};
	String out="";
	
	for(int s = 0;s < 4;s++){
  	    out += suit[s];
    	for(int rank = 0; rank < 13;rank++){
        	for(int card = 0; card < 5; card++){
     	        if(hand[card]/13==s && hand[card]%13==rank){
      	            out+=face[rank];
  	                out+='\n';
     	        }
        	}
	    }	
	}
	System.out.println(out);
  }
    
    public static int[] sort(int[] arrayInput){//Sorts the array by checking for the smallest value then swapping it until the array is ascending order
        for (int c = 0; c < arrayInput.length; c++){
            int currentMin = arrayInput[c];
            int currentIndex = c;
            for(int d = c; d < arrayInput.length; d++){
                if(arrayInput[d] < currentMin){
                    currentMin = arrayInput[d];
                    currentIndex = d;
                }
            }
        int temp = arrayInput[c];
        arrayInput[c] = currentMin;
        arrayInput[currentIndex] = temp;
        }
        int sortedArray[] = new int[arrayInput.length];
        sortedArray = arrayInput;
    return sortedArray;}

}