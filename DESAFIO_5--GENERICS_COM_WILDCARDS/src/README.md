# 📦 Desafio Java — Generics com Wildcards (`? extends` / `? super`)

## 📌 Objetivo

Este projeto tem como objetivo demonstrar o uso avançado de **Generics com Wildcards em Java**, focando em:

* 🔹 `? extends` (leitura)
* 🔹 `? super` (escrita)
* 🔹 Segurança de tipos (*type safety*) em tempo de compilação
* 🔹 Diferença entre leitura e escrita em estruturas genéricas

---

## 🧠 Conceito Teórico

Generics em Java permitem criar classes e métodos reutilizáveis com tipagem segura.

Exemplo básico:

```java
Caixa<T>
```

Com wildcards:

```java
Caixa<? extends Number>
Caixa<? super Number>
```

👉 Isso define **como o tipo pode ser utilizado**, não apenas qual tipo é.

---

## 🏗️ Estrutura do Projeto

```bash
 src/
 └── main/java/
      └── generics/
           └── Caixa.java
```

---

## 📂 Responsabilidades

* **Caixa.java**

    * Classe genérica para armazenar valores
    * Permite guardar e recuperar dados

* **Main.java**

    * Demonstra o uso de `extends` e `super`
    * Apresenta limitações e permissões de cada abordagem

---

## ⚙️ Como funciona

1. Cria uma classe genérica `Caixa<T>`
2. Utiliza wildcards para restringir comportamento
3. Testa leitura e escrita em diferentes cenários
4. Observa o comportamento em tempo de compilação

---

## 🔍 Exemplos práticos

### 🔹 `? extends Number` (somente leitura)

```java
Caixa<? extends Number> apenasLeitura = new Caixa<Double>();

Number valor = apenasLeitura.pegar(); // ✔ permitido
// apenasLeitura.guardar(10); ❌ erro de compilação
```

👉 Pode ler como `Number`
👉 Não pode escrever (tipo exato desconhecido)

---

### 🔹 `? super Number` (somente escrita)

```java
Caixa<? super Number> caixa = new Caixa<Object>();

caixa.guardar(10);     // ✔ permitido
caixa.guardar(10.5);   // ✔ permitido

Object valor = caixa.pegar(); // ⚠ leitura limitada
```

👉 Pode escrever `Number` e subclasses
👉 Leitura segura apenas como `Object`

---

## 🧠 Regra de ouro (PECS)

```text
Producer → extends
Consumer → super
```

| Tipo        | Uso                     |
| ----------- | ----------------------- |
| `? extends` | Produz dados (leitura)  |
| `? super`   | Consome dados (escrita) |

---

## 📊 Resumo de comportamento

| Tipo        | Pode ler     | Pode escrever |
| ----------- | ------------ | ------------- |
| `? extends` | ✔ (`Number`) | ❌             |
| `? super`   | ⚠ (`Object`) | ✔             |

---

## ⚖️ Comparação com Python

### 🐍 Python

```python
def func(x: Any):
    pass
```

👉 Tipagem flexível, porém sem segurança forte

---

### ☕ Java

```java
Caixa<? extends Number>
```

👉 Tipagem segura e validada em tempo de compilação

---

## 🎯 Conclusão

* Wildcards permitem controle avançado sobre generics
* `extends` e `super` definem contratos de uso
* O uso correto evita erros em runtime
* É um conceito essencial para código robusto em Java

---

## 🧠 Aprendizados

* Diferença entre leitura e escrita em generics
* Uso correto de wildcards
* Aplicação da regra PECS
* Importância de type safety em Java

---

## 🚀 Possíveis melhorias

* Aplicar generics em `List`, `Map` e outras coleções
* Criar métodos genéricos com wildcards
* Integrar com APIs reais (Spring, DTOs, Services)
* Explorar limitações de generics (type erasure)

---

## 💡 Autor

Projeto desenvolvido com foco em aprendizado avançado de Generics e boas práticas em Java.

---
