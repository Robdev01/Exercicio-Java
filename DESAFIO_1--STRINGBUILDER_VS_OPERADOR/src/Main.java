

public class Main {
    public static void main(String[] args) {

        StringPerformanceTest test = new StringPerformanceTest();

        Resultado sb = test.testStringBuilder(10000);
        Resultado plus = test.testStringPlus(10000);

        System.out.println("StringBuilder: " + sb.getTempoMs() + "ms");
        System.out.println("Operador +: " + plus.getTempoMs() + "ms");

        System.out.println("Diferença: " +
                (plus.getTempoMs() / (double) sb.getTempoMs()) + "x mais lento");
    }
}