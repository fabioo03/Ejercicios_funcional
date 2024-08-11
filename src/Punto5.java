import java.math.BigDecimal;
import java.util.function.BinaryOperator;
public class Punto5 {
    public static void ejecutar() {
        BinaryOperator<BigDecimal> dividir = (a, b) -> a.divide(b);

        BigDecimal num1 = new BigDecimal("1332");
        BigDecimal num2 = new BigDecimal("2");
        BigDecimal resultado = dividir.apply(num1, num2);

        System.out.println("De la sigueinte operacion -> "+num1+"/"+num2+" el resultado es: " + resultado);
    }
}
