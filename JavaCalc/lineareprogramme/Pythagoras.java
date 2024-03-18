package lineareprogramme;
import Tools.IOTools; 

public class Pythagoras{
        public static void main(String[] args) {
        //Declaration   
        double a,b,c;

        //input

        a = IOTools.readDouble("please put lenght a in =");
        b = IOTools.readDouble("please put lenght b in =");

        //process
        c = Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
        //output
        String text = "\n The lenght of a is =" +a+
                        "\n The lenght of b is  =" +b+
                        "\n The lenght of c is ="+c;
                System.out.println(text);
        }
    
}
