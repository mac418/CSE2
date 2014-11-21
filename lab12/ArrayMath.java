public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
      v=addArrays(x,y);
    
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
   /* System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));
*/
  }
  
  public static double [] addArrays( double [] x, double [] y){
     int z;
     
      if (x.length > y.length){
           z = x.length;
      }else{
          z =y.length;
      }
      
      double [] addedArray = new double [z];
      
      for (int i=1; i< addedArray.length; i++){
          
       addedArray [i] = x[i] + y[i];
      }  
      
  return addedArray;}
  
 /* public static boolean equals( double [] x, double [] y){
    if (x.length == y.length){
     
     for (int i=1; i<x.length; i++){
     
        if (x[i] == y[i]){

          return true;
      } else {
          return false;
      }
     }
 }
  return false;}
  
*/
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
}