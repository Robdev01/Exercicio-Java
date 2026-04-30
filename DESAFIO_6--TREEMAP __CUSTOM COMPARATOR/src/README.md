# 🌳 Desafio Java — TreeMap + Custom Comparator

## 📌 Objetivo

Este projeto tem como objetivo demonstrar o uso de **coleções avançadas em Java**, com foco em:

* 🔹 `TreeMap` para ordenação automática
* 🔹 Uso de `Comparator` customizado
* 🔹 Busca de elementos com base em critérios (maior valor)
* 🔹 Entendimento de complexidade (**O(log n)**)

A proposta simula um inventário de itens ordenado por nome, com identificação do item mais caro.

---

## 🧠 Conceito Teórico

### 🔹 TreeMap

O `TreeMap` é uma implementação de `Map` baseada em árvore (Red-Black Tree), que mantém os elementos **sempre ordenados pela chave**.

```java
TreeMap<String, Item> inventario = new TreeMap<>();
```

👉 Inserção, remoção e busca em **O(log n)**
👉 Ordenação automática sem necessidade de sort manual

---

### 🔹 Comparator

Permite definir regras de ordenação personalizadas.

```java
new TreeMap<>(Comparator.naturalOrder());
```

👉 Também pode ser customizado para outras lógicas

---

## 🏗️ Estrutura do Projeto

```bash
src/
 └── main/java/
      └── treemap/
           └── Item.java
```

---

## 📂 Responsabilidades

* **Item.java**

    * Representa um item do inventário
    * Contém nome e preço

* **Main.java**

    * Cria o inventário com `TreeMap`
    * Insere itens
    * Exibe itens ordenados
    * Busca o item mais caro

---

## ⚙️ Como funciona

1. Cria um `TreeMap` ordenado por nome
2. Insere itens no inventário
3. Os itens são automaticamente organizados em ordem alfabética
4. Utiliza `Stream` para encontrar o item com maior preço
5. Exibe os resultados

---

## 📊 Exemplo de saída

```text
📦 Inventário ordenado:
Cadeira -> Cadeira - R$ 500.0
Mouse -> Mouse - R$ 80.0
Notebook -> Notebook - R$ 3500.0
Teclado -> Teclado - R$ 150.0

💰 Item mais caro:
Notebook - R$ 3500.0
```

---

## 🔍 Operações utilizadas

| Operação     | Descrição              |
| ------------ | ---------------------- |
| `TreeMap`    | Estrutura ordenada     |
| `put()`      | Inserção de elementos  |
| `forEach()`  | Iteração               |
| `Comparator` | Regra de ordenação     |
| `stream()`   | Processamento de dados |
| `max()`      | Busca do maior valor   |

---

## ⚖️ Complexidade

| Operação         | Complexidade |
| ---------------- | ------------ |
| Inserção (`put`) | O(log n)     |
| Busca (`get`)    | O(log n)     |
| Ordenação        | Automática   |
| Buscar mais caro | O(n)         |

---

## 🎯 Conclusão

* `TreeMap` mantém dados ordenados automaticamente
* `Comparator` permite customizar regras de ordenação
* Streams complementam operações baseadas em valores
* Escolher a estrutura correta impacta diretamente na performance

---

## 🧠 Aprendizados

* Diferença entre `HashMap` e `TreeMap`
* Uso de estruturas baseadas em árvore
* Aplicação de `Comparator`
* Como combinar coleções com programação funcional

---

## 🚀 Possíveis melhorias

* Ordenar por preço utilizando outra estrutura (`TreeMap<Double, Item>`)
* Utilizar `PriorityQueue` para ranking de itens
* Criar sistema de busca por faixa de preço
* Integrar com banco de dados
* Criar API REST com Spring Boot

---

## 💡 Autor

Projeto desenvolvido com foco em aprendizado de coleções avançadas, estruturas de dados e performance em Java.

---
