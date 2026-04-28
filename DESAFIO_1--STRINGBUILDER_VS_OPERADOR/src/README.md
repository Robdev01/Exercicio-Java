# Desafio Java — StringBuilder vs Operador `+`

## Objetivo

Este projeto tem como objetivo comparar a performance entre duas abordagens de concatenação de strings em Java:

* Uso de `StringBuilder`
* Uso do operador `+`

O foco principal é entender:

*  Imutabilidade de `String`
*  Impacto em performance
*  Diferença de complexidade: **O(n)** vs **O(n²)**

---

## Conceito Teórico

Em Java, objetos do tipo `String` são **imutáveis**.
Isso significa que toda vez que ocorre uma concatenação com `+`, um novo objeto é criado na memória.

Exemplo:

```java
texto = texto + "a";
```

Internamente, isso resulta em:

* criação de um novo objeto
* cópia de todo o conteúdo anterior
* adição do novo valor

Em loops, isso gera um custo elevado (**O(n²)**)

---

Já o `StringBuilder` é **mutável**, permitindo modificações no mesmo objeto:

```java
sb.append("a");
```

Isso evita recriação de objetos e resulta em **O(n)**

---

##  Estrutura do Projeto

```bash
DESAFIO_1--STRINGBUILDER_VS_OPERADOR/
 └── src/
           ├── Main.java
           ├── StringPerformanceTest.java
           └── Resultado.java
```

### Responsabilidades

* **Main.java**

    * Responsável por executar os testes e exibir os resultados

* **StringPerformanceTest.java**

    * Contém a lógica de benchmark

* **Resultado.java**

    * Modelo simples para armazenar o tempo de execução

---

##  Como funciona

1. Executa concatenação de 10.000 strings com `StringBuilder`
2. Mede o tempo com `System.nanoTime()`
3. Executa o mesmo processo com operador `+`
4. Compara os tempos

---

## Exemplo de saída

```bash
StringBuilder: 2ms
Operador +: 300ms
Diferença: 150x mais lento
```

> Os valores podem variar dependendo da máquina

---

## Análise de Performance

| Método          | Complexidade | Comportamento           |
| --------------- | ------------ | ----------------------- |
| `StringBuilder` | O(n)         | Crescimento linear      |
| `+`             | O(n²)        | Crescimento exponencial |

---

## Conclusão

* `StringBuilder` é significativamente mais eficiente em cenários com múltiplas concatenações
* O operador `+` deve ser evitado dentro de loops
* A escolha da estrutura impacta diretamente na performance

---

## Aprendizados

* Importância de entender como a linguagem gerencia memória
* Diferença entre objetos mutáveis e imutáveis
* Como medir performance corretamente
* Organização de código mesmo em projetos simples

---

## Possíveis melhorias

* Implementar testes com:

    * `StringBuffer` (thread-safe)
    * `Streams`
* Utilizar **JMH (Java Microbenchmark Harness)** para medições mais precisas
* Criar interface para padronizar testes

---

##  Autor

Projeto desenvolvido com foco em aprendizado de performance e boas práticas em Java.

---
