public class Store {
    private static final int[] PRICES = {15, 10, 5}; 
    private static final int[] QUANTITIES = {2, 3, 4}; 
    private static final int SALES_THRESHOLD = 50; 

    public static void main(String[] args) {
      
        int totalSales = calculateTotalSales();
      
        if (totalSales > SALES_THRESHOLD) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
    
    private static int calculateTotalSales() {
        int totalSales = 0;

        for (int i = 0; i < PRICES.length; i++) {
            totalSales += PRICES[i] * QUANTITIES[i];
        }

        return totalSales;
    }
}