import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Punto9 {
    public static void ejecutar() {
        List<Optional<String>> lista = Arrays.asList(
                Optional.of("Mauro"),
                Optional.empty(),
                Optional.of("Andres"),
                Optional.empty(),
                Optional.of("Jose"),
                Optional.empty(),
                Optional.of("Mateo")
        );
        lista.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);
    }
}
