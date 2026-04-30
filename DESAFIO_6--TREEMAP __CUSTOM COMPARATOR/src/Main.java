import treemap.Item;

import java.util.*;

public class Main {
        public static void main(String[] args) {

            // Comparator por nome (ordem alfabética)
            TreeMap<String, Item> inventario =
                    new TreeMap<>(Comparator.naturalOrder());

            inventario.put("Notebook", new Item("Notebook", 3500));
            inventario.put("Mouse", new Item("Mouse", 80));
            inventario.put("Cadeira", new Item("Cadeira", 500));
            inventario.put("Teclado", new Item("Teclado", 150));

            // =========================
            // Exibindo ordenado
            // =========================
            System.out.println("Inventário ordenado:");

            inventario.forEach((nome, item) ->
                    System.out.println(nome + " -> " + item)
            );

            // =========================
            // Buscar item mais caro
            // =========================
            Item maisCaro = inventario.values().stream()
                    .max(Comparator.comparing(Item::getPreco))
                    .orElse(null);

            System.out.println("\n Item mais caro:");
            System.out.println(maisCaro);
        }
    }
