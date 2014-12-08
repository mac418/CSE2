
import java.util.Random;
public class RaggedArray{
    
    public static void main (String [] args){
        
        Random num = new Random ();
        
        int raggedArray[][] = new int [5][];
        for (int j = 0; j < 5; j++){
            int k = j*3+5;
            raggedArray[j] = new int [k];
        
            for (int a = 0; a < k; a++){
                int randomNum = num.nextInt(39);
        
                raggedArray[j][a] = randomNum;
           
            }
        
        }
        System.out.println("Array before sorting");
        
        for (int a = 0; a < 5; a++){
            
            for (int b = 0; b < raggedArray[a].length; b++){
                
            System.out.print(raggedArray[a][b]+" ");
        
    
            }
            System.out.println("");
        }
       for (int y = 0; y < raggedArray.length; y++){ 
        sort(raggedArray[y]);
    
       }
       
       System.out.println("Array after sorting");
        
        for (int a = 0; a < 5; a++){
            
            for (int b = 0; b < raggedArray[a].length; b++){
                
            System.out.print(raggedArray[a][b]+" ");
        
    
            }
            System.out.println("");
        }
    }
    
    public static void sort(int[] arrayInput){
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
    }

}