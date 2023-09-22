package lineareprogramme;

import Tools.IOTools;

public class Twopoints {
    public static void main(String[] args) {      


        double b1, b2, a1,a2;
        double a, b, d;


        b1 = IOTools.readDouble("input the point b1 = ");
        b2 = IOTools.readDouble("input the point b2 = ");
        a1 = IOTools.readDouble("input the point a1 = ");
        a2 = IOTools.readDouble("input the point b2 = ");

        a = a1-a2;
        b = b1-b2;

        d = Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
        d = Math.round(d * 100.0) / 100.0;

        System.out.println("Distance between A and B is = " + d);

}   

    
}
