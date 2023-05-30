public class Main {
    public static void main(String[] args) {
        double precioSinIgv = 100;
        System.out.println("Calcular precio");
        System.out.println("Monto: " + precioSinIgv);
        System.out.println("Resultado: " + getPrecio(precioSinIgv));
    }

    public static double getPrecio(double precioSinIgv) {
        return precioSinIgv + precioSinIgv * 0.18;
    }
}