package veiculos;

public class moto extends veiculo {
        private final int rodas = 2;

        @Override
        public void acelerar(int incremento) {
            int novaVelocidade = getVelocidade() + (int)(incremento * 1.2);
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
