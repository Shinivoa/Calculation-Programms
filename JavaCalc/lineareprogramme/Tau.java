package lineareprogramme;

import Tools.IOTools;

public class Tau {
    public static void main(String[] args) {
        
        int a, b, temp;

      a = IOTools.readInteger("input a = ");
      b = IOTools.readInteger("input b = ");
 
      temp = a;
      a = b;
      b = temp;
      

      System.out.println("a = " +a);
      System.out.println("b = "+b);

    }  
}
