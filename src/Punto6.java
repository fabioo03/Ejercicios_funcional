import java.time.LocalDate;
import java.time.Period;
import java.util.function.BiFunction;
public class Punto6 {
    @FunctionalInterface
    interface PersonaValidator {
        String validar(String nombre, int edad, LocalDate fechaNacimiento);
    }
    public static void ejecutar() {
        BiFunction<LocalDate, Integer, Boolean> validarEdad = (fechaNacimiento, edad) ->
                Period.between(fechaNacimiento, LocalDate.now()).getYears() == edad;

        PersonaValidator validador = (nombre, edad, fechaNacimiento) -> {
            boolean esValida = validarEdad.apply(fechaNacimiento, edad);
            return "La fecha de nacimiento de " + nombre +
                    (esValida ? " corresponde " : " no corresponde ") +
                    "a la edad ingresada.";
        };
        // Ingresamos 2 datos para revisar si la edad si corresponde o no para la prueba
        String mensaje = validador.validar("Juan", 80, LocalDate.of(1990, 6, 6));
        String mensaje1 = validador.validar("Carlos", 24, LocalDate.of(2000, 3, 3));
        System.out.println(mensaje + "\n" + mensaje1);
    }
}
