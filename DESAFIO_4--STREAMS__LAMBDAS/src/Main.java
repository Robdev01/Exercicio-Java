import stream.Produto;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) {

            List<Produto> produtos = List.of(
                    new Produto("Notebook", 3500, "Eletrônicos"),
                    new Produto("Mouse", 80, "Eletrônicos"),
                    new Produto("Cadeira", 500, "Móveis"),
                    new Produto("Teclado", 150, "Eletrônicos"),
                    new Produto("Mesa", 900, "Móveis")
            );

            Map<String, List<String>> resultado = produtos.stream()
                    .filter(p -> p.getPreco() > 50)
                    .map(p -> new Produto(
                            p.getNome().toUpperCase(),
                            p.getPreco(),
                            p.getCategoria()
                    ))
                    .collect(Collectors.groupingBy(
                            Produto::getCategoria,
                            Collectors.mapping(Produto::getNome, Collectors.toList())
                    ));

            resultado.forEach((categoria, nomes) -> {

                System.out.println("---------- " + categoria.toUpperCase() + " ----------");

                nomes.forEach(System.out::println);

                System.out.println(); // linha em branco
            });
        }
    }

