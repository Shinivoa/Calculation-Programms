package lineareprogramme;

import Tools.IOTools;

public class KegelStumpf {

    public static void main(String[] args) {
        
        double rG, rD, h, m, aM, O, aG, aD, V;


        rG = IOTools.readDouble("input RadiusGrund =");
        rD = IOTools.readDouble("input RadiousTop =");
        h = IOTools.readDouble("input height =");

        aG = Math.PI * Math.pow(rG, 2);
        aD = Math.PI * Math.pow(rD, 2);
        m = Math.sqrt(Math.pow(rD - rD, 2) + Math.pow(h, 2));
        aM = (rG + rD) * Math.PI * m;
        O = aM + aG + aD;
        V = 1/3.0 * h * Math.PI *  (rG*rG + rG * rD + rD*rD);


        System.out.println("The lenght of GroundArea is= " + aG);
        System.out.println("The lenght of  "+ aD);
        System.out.println("The lenght of  " + m);
        System.out.println("The lenght of  " + O );
        System.out.println("The lenght of  "+ V);








    
    }
    
}
