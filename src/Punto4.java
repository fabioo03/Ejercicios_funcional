import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Punto4 {
    static class Libro {
        private String nombre;
        private String autor;
        private int puntaje;
        public Libro(String nombre, String autor, int puntaje) {
            this.nombre = nombre;
            this.autor = autor;
            this.puntaje = puntaje;
        }
        public String getNombre() {
            return nombre;
        }
        public String getAutor() {
            return autor;
        }
        public int getPuntaje() {
            return puntaje;
        }
    }

    public static void ejecutar() {
        Supplier<List<Libro>> listaLibros = () -> {
            List<Libro> libros = new ArrayList<>();
            libros.add(new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 8));
            libros.add(new Libro("El principito", "Antonio de Saint-Exupery", 6));
            libros.add(new Libro("Cincuenta sombras de Grey", "Erika Leonard Mitchell", 9));
            libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 5));
            libros.add(new Libro("Los juegos del hambre", "Suzanne Collins", 7));
            return libros;
        };

        Consumer<List<Libro>> recomendarLibros = libros -> {
            Predicate<Libro> esRecomendado = libro -> libro.getPuntaje() >= 7;
            UnaryOperator<Libro> recomendar = libro -> {
                if (esRecomendado.test(libro)) {
                    System.out.println("Este libro (" + libro.getNombre() + ") es recomendado miralo :) su puntuacion es de: " + libro.getPuntaje());
                }
                return libro;
            };
            libros.replaceAll(recomendar);
        };
        List<Libro> libros = listaLibros.get();
        recomendarLibros.accept(libros);
    }
}