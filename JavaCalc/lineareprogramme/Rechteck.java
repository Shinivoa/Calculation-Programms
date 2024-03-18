package lineareprogramme;
import Tools.IOTools;

public class Rechteck {
    public static void main(String[] args) {
        //variable scheiße (int)
        int length, width;
        int scope, area;
        double diagonal;

        //Input
        length = IOTools.readInteger("length =");
        width = IOTools.readInteger("width =");

        //Process
        scope = 2*(length + width);
        area = length * width;
        diagonal = Math.sqrt(length*length + width*width);


        //Output
        System.out.println("scope= " + scope);
        System.out.println("area= " + area);
        System.out.println("diagonal=" + diagonal);
    }
    
}
