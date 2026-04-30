# ⚡ Desafio Java — Concorrência com CompletableFuture

## 📌 Objetivo

Este projeto tem como objetivo demonstrar o uso de **programação concorrente em Java** utilizando:

* 🔹 `CompletableFuture`
* 🔹 `ExecutorService`
* 🔹 Processamento paralelo com múltiplas threads
* 🔹 Medição de performance (single thread vs multi-thread)

A proposta consiste em calcular a soma de números primos até 1.000.000, comparando execução sequencial e paralela.

---

## 🧠 Conceito Teórico

### 🔹 Concorrência em Java

Concorrência permite executar múltiplas tarefas simultaneamente, reduzindo o tempo total de processamento em operações intensivas de CPU.

---

### 🔹 CompletableFuture

```java
CompletableFuture.supplyAsync(() -> tarefa())
    .thenApply(resultado -> resultado * 2);
```

👉 Executa tarefas de forma assíncrona
👉 Permite encadeamento de operações

---

### 🔹 ExecutorService

```java
ExecutorService executor = Executors.newFixedThreadPool(4);
```

👉 Gerencia um pool fixo de threads
👉 Evita criação descontrolada de threads

---

## 🏗️ Estrutura do Projeto

```bash
 src/
  └── Main.java
```

---

## 📂 Responsabilidades

* **Main.java**

    * Implementa cálculo de números primos
    * Executa versão single thread
    * Executa versão concorrente com 4 threads
    * Mede tempo de execução
    * Exibe resultado e ganho de performance

---

## ⚙️ Como funciona

1. Define limite de cálculo (1.000.000)
2. Executa soma de primos em:

    * 🔹 Modo sequencial (1 thread)
    * 🔹 Modo paralelo (4 threads)
3. Divide o intervalo em partes iguais
4. Executa cada parte em uma thread
5. Combina os resultados
6. Calcula o ganho de performance

---

## 🔄 Execução concorrente

```java
CompletableFuture<Long> f1 =
    CompletableFuture.supplyAsync(() -> somarPrimosIntervalo(1, passo), executor);
```

👉 Cada `CompletableFuture` executa um pedaço do cálculo

---

## 📊 Exemplo de saída

```text
Resultado: 37550402023
Single Thread: 4000ms
4 Threads: 1100ms
Speedup: 3.5x
```

> ⚠️ Os valores podem variar conforme o hardware

---

## ⚖️ Comparação de performance

| Tipo          | Tempo | Observação          |
| ------------- | ----- | ------------------- |
| Single Thread | Alto  | Execução sequencial |
| 4 Threads     | Baixo | Execução paralela   |
| Speedup       | ~3.5x | Ganho significativo |

---

## 🧠 Conceitos aplicados

* Concorrência com múltiplas threads
* Programação assíncrona com `CompletableFuture`
* Divisão de tarefas (parallel workload)
* Medição de performance com `System.nanoTime()`

---

## ⚠️ Sobre AtomicInteger

Neste projeto **não é necessário** utilizar `AtomicInteger`, pois:

* Cada thread trabalha com dados independentes
* Não há compartilhamento de estado

👉 Evita problemas de concorrência (race conditions)

---

## 🎯 Conclusão

* `CompletableFuture` simplifica programação assíncrona
* Dividir tarefas aumenta performance em CPU-bound
* `ExecutorService` permite controle eficiente de threads
* Paralelismo reduz tempo total, não o trabalho realizado

---

## 🧠 Aprendizados

* Diferença entre execução sequencial e paralela
* Como dividir tarefas para concorrência
* Uso de `CompletableFuture` na prática
* Importância de evitar estado compartilhado

---

## 🚀 Possíveis melhorias

* Utilizar `parallelStream()` para comparação
* Implementar versão com `ForkJoinPool`
* Testar diferentes números de threads
* Aplicar em APIs assíncronas (Spring Boot)
* Adicionar logs de execução

---

## 💡 Autor

Projeto desenvolvido com foco em aprendizado de concorrência, paralelismo e performance em Java.

---
