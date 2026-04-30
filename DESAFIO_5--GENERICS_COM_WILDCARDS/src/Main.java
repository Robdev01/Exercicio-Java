import generics.Caixa;

public class Main {
        public static void main(String[] args) {

            // =========================
            // ? extends Number (leitura)
            // =========================
            Caixa<? extends Number> apenasLeitura = new Caixa<Double>();

            // ❌ Não posso guardar
            // apenasLeitura.guardar(10); // erro de compilação

            Number valor = apenasLeitura.pegar(); // ✔ permitido
            System.out.println("Leitura: " + valor);


            // =========================
            // ? super Number (escrita)
            // =========================
            Caixa<? super Number> caixa = new Caixa<Object>();

            caixa.guardar(10);      // Integer ✔
            caixa.guardar(10.5);    // Double ✔

            Object obj = caixa.pegar(); // ⚠ só Object
            System.out.println("Escrita: " + obj);
        }
    }
