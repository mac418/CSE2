//HW06 Part 2: Roulette
//Maria Castro
//October 14, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose: To create a roulette-like game where
//a random number is created to which the player bets
//$1 100 times and every time in a series of 1000 rounds of 100
//he/she wins $36 everytime his or her number matches the one
//random number the roulette generates

    public class Roulette{
        public static void main (String [] args){
            int number = (int)((Math.random() * 38) + 1);
            //creates random number assgined for the player to bet on
            int wins=0;
             int lose=0;
              
                int input;
            for(int i = 0; i< 1000; i++){
        //runs the roulette 1000
            for (int j = 0; j< 100; j++){
           //bets the $1 of the player 100 times to the random number     
                input = (int)((Math.random() * 38) + 1);
            //creates random number the roulette will use to compare with the player's
                if (input==number){
                wins++;
                }//checks if input and number are equal if true
                //adds one to the value of the variable wins
                else{
                   
                    lose++;
                }//if input and number don't match then it adds
                //one to the number of losses
               
                break;
            }
            }
            int earnings=wins*36;
            System.out.println("You won "+wins+" times");
              System.out.println("Your lost "+lose+" times");
               System.out.println("Your earnings are $"+earnings);
            //prints the number of times won, number of times lost and the earnings of the player
        }
    }