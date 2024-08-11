import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Punto7 {
    public static void ejecutar() {
        List<LocalDate> fechas = Arrays.asList(
                LocalDate.of(2000, 3, 3),
                LocalDate.of(2015, 5, 15),
                LocalDate.of(2024, 8, 8)
        );

        fechas.forEach(Punto7::mostrarFecha);
    }

    public static void mostrarFecha(LocalDate fecha) {
        System.out.println("La fecha es:" + fecha.getDayOfMonth() +
                " de " + fecha.getMonth() +
                " del " + fecha.getYear());
    }
}
