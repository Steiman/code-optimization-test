public class Store {
    public static void main(String[] args) {
     final int[] PRICES = {15, 10, 5}; 
     final int[] QUANTITIES = {2, 3, 4}; 
     final int SALES_THRESHOLD = 50; 
        // se calcula el total de sales multiplicando el arreglo prices por quantities
        int totalSales = 0;
        for (int i = 0; i < PRICES.length; i++) {
        int totalSales = totalSales + (PRICES[i] * QUANTITIES[i]);
        
       // se verifica con el if-else que el programa funcione correctamente 
        if (totalSales > SALES_THRESHOLD) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}