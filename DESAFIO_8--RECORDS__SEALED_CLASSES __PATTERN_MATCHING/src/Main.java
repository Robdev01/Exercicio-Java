import sealed.Circulo;
import sealed.Forma;
import sealed.Retangulo;

import java.util.List;

public class Main {
     public static void main(String[] args) {

            List<Forma> formas = List.of(
                    new Circulo(2),
                    new Retangulo(3, 4),
                    new Circulo(5)
            );

         formas.forEach(forma -> {

             double area = calcularArea(forma);

             String detalhe = switch (forma) {
                 case Circulo c -> "raio=" + c.raio();
                 case Retangulo r -> "largura=" + r.largura() + ", altura=" + r.altura();
             };

             System.out.println("═══════════════════════");
             System.out.println( forma.getClass().getSimpleName().toUpperCase());
             System.out.println( detalhe);
             System.out.printf("Área: %.2f%n%n", area);
         });
        }

        public static double calcularArea(Forma forma) {

            return switch (forma) {

                case Circulo c ->
                        Math.PI * c.raio() * c.raio();

                case Retangulo r ->
                        r.largura() * r.altura();
            };
        }
    }

