





import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter three ints");
    a=getInt(scan);
    b=getInt(scan);
    c=getInt(scan);
    System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
    System.out.println("The larger of "+a+", "+b+", and "+c+
                       " is "+larger(a,larger(b,c)));
    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");
  }
  
  public static int getInt(Scanner x){
      x = new Scanner(System.in);
      System.out.print("Enter an int: ");
    while (true) {
      if (x.hasNextInt()) 
      {
          int y = x.nextInt();
          return y;}
        
        else {
            System.out.print("You did not enter an int. Try again: ");
        }
    }  
      
  }
  
  public static int larger(int j, int k){
      
      if (j>k) {return j;}
      
      else {return k;}
  }
  
  
  public static boolean ascending(int a, int b, int c){
      
      if (a<b && b<c) {return true;}
      else {return false;}
  }
      
  }