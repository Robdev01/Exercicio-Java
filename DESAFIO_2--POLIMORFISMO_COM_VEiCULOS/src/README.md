# Desafio Java — Polimorfismo com Veículos

## Objetivo

Este projeto tem como objetivo aplicar conceitos fundamentais de Programação Orientada a Objetos (POO) em Java:

*  Herança
*  Polimorfismo
*  Encapsulamento
*  Ordenação com `Comparable`

A proposta consiste em simular uma corrida entre diferentes tipos de veículos, cada um com seu próprio comportamento de aceleração.

---

## Conceito Teórico

A ideia central é utilizar **polimorfismo**, permitindo que diferentes classes respondam ao mesmo método de maneiras distintas.

Exemplo:

```java
Veiculo v = new Moto();
v.acelerar(100);
```

Mesmo tipo (`Veiculo`)
Comportamento diferente (`Moto` acelera mais rápido)

---

##  ️Estrutura do Projeto

```bash
src/
 └── src/main/
      └── veiculos/
           ├── Veiculo.java
           ├── Carro.java
           └── Moto.java
```

---

##  Responsabilidades

* **Veiculo.java**

    * Classe abstrata base
    * Define comportamento comum
    * Implementa `Comparable` para ordenação

* **Carro.java**

    * Possui 4 rodas
    * Aceleração com fator **0.9x**

* **Moto.java**

    * Possui 2 rodas
    * Aceleração com fator **1.2x**

* **Main.java**

    * Simula a corrida
    * Executa aceleração
    * Ordena veículos por velocidade

---

##  Como funciona

1. Cria uma lista de veículos (`List<Veiculo>`)
2. Adiciona carros e motos
3. Cada veículo acelera com base em sua regra
4. A lista é ordenada por velocidade
5. O resultado da corrida é exibido

---

## Exemplo de saída

```bash
Resultado da corrida:
Carro - Velocidade: 90
Carro - Velocidade: 90
Moto - Velocidade: 120
Moto - Velocidade: 120
```

---

##  Regras de Negócio

| Veículo | Rodas | Fator de aceleração |
| ------- | ----- | ------------------- |
| Carro   | 4     | 0.9x                |
| Moto    | 2     | 1.2x                |

---

## Encapsulamento

* A propriedade `velocidade` é `private`
* Acesso via `getter`
* Modificação controlada via `protected`

---

## Polimorfismo na prática

```java
for (Veiculo v : corrida) {
    v.acelerar(100);
}
```
 
O mesmo código funciona para todos os tipos de veículos
Cada um executa sua própria lógica

---

##  Ordenação com Comparable

A classe `Veiculo` implementa:

```java
@Override
public int compareTo(Veiculo outro) {
    return Integer.compare(this.getVelocidade(), outro.getVelocidade());
}
```

Permite ordenar a lista automaticamente com:

```java
Collections.sort(corrida);
```

---

## Conclusão

* Polimorfismo permite escrever código genérico e escalável
* Encapsulamento protege o estado interno dos objetos
* `Comparable` facilita ordenação baseada em regras de negócio
* A estrutura utilizada segue boas práticas de organização

---

## Aprendizados

* Diferença entre classe abstrata e implementação concreta
* Como aplicar polimorfismo em cenários reais
* Uso correto de encapsulamento (`private`, `protected`, `getter`)
* Implementação de ordenação customizada

---

## Possíveis melhorias

* Adicionar novos tipos de veículos (Caminhão, Bicicleta, etc.)
* Implementar sistema de voltas na corrida
* Criar ranking com posições (1º, 2º, 3º)
* Aplicar padrões de projeto como **Strategy Pattern**
* Adicionar testes automatizados

---

## Autor

Projeto desenvolvido com foco em aprendizado de Programação Orientada a Objetos em Java e boas práticas de arquitetura.

---
