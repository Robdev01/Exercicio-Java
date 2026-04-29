package veiculos;

public class carro extends veiculo{
       private final int rodas = 4;

        @Override
        public void acelerar(int incremento) {
            int novaVelocidade = getVelocidade() + (int)(incremento * 0.9);
            setVelocidade(novaVelocidade);
        }

        @Override
        public void frear(int decremento) {
            int novaVelocidade = Math.max(0, getVelocidade() - decremento);
            setVelocidade(novaVelocidade);
        }

        public int getRodas() {
            return rodas;
        }
}

