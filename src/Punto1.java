public class Punto1 {
    public static void ejecutar() {
        class Mutable {
            private int value;
            public Mutable(int value) {
                this.value = value;
            }
            public int getValue() {
                return value;
            }
            public void setValue(int value) {
                this.value = value;
            }
        }

        final class Immutable {
            private final int value;
            public Immutable(int value) {
                this.value = value;
            }
            public int getValue() {
                return value;
            }
        }

        Mutable mutable = new Mutable(5);
        System.out.println("Ejemplo Mutable: en esta vamos a ver como se comporta el valor y ver como se modifica ");
        System.out.println("Valor mutable inicial: " + mutable.getValue());
        mutable.setValue(10);
        System.out.println("Valor mutable modificado: " + mutable.getValue());

        Immutable immutable = new Immutable(5);
        System.out.println("Ejemplo Inmutable: en esta vamos a ver como se comporta el valor y ver como se mantiene    ");
        System.out.println("Valor inmutable: " + immutable.getValue());

    }
}
