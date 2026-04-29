package veiculos;

public abstract class veiculo implements Comparable<veiculo> {
                private int velocidade;

        public veiculo() {
            this.velocidade = 0;
        }

        public abstract void acelerar(int incremento);
        public abstract void frear(int decremento);

        public int getVelocidade() {
            return velocidade;
        }

        protected void setVelocidade(int velocidade) {
            this.velocidade = velocidade;
        }

        @Override
        public int compareTo(veiculo outro) {
            return Integer.compare(this.velocidade, outro.velocidade);
        }
}


