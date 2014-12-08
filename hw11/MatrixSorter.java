//Hw11: Matrix Sorter
//Maria Castro
//December 7, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose: Creating a program that generates a 3D array filled with random integers from 1 to 99
//Then displays them
//Then finds the minimum values and displays it.
//Afterwards it uses selection sorting and insertion sorting to sort the values within the rows of the 3rd slab
//in ascending order and then the rows in ascending order using the first value of each one as reference.
//Finally displaying the sorted array

import java.util.Random;
public class MatrixSorter{
    
    public static void main (String [] arg){
    
        int mat3d[][][] = new int[3][][];
        mat3d = buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        selectionSort(mat3d[2]);
        insertionSort(mat3d[2]);
        show(mat3d);//Shows sorted array
}
    public static int [][][] buildMat3d(){

        Random num = new Random ();
        
     //slab number
    int k;
    int [][][] raggedArray = new int [3][][];
    
    for (int s = 0; s < 3; s++){
        int row = (3+2*s);
        raggedArray [s] = new int [row][];
        //Allocates the spaces of the second level of the array
    }
         
        //rows 
        for (int firstD = 0; firstD < 3; firstD++){
        
            //columns
            for (int col = 0; col < raggedArray[firstD].length; col++){
            
            raggedArray [firstD][col] = new int [firstD + col + 1 ];
            //Allocates the spaces for the third level of the array
            }
        }
    
        for (int one = 0; one < 3; one++){
            
            for(int two = 0; two < (3+2*one); two++){
                
                int third = one+two+1;
                for (int z = 0; z < third; z++){
            
                    int randomNum = (int)((Math.random() * 99) + 1);
        
                    raggedArray[one][two][z] = randomNum;
                //Initializes with random numbers from 1 to 99 each space of the third level of the array
                }
            }
        }
    
    
    return raggedArray;}
    
    public static void show(int [][][]raggedArray){
        System.out.println("Array:");
        
        for (int a = 0; a < raggedArray.length; a++){
          System.out.println("-------------------------Slab " + (a+1)); 
          
            for (int b = 0; b < raggedArray[a].length; b++){
                
                for(int c = 0; c < raggedArray[a][b].length ; c++){
                
            System.out.print(raggedArray[a][b][c]+" ");
            //Prints each value of the array in the third level
        
    
                }
            System.out.println("");
            
            }
        
        }
        System.out.println("-------------------------");
        
    }
    
   //Selecction sort 
     public static int[][] selectionSort(int[][] arrayInput){
         //Compares the values of the in each row in an ascending order and swaps them to display them in an ascending order
            int temp;
            for (int row = 0; row < arrayInput.length; row++){
                
                for (int column = 0; column < arrayInput[row].length; column++){
                    int currentMin = arrayInput[row][column];
                    int currentIndex = column;
                    
                    for(int d = (column + 1); d < arrayInput[row].length; d++){
                        
                         if(arrayInput[row][d] < currentMin){
                            currentMin = arrayInput[row][d];
                            currentIndex = d;
                            }
                    }
                temp = arrayInput[row][column];
                arrayInput[row][column] = currentMin;
                arrayInput[row][currentIndex] = temp;
                //Sawps the values of the min value found with the one it was being compared to
                }
            }

return arrayInput;
         
     }


    
    public static int[][] insertionSort(int[][] sortedOnceArray){
    
    int temp[];
        for (int i = 1; i < sortedOnceArray.length; i++) {

            // Loops backwards from i to find where the lowest value needs to be put
            int value = sortedOnceArray[i][0];
            int j = i - 1;
            while (j >= 0 && sortedOnceArray[j][0] > value){
                

            //Swaps the values into order
            temp = sortedOnceArray[j + 1];
            sortedOnceArray[j + 1]=sortedOnceArray[j];
            sortedOnceArray[j]=temp;
            j--;
            }
        sortedOnceArray[j + 1][0] = value;
        //Resets the value of variable value
        }
    
        
    return sortedOnceArray;
        
    }
    
    
    public static int findMin(int [][][] array){
    
    int min = 100;
    
    for (int slabPlace = 0; slabPlace < array.length; slabPlace++){
        
        for (int i = 0; i < array[slabPlace].length; i++){
        
            for(int p = 0; p < array[slabPlace][i].length; p++){
            
                if (array[slabPlace][i][p] < min){
                    min = array[slabPlace][i][p];
                //Compares in a similar way as selectionSort does by comparing the values in an ascending order
                //Then min is set to the smallest value in the array and is displayed through the main method
                }//Calculates min
            }
        }
    }
    return min;}
   
    
}

