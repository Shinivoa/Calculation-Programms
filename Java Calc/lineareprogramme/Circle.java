package lineareprogramme;
import Tools.IOTools;

public class Circle {
    public static void main(String[] args) {
        /*
         * var of a circle 
         * inputs the area
         */
         double r, d, scope, area;


        d = IOTools.readDouble("please input the d =");
        
        //processs
        r = d /2; 
        scope = d* Math.PI;
        area = Math.PI * Math.pow(r, 2);

         //output 

         System.out.println("d =" +d);
         System.out.println("scope ="+ scope);
         System.out.println("area ="+ area);




    }
    
}
