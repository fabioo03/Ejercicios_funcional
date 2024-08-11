public class Punto8 {
    static class Calculadora {
        private int total;

        public Calculadora(int inicio) {
            this.total = inicio;
            System.out.println("Valor inicial para la operacion es: " + total);
        }

        public Calculadora sumar(int valor) {
            total += valor;
            System.out.println("Resultado después de sumar " + valor + ": " + total);
            return this;
        }

        public Calculadora restar(int valor) {
            total -= valor;
            System.out.println("Resultado después de restar " + valor + ": " + total);
            return this;
        }

        public Calculadora multiplicar(int valor) {
            total *= valor;
            System.out.println("Resultado después  de multiplicar " + valor + ": " + total);
            return this;
        }

        public Calculadora dividir(int valor) {
            total /= valor;
            System.out.println("Resultado después  de dividir " + valor + ": " + total);
            return this;
        }

        public int getTotal() {
            return total;
        }
    }

    public static void ejecutar() {
        Calculadora calc = new Calculadora(4);
        calc.sumar(10)
                .restar(2)
                .multiplicar(4)
                .dividir(2);
        System.out.println("Resultado final es: " + calc.getTotal());
        System.out.println();
    }
}
