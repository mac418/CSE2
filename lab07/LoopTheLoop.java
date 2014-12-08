





import java.util.Scanner;
    public class LoopTheLoop{
        public static void main (String [] args){
            int nStars=-1;
            int counter=1;
            int counter1=1;
            
            Scanner myScanner = new Scanner(System.in);
            
            
            boolean integer=true;
            while(integer==true){
                System.out.print("Enter a number between 1 and 15 inclusive : ");
                if (myScanner.hasNextInt()){
                    nStars = myScanner.nextInt();
                    integer=true;
                    if(nStars>=1 || nStars<=15){
                        integer=true;
                    while (counter1<nStars){
                    
                        while (counter<nStars){
                            System.out.print("*");
                                counter++;
                        }
            
                        counter1++;
                        
                    }
                    
                    System.out.println("");
                    System.out.println("");
            
                    for (int i = 1; i <= nStars; i++){

                        for(int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        
                        System.out.println("");
                        System.out.println("");
                    }
            
                }else{
                    integer=false;
                }
            
                break;}
            }    
            
        }
    }