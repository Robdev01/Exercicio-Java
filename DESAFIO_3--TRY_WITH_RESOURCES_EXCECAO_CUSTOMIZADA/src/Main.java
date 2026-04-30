import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import bank.Conta;
import bank.ContaInvalidaException;

public class Main {

        public static void main(String[] args) {

            Path path = Path.of("transacoes.txt");

            Conta conta = new Conta(100);

            try (BufferedWriter writer = Files.newBufferedWriter(path)) {

                writer.write("Saldo inicial: " + conta.getSaldo());
                writer.newLine();

                conta.sacar(50);
                writer.write("Saque de 50 realizado. Saldo: " + conta.getSaldo());
                writer.newLine();

                conta.sacar(70);
                writer.write("Saque de 70 realizado. Saldo: " + conta.getSaldo());

            } catch (ContaInvalidaException e) {

                System.out.println(e.getMessage());

            } catch (IOException e) {

                System.out.println("Erro ao escrever arquivo: " + e.getMessage());
            }
        }
    }

