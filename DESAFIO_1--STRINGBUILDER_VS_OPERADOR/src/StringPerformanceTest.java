public class StringPerformanceTest {

    public Resultado testStringBuilder(int repeticoes) {

        long inicio = System.nanoTime();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeticoes; i++) {
            sb.append("a");
        }

        long fim = System.nanoTime();

        return new Resultado((fim - inicio) / 1_000_000);
    }

    public Resultado testStringPlus(int repeticoes) {

        long inicio = System.nanoTime();

        String texto = "";

        for (int i = 0; i < repeticoes; i++) {
            texto = texto + "a";
        }

        long fim = System.nanoTime();

        return new Resultado((fim - inicio) / 1_000_000);
    }
}