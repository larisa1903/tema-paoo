public class EcuatieGrad2 {
    public static double[] rezolvaEcuatie(double a, double b, double c) throws IllegalArgumentException {
        if (a == 0) {
            throw new IllegalArgumentException("Coeficientul a nu poate fi 0 (nu este ecuație de gradul 2)");
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            throw new IllegalArgumentException("Ecuația nu are soluții reale.");
        }

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        return new double[]{x1, x2};
    }

    public static void main(String[] args) {
        try {
            double[] solutii = rezolvaEcuatie(1, -3, 2);
            System.out.println("Solutii: x1 = " + solutii[0] + ", x2 = " + solutii[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
