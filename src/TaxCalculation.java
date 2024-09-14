
public class TaxCalculation {
    public static void main(String[] args) {
        int productos [] = new int [3];
        productos[0] = 300;
        productos[1] = 500;
        productos[2] = 700;

        double productPrice1 = 100;
        double productPrice2 = 200;
        double TAX_THRESHOLD = 50;
        final double TAX_RATE_HIGH = 0.15;
        final double TAX_RATE_LOW = 0.10;
        
        double tax1 = productPrice1 * TAX_RATE_HIGH;
        double tax2 = productPrice2 * TAX_RATE_LOW;
        double totalTax = tax1 + tax2;
        
        if (TAX_THRESHOLD > 50) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}
