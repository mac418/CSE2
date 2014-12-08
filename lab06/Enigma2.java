import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * The java.lang exception says what type of runtime error we have in our code.
 * In this case, there is an arithmetic error since it says "java.lang.ArithmeticException"
 * and since it shows the line and what the error is, we can fix it by changing the code in line 9
 * because it is incorrect to divide a number by zero.
 * 
 */

