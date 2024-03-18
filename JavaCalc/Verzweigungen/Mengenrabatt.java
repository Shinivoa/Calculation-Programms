import Tools.IOTools;

public class Mengenrabatt {
    public static void main(String[] args) {
        float price, amount, years_of_business, rabatt, endprice;
        price = IOTools.readFloat(" = ");
        rabatt = 0.0f;
        amount = IOTools.readFloat(" = ");
        years_of_business = IOTools.readFloat(" = ");
        rabatt = price - rabatt;
        endprice = price * amount;
        System.out.println(endprice + "$");

        if (amount < 500.0f) {
            rabatt = 2.00f;
        } else if (amount < 1000.0f) {
            rabatt = 5.00f;
        } else if (amount > 1000.0f) {
            rabatt = 10.00f;
        }
        if (years_of_business > 10) {
            rabatt += 5.00f;
        }
        System.out.println(rabatt + "%");
        endprice = price * amount * (1 - rabatt / 100);
        System.out.println(endprice + "$");
    }

}
