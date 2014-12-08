//Hw07: Number Stack
//Maria Castro
//October 21, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose: To create three series of stacks that print
//out numbers in smaller stacks from number 1 to the number entered by the user

import java.util.Scanner;
    
    public class NumberStack{
        public static void main(String [] args){
            
            Scanner myScanner = new Scanner(System.in);
            
            System.out.print("Enter a number between 1 and 9 : ");
           
            int n = myScanner.nextInt();
            int spaces;
            int count=0;
            
            
            System.out.println("Using for loops");
            for (int i = 1; i <= n; i++){
            //Creates sequence that runs the code depending on the
            //value the user inputs
                int y = i + (i-1);
                
                
                for (int r = 1 ; r <= i ; r++){
                //Creates the right number of rows
                //for each number
                
                for (int k =0; k <= n-i-1; k++){
                    System.out.print(" ");
                }
                 // Creates the number of columns
                    for (int m = 1; m <= y ; m++){
                        System.out.print(i);
                    }
               //Creates the spaces to center the pyramid
                for (int k =0; k <= n-i-1; k++){
                    System.out.print(" ");
                }
                    System.out.print("\n");
                }//Creates the spaces between the number stacks
                    
                
                for (int k =0; k <= n-i-1; k++){
                    System.out.print(" ");
                }//Centers again
                
                for (int r = 1; r <= y; r++) {
                    System.out.print("-");
                //Places the dashes between stacks
                }
                System.out.print("\n");
            }
            System.out.print("\n");
            
            
            
            
            System.out.println("Using while loops");
            int i = 1;
            int k = 0;
            
            while(i <= n) {
                int y = i + (i-1);

                int r = 1;
                while (r <= i) {
                   //Makes the rows 
                    
                //Centers the pyramid
                while(k<=(n-i-1)){
                    System.out.print(" ");
                    k++;
                
                    int m = 1;
                    while (m <= y) {
                        System.out.print(i);
                        m++;
                    while(k<=(n-i-1)){
                    System.out.print(" ");
                    k++;
                    }
                    }
                    
                    
                    System.out.print("\n");
                    r++;
                
                
                 
                int x=1;    
                while (x<=y) {
                    System.out.print("-");
                    x++;
                //makes the dashes between stacks
                //centers the pyramid
                    while(k<=(n-i-1)){
                    System.out.print(" ");
                    k++;
                        
                    }
                }
                    
                System.out.print("\n");
                i++;
            }
            }
            System.out.print("\n");
        
            
    System.out.println("Using do-while loops: ");
            i=1;
            int g, j;
            do{
                g = i+(i-1);
                j = 1;
                //makes rows
                do{
                    k=1;
                    do{
                        System.out.print(i);
                        k++;
                    
                    }//makes the columns
                    while (k<=g);
                        System.out.print("\n");
                        j++;
                }
                while (j<=i);
                k=1;
                do{
                    System.out.print("-");
                    k++;
                    //makes dash lines
                }
                while (k<=g);
                System.out.print("\n");
                i++;
            //makes spaces between stacks
            }
            while (i<=n);
            
            
            
            
            
        }
                
          
    }
}