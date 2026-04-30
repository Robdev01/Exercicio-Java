# Desafio Java — Try-with-Resources + Exceção Customizada

## Objetivo

Este projeto tem como objetivo demonstrar boas práticas em Java relacionadas a:

*  Gerenciamento de recursos com `try-with-resources`
*  Criação de exceções customizadas
*  Uso de **checked exceptions**
*  Separação entre erro de sistema e erro de negócio

A proposta simula uma operação bancária simples com registro em arquivo.

---

## Conceito Teórico

###  Try-with-resources

O `try-with-resources` é utilizado para garantir que recursos como arquivos, conexões ou streams sejam fechados automaticamente, evitando vazamentos de memória.

```java
try (BufferedWriter writer = Files.newBufferedWriter(path)) {
    // uso do recurso
}
```

Mesmo em caso de erro, o recurso será fechado automaticamente.

---

### Checked Exception

Em Java, exceções do tipo **checked** obrigam o desenvolvedor a tratá-las ou propagá-las.

```java
public void sacar(double valor) throws ContaInvalidaException
```

Isso aumenta o controle e previsibilidade do código.

---

### Exceção de Negócio

Diferente de erros técnicos (como `IOException`), erros de negócio representam regras da aplicação.

Exemplo:

* Saldo insuficiente para saque

---

##  Estrutura do Projeto

```bash
src/
 └── main/java/
      └── bank/
           ├── Conta.java
           └── ContaInvalidaException.java
```

---

## Responsabilidades

* **Conta.java**

    * Representa a conta bancária
    * Contém regras de negócio (saque e depósito)

* **ContaInvalidaException.java**

    * Exceção customizada para saldo insuficiente

* **Main.java**

    * Executa a simulação
    * Gerencia escrita em arquivo
    * Trata exceções

---

## Como funciona

1. Cria uma conta com saldo inicial
2. Abre um arquivo para registrar transações
3. Executa operações de saque
4. Caso o saldo fique negativo:

    * Lança `ContaInvalidaException`
5. O erro é tratado no `catch`
6. O arquivo é fechado automaticamente

---

## Exemplo de saída (console)

```bash
  Saldo insuficiente para saque!
```

---

## Exemplo de saída (arquivo)

```text
Saldo inicial: 100
Saque de 50 realizado. Saldo: 50
```

---

## Gerenciamento de Recursos

O uso de `try-with-resources` garante:

* ✔ Fechamento automático do arquivo
* ✔ Código mais seguro
* ✔ Menos risco de vazamento de recursos

---

## ️ Comparação com Python

### 🐍 Python

```python
with open("file.txt", "w") as f:
    f.write("...")
```

### ☕ Java

```java
try (BufferedWriter writer = Files.newBufferedWriter(path)) {
    // código
}
```

Ambos gerenciam recursos automaticamente, porém Java possui tipagem mais explícita e controle de exceções mais rígido.

---

## Conclusão

* `try-with-resources` simplifica o gerenciamento de recursos
* Exceções customizadas ajudam a modelar regras de negócio
* Checked exceptions aumentam a segurança do código
* Separar erros técnicos de regras de negócio melhora a arquitetura

---

## Aprendizados

* Diferença entre exceção de sistema e de negócio
* Uso correto de `try-with-resources`
* Criação de exceções customizadas
* Importância do tratamento explícito de erros em Java

---

## Possíveis melhorias

* Implementar logs de erro em arquivo separado
* Criar múltiplas contas e simular transferências
* Adicionar validações adicionais (ex: limite de saque)
* Integrar com banco de dados
* Criar camada de serviço (Service Layer)

---

## Autor

Projeto desenvolvido com foco em aprendizado de boas práticas em Java, tratamento de exceções e gerenciamento de recursos.

---
