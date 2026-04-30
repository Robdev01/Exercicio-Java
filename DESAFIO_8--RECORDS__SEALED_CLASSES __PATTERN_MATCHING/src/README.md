# 🧩 Desafio Java — Records + Sealed Classes + Pattern Matching

## 📌 Objetivo

Este projeto tem como objetivo demonstrar recursos modernos do Java (versão 17+) aplicados à modelagem de dados e lógica de decisão:

* 🔹 `record` (dados imutáveis)
* 🔹 `sealed classes` (controle de herança)
* 🔹 `pattern matching` com `switch`
* 🔹 Código mais conciso, seguro e expressivo

A proposta consiste em calcular a área de diferentes formas geométricas de maneira elegante e tipada.

---

## 🧠 Conceito Teórico

### 🔹 Records

`record` é uma forma simplificada de criar classes imutáveis.

```java
record Circulo(double raio) {}
```

👉 Gera automaticamente:

* construtor
* getters (`raio()`)
* `equals`, `hashCode`, `toString`

---

### 🔹 Sealed Classes

Permitem restringir quais classes podem implementar uma interface.

```java
sealed interface Forma permits Circulo, Retangulo {}
```

👉 Evita implementações inesperadas
👉 Garante segurança em tempo de compilação

---

### 🔹 Pattern Matching com switch

```java
switch (forma) {
    case Circulo c -> ...
    case Retangulo r -> ...
}
```

👉 Elimina necessidade de `instanceof` + cast
👉 Código mais limpo e legível

---

## 🏗️ Estrutura do Projeto

```bash
src/
 └── main/java/
      └── sealed/
           ├── Forma.java
           ├── Circulo.java
           └── Retangulo.java
```

---

## 📂 Responsabilidades

* **Forma.java**

    * Interface selada que define o contrato das formas

* **Circulo.java**

    * Representa um círculo (record)
    * Contém o raio

* **Retangulo.java**

    * Representa um retângulo (record)
    * Contém largura e altura

* **Main.java**

    * Executa o programa
    * Calcula área com `switch` e pattern matching
    * Exibe resultados formatados

---

## ⚙️ Como funciona

1. Cria uma lista de formas (`List<Forma>`)
2. Para cada forma:

    * Identifica o tipo com `switch`
    * Calcula a área
3. Exibe os dados formatados no console

---

## 🔄 Cálculo com Pattern Matching

```java
return switch (forma) {
    case Circulo c -> Math.PI * c.raio() * c.raio();
    case Retangulo r -> r.largura() * r.altura();
};
```

---

## 📊 Exemplo de saída

```text
═══════════════════════
CIRCULO
raio=2.0
Área: 12.57

═══════════════════════
RETANGULO
largura=3.0, altura=4.0
Área: 12.00
```

---

## 🔍 Conceitos aplicados

| Recurso                   | Função                            |
| ------------------------- | --------------------------------- |
| `record`                  | Imutabilidade e menos boilerplate |
| `sealed`                  | Controle de herança               |
| `switch pattern matching` | Decisão por tipo                  |
| `List`                    | Coleção de objetos polimórficos   |

---

## ⚖️ Comparação com Java tradicional

### ❌ Antigo

```java
if (forma instanceof Circulo) {
    Circulo c = (Circulo) forma;
}
```

---

### ✅ Moderno

```java
case Circulo c ->
```

👉 Mais limpo
👉 Mais seguro
👉 Mais expressivo

---

## 🐍 Comparação com Python

### Python

```python
from dataclasses import dataclass
```

👉 Similar ao `record`

---

### Java

👉 Tipagem mais forte
👉 Controle de domínio mais rigoroso
👉 Melhor para sistemas complexos

---

## 🎯 Conclusão

* `record` reduz código boilerplate
* `sealed` aumenta segurança do domínio
* Pattern matching simplifica lógica condicional
* Java moderno se aproxima de linguagens funcionais

---

## 🧠 Aprendizados

* Uso prático de recursos do Java 17+
* Como modelar domínio de forma segura
* Diferença entre abordagem tradicional e moderna
* Escrita de código mais limpo e declarativo

---

## 🚀 Possíveis melhorias

* Adicionar novas formas (Triângulo, Quadrado, etc.)
* Criar interface com método `area()` (polimorfismo clássico)
* Integrar com API REST (Spring Boot)
* Converter saída para JSON
* Criar interface gráfica

---

## 💡 Autor

Projeto desenvolvido com foco em aprendizado de recursos modernos do Java e boas práticas de modelagem de domínio.

---
