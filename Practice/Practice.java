import java.util.Scanner;
public class Practice{
    
    public static void main (String [] args){
        
       /* int k = 7;
        char c = 'D';
        
        System.out.println( (char) (c + k -5));
        
        String t = "break";
        String s = "fall";
        
        System.out.println( false && false || false && true  );
        
        int i = 0;
int j = 1;
for(i = 1; i<4; i++){
for(j = 1; j<3; j++){
	for (int k = 0; k<j; k++) {
		System.out.println( (int)(k + j) );
	}
}
i++;
	System.out.println( "test" );
}

*/
Scanner scan = new Scanner(System.in);
System.out.println("Enter num: ");
int i = scan.nextInt();
int x,y;
		    for (y= 1; y <= i; y++)
		    {
		        for (x= 0; x < i-y; x++)
		            System.out.print(' ');
		        for (x= (i-y); x < (i-y)+(i*y-1); x++)
		            System.out.print(i);
		        System.out.print('\n');
		    }
	

    }
    
}