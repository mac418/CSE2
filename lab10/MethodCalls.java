



public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    
    public static int addDigit( int x, int y){
        String number = Integer.toString(x);
        String digit = Integer.toString(y);
        String z = digit+number;
        int q = Integer.parseInt(z);
        return q;
    }
    
    public static int join( int i, int k){
        String j = Integer.toString(i);
        String n = Integer.toString(k);
        String c = j+n;
        int p = Integer.parseInt(c);
        return p;
    } 
    
}  
