# Desafio Java — Streams + Lambdas (Programação Funcional)

## Objetivo

Este projeto tem como objetivo demonstrar o uso de **Streams e expressões lambda em Java**, aplicando conceitos de programação funcional para manipulação de coleções.

O foco principal é:

* Eliminar o uso de `for` e `while`
* Trabalhar com **pipeline de dados**
* Aplicar operações como `filter`, `map` e `collect`
* Utilizar `Collectors.groupingBy`

---

## Conceito Teórico

A API de **Streams** permite processar dados de forma declarativa, encadeando operações em sequência.

Exemplo:

```java
produtos.stream()
    .filter(p -> p.getPreco() > 100)
    .map(p -> p.getNome().toUpperCase())
    .collect(Collectors.groupingBy(...));
```

Em vez de dizer *como fazer*, você descreve *o que quer fazer*.

---

##  ️ Estrutura do Projeto

```bash
 src/
 └── main/java/
      └── stream/
           └── Produto.java
```

---

## Responsabilidades

* **Produto.java**

    * Representa a entidade produto
    * Contém atributos e getters

* **Main.java**

    * Cria lista de produtos
    * Executa o pipeline com Streams
    * Exibe o resultado formatado

---

##  Como funciona

1. Cria uma lista de produtos
2. Converte para `Stream`
3. Filtra produtos com preço maior que 100
4. Converte os nomes para maiúsculo
5. Agrupa por categoria
6. Exibe os dados formatados

---

##  Pipeline de processamento

```java
produtos.stream()
    .filter(p -> p.getPreco() > 100)
    .map(p -> new Produto(
        p.getNome().toUpperCase(),
        p.getPreco(),
        p.getCategoria()
    ))
    .collect(Collectors.groupingBy(
        Produto::getCategoria,
        Collectors.mapping(Produto::getNome, Collectors.toList())
    ));
```

---

##  Exemplo de saída

```text
---------- MÓVEIS ----------
CADEIRA
MESA

---------- ELETRÔNICOS ----------
NOTEBOOK
TECLADO
```

---

## Operações utilizadas

| Operação       | Descrição                 |
| -------------- | ------------------------- |
| `stream()`     | Cria o fluxo de dados     |
| `filter()`     | Filtra elementos          |
| `map()`        | Transforma elementos      |
| `collect()`    | Converte o resultado      |
| `groupingBy()` | Agrupa por chave          |
| `mapping()`    | Extrai campos específicos |

---

## Comparação com abordagem imperativa

### Imperativo (tradicional)

```java
for (...) {
    if (...) {
        // lógica
    }
}
```

---

###  Funcional (Streams)

```java
dados.stream()
     .filter(...)
     .map(...)
     .collect(...)
```

Código mais declarativo e expressivo

---

## Conclusão

* Streams permitem escrever código mais limpo e expressivo
* Lambdas simplificam a criação de funções inline
* A abordagem funcional melhora a legibilidade
* Ideal para transformação e agregação de dados

---

## Aprendizados

* Como trabalhar com programação funcional em Java
* Diferença entre abordagem imperativa e declarativa
* Uso de `Collectors` para agrupamento e transformação
* Separação entre processamento e apresentação

---

## Possíveis melhorias

* Utilizar `parallelStream()` para processamento paralelo
* Converter resultado para JSON (API REST)
* Integrar com banco de dados
* Criar camada de serviço (Service Layer)
* Aplicar em um projeto Spring Boot

---

## Autor

Projeto desenvolvido com foco em aprendizado de Streams, lambdas e programação funcional moderna em Java.

---
