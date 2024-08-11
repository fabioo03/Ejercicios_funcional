import java.util.function.Function;
import java.util.function.Predicate;

public class Punto3 {
    public static void ejecutar() {
        Function<Integer, Integer> potencia = x -> x * x;
        Predicate<Integer> esPar = x -> x % 2 == 0;

        int numero = 2;
        int resultado = potencia.apply(numero);
        boolean par = esPar.test(resultado);

        System.out.println("La potencia de " + numero + " es: " + resultado);
        System.out.println("¿Es par el resultado? -> " + par);
    }
}
