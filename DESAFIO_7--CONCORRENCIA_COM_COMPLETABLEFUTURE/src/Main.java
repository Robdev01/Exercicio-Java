import java.util.concurrent.*;

public class Main {
        public static void main(String[] args) {

            int limite = 1_000_000;

            // =========================
            // SINGLE THREAD
            // =========================
            long inicio1 = System.nanoTime();
            long resultado1 = somarPrimosSingle(limite);
            long fim1 = System.nanoTime();

            // =========================
            // MULTI THREAD (4 threads)
            // =========================
            long inicio2 = System.nanoTime();
            long resultado2 = somarPrimosConcorrente(limite);
            long fim2 = System.nanoTime();

            long tempoSingle = (fim1 - inicio1) / 1_000_000;
            long tempoMulti = (fim2 - inicio2) / 1_000_000;

            System.out.println("Resultado: " + resultado1);
            System.out.println("Single Thread: " + tempoSingle + "ms");
            System.out.println("4 Threads: " + tempoMulti + "ms");

            System.out.println("Speedup: " +
                    (tempoSingle / (double) tempoMulti) + "x");
        }

        // =========================
        // MÉTODO SINGLE THREAD
        // =========================
        public static long somarPrimosSingle(int limite) {
            return somarPrimosIntervalo(1, limite);
        }

        // =========================
        // MÉTODO CONCORRENTE
        // =========================
        public static long somarPrimosConcorrente(int limite) {

            ExecutorService executor = Executors.newFixedThreadPool(4);

            int passo = limite / 4;

            CompletableFuture<Long> f1 =
                    CompletableFuture.supplyAsync(() -> somarPrimosIntervalo(1, passo), executor);

            CompletableFuture<Long> f2 =
                    CompletableFuture.supplyAsync(() -> somarPrimosIntervalo(passo + 1, passo * 2), executor);

            CompletableFuture<Long> f3 =
                    CompletableFuture.supplyAsync(() -> somarPrimosIntervalo(passo * 2 + 1, passo * 3), executor);

            CompletableFuture<Long> f4 =
                    CompletableFuture.supplyAsync(() -> somarPrimosIntervalo(passo * 3 + 1, limite), executor);

            long resultado = f1.join() + f2.join() + f3.join() + f4.join();

            executor.shutdown();

            return resultado;
        }

        // =========================
        // SOMA DE PRIMOS POR INTERVALO
        // =========================
        public static long somarPrimosIntervalo(int inicio, int fim) {

            long soma = 0;

            for (int i = inicio; i <= fim; i++) {
                if (isPrimo(i)) {
                    soma += i;
                }
            }

            return soma;
        }

        // =========================
        // VERIFICA SE É PRIMO
        // =========================
        public static boolean isPrimo(int n) {

            if (n < 2) return false;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

