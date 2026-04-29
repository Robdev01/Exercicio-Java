import veiculos.carro;
import veiculos.moto;
import veiculos.veiculo;
import java.util.*;



public class Main {

    public static void main(String[] args) {

        List<veiculo> corrida = new ArrayList<>();

        corrida.add(new carro());
        corrida.add(new moto());
        corrida.add(new carro());
        corrida.add(new moto());

        // Simulando corrida
        for (veiculo v : corrida) {
            v.acelerar(100);
        }

        // Ordenando por velocidade
        Collections.sort(corrida);

        System.out.println("🏁 Resultado da corrida:");

        for (veiculo v : corrida) {
            System.out.println(
                    v.getClass().getSimpleName() +
                            " - Velocidade: " + v.getVelocidade()
            );
        }
    }
}