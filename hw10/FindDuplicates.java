//Hw10:Poker Odds
//Maria Castro
//November 18, 2014
//CSE02 Section 112
//Professor Brian Chen

import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num); 
      
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int num []){
    for (int i=0; i < num.length - 1; i++){//Runs the code within the loop for the length of the array num
     
     for (int j = i + 1; j < num.length ; j++){//Runs the code within the loop for the length of the array starting at the second number in the array
     
        if (num[i] == num[j]){//Compares the values of each integer in the array
          return true;//Returns true if they are equal
          
        }
       
      }
     
    }  return false;}//False is they were not true

  
  
  public static boolean exactlyOneDup(int num []){
      int numDup = 0;
      for (int i=0; i < num.length - 1; i++){//Runs the code within the loop for the length of the array num
     
     for (int j = i + 1; j < num.length; j++){//Runs the code within the loop for the length of the array starting at the second number in the array
         if (num[i] == num[j]){//Checks if the ints are equal 
             numDup += 1;}//adds 1 to numDup if the ints are equal
     }
      }
            if (numDup == 1){//If numDup equals one it shows the array has exactly one pair
                return true;//Returns true if condition is met
            }else{ 
                return false;}//False if it is not
  }

  






}