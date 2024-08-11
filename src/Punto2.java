import java.util.function.Function;

public class Punto2 {
    public static void ejecutar() {
        Function<Integer, Integer> potencia = x -> x * x;
        int numero = 3;
        int resultado = potencia.apply(numero);
        System.out.println("La potencia de " + numero + " es: " + resultado);
    }
}
