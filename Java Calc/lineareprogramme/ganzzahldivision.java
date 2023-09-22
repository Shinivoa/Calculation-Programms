package lineareprogramme;
import Tools.IOTools;

public class ganzzahldivision {
    public static void main(String[] args) {
        int num1, num2, quotient, left;

        System.out.println("-----------------");
        System.out.println("Division mit Rest");
        System.out.println("-----------------");

        num1 = IOTools.readInteger("please input number1 =");
        num2 = IOTools.readInteger("please input number2 =");

        
        quotient = num1 / num2;
        left = num1 % num2;

        System.out.println();
        System.out.println(num1 + " = " + num2 + " * " + quotient + " + " + left);
        System.out.println("-----------------");


 
      
    }
}
