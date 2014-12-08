/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    System.out.println("So far n equals: "+n);
    System.out.println("So far k equals: "+k);
    System.out.println("So far k equals: "+n*k%12);
    
    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    System.out.println("So far n equals: "+n);
    System.out.println("So far k equals: "+k);
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        System.out.println("So far k equals CASE 114: "+k);
        break;
      case 97:
        n-=14;
        k-=2;
       System.out.println("So far k equals CASE 97: "+k);
        break;
      case 98:
        n/=5;
        k/=9;
       System.out.println("So far k equals CASE 98: "+k);
       System.out.println("So far THAT equals: "+(n/=5));
       System.out.println("So far THIS equals: "+(k/=9));
      default:
        n-=3;
        k-=5;
        System.out.println("So far n equals: "+n);
        System.out.println("So far k equals DEFAULT: "+k);
    }
    //System.out.println("So far k equals: "+k);
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:
 * In the switch statement, in case 98 k becomes 0
 * This value is them passed to out and 1 is divided by k
 * causing the program to crash.
 * 
 */

