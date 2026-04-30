package bank;

public class Conta {
        private double saldo;

        public Conta(double saldoInicial) {
            this.saldo = saldoInicial;
        }

        public double getSaldo() {
            return saldo;
        }

        public void sacar(double valor) throws ContaInvalidaException {

            if (saldo - valor < 0) {
                throw new ContaInvalidaException("Saldo insuficiente para saque!");
            }

            saldo -= valor;
        }

        public void depositar(double valor) {
            saldo += valor;
        }
    }
