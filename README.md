# 📘 Projeto: Calculadora com Testes Unitários

Este repositório contém a implementação de uma classe `Calculadora` em Java e uma suíte de testes automatizados utilizando JUnit 5. O objetivo é validar o comportamento correto dos métodos implementados e garantir a confiabilidade das operações básicas da calculadora.

---

## 🧪 Testes Unitários

Os testes foram escritos com **JUnit 5** e cobrem os seguintes métodos da classe `Calculadora`:

- `somar(int valor)`
- `subtrair(int valor)`
- `multiplicar(int valor)`
- `dividir(int valor)`
- `exponenciar(int valor)`
- `zerarMemoria()`
- `getMemoria()`

Cada teste verifica se a operação aritmética está funcionando conforme esperado, incluindo casos de exceção e cenários de borda.

---

## ⚠️ Resultados dos Testes

Durante a execução dos testes, foram encontrados **erros em vários métodos** da classe `Calculadora`. Abaixo, alguns exemplos:

### ❌ `subtrair(int valor)`
- **Esperado**: `memoria = 3 - 2 = 1`
- **Obtido**: `memoria = 3`
- **Erro**: O método não realiza subtração; apenas mantém o valor original.

### ❌ `multiplicar(int valor)`
- **Esperado**: `memoria = 3 * 2 = 6`
- **Obtido**: `memoria = 1`
- **Erro**: O método realiza divisão ao invés de multiplicação.

### ⚠️ `dividir(int valor)`
- **Esperado**: `memoria = 3 / 2 = 1.5`
- **Obtido**: `memoria = 1.0`
- **Erro**: O método realiza divisão inteira. Além disso, lança exceção para qualquer valor menor ou igual a 1 (deveria lançar apenas para zero).

### ❌ `exponenciar(int valor)`
- **Esperado (valor = 1)**: `memoria = 3`
- **Obtido**: `memoria = 1995565057`
- **Erro**: O método ignora o expoente passado e eleva a memória a potências fixas.

---

## 📎 Relatório de Erros

O relatório completo com todos os testes, entradas utilizadas e comparações entre resultados esperados e obtidos pode ser acessado no arquivo [`Relatorios.pdf`](src/test/java/com/example/atividade2/Relatorios.pdf).

---

## ✅ Requisitos

- Java 11 ou superior
- JUnit 5
- IDE como IntelliJ IDEA ou Eclipse
- Maven ou Gradle (opcional)

---

## 👨‍💻 Autor

Este projeto foi desenvolvido para fins educacionais e testes com JUnit.

---

