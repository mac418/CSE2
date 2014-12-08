import java.util.Scanner;

public class Arrays{
    
    public static void main (String[] arg){
    
    int [] array = new int[10];
    Scanner scan = new Scanner(System.in);
    
    
    System.out.println("Enter 10 ints");
    
        for (int i = 0; i<array.length; i++){
            int input = scan.nextInt();
            array[i] = input;
        }//Sets values of input to array
        
    
    int minVal = 0;
    int min = array [0];
    for (int i = 1; i < array.length; i++){
        if (array[i] < min){
            min = array[i];
            minVal = i;
        }//calculates min
    }
    System.out.println("The lowest entry is: " + minVal);
    
    int maxVal = 0;
    int max = array [0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
            max = array[i];
            maxVal = i;
            }//calulates max
        }
    System.out.println("The highest entry is: " + maxVal);
       
    int sum = 0;
        for (int i = 0; i < array.length; i++){
        sum += array[i];
        }//Adds numbers of the array
        
        
    int[] array2 = new int[array.length];

        for (int i=0; i<array.length; i++){
	        array2[i] = array[10-i];
        }//copies and swaps the values of array to array2
        
     for (int low = 0; low < array2.length; low++){
         System.out.println(array2[low]+"");
            for(int higher = array2.length; higher > 0; higher--){
             System.out.print(array2[higher]);
            }
     }   
        
    }
    
}