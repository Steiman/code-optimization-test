
public class TaxCalculation {
    public static void main(String[] args) {

        final double TASA_IMPUESTOS_ALTA = 0.15;
        final double TASA_IMPUESTOS_BAJA = 0.10;
        final double TASA_IMPUESTO_LIMITE = 50;
        double[] productosPrecios = { 100, 200 };
        double[] tasasImpositivas = new double[2];
        for (int i = 0; i < productosPrecios.length; i++) {
            if (i == 0) {
                tasasImpositivas[i] = productosPrecios[i] * TASA_IMPUESTOS_ALTA;
            }
            if (i == 1) {
                tasasImpositivas[i] = productosPrecios[i] * TASA_IMPUESTOS_BAJA;
            }
        }

        double totalTasa = tasasImpositivas[0] + tasasImpositivas[1];

        if (totalTasa > TASA_IMPUESTO_LIMITE) {
            System.out.println("High total tax: " + totalTasa);
        } else {
            System.out.println("Low tax");
        }
    }
}