
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
        
            raggedArray[0][a] = randomNum;
           
        }
         for (int a = 0; a < k; a++){
            int randomNum = num.nextInt(39);
        
            raggedArray[1][a] = randomNum;
           
        }
         for (int a = 0; a < k; a++){
            int randomNum = num.nextInt(39);
        
            raggedArray[2][a] = randomNum;
           
        }
         for (int a = 0; a < k; a++){
            int randomNum = num.nextInt(39);
        
            raggedArray[3][a] = randomNum;
           
        }
         for (int a = 0; a < k; a++){
            int randomNum = num.nextInt(39);
        
            raggedArray[4][a] = randomNum;
          
        }
        
        }
        System.out.println("Array before sorting");
        
        for (int a = 0; a < raggedArray[a].length; a++){
        int b = 0;
        
        System.out.print(raggedArray[a][b]+" /n");
        
        b++;
    
        }
        
        
        
        
    }
}