# Java Console Profile App

Aplicação simples em Java desenvolvida para capturar e exibir informações de perfil do usuário através do terminal (CLI). O projeto demonstra conceitos fundamentais da linguagem Java, incluindo entrada de dados, métodos, organização de código e gerenciamento automático de recursos com `try-with-resources`.

---

# 📌 Funcionalidades

* Captura de dados do usuário via terminal;
* Exibição formatada de perfil pessoal;
* Entrada de:

  * nome;
  * idade;
  * comida favorita;
  * frase favorita;
* Uso de métodos para separação de responsabilidades;
* Gerenciamento automático do `Scanner`;
* Estrutura simples e didática para aprendizado de Java.

---

# 🛠 Tecnologias Utilizadas

| Tecnologia         | Finalidade                           |
| ------------------ | ------------------------------------ |
| Java               | Linguagem principal                  |
| Scanner            | Entrada de dados no terminal         |
| CLI                | Interface de linha de comando        |
| try-with-resources | Gerenciamento automático de recursos |

---

# 📂 Estrutura do Projeto

```bash id="o6w7b4"
PrintProfile/
 └── src/
      └── PrintProfile.java
```

---

# 🚀 Como Executar o Projeto

## Pré-requisitos

* Java JDK 17+ instalado;
* IDE Java ou terminal configurado.

Sugestões:

* Eclipse;
* IntelliJ IDEA;
* VS Code.

---

## Compilar o Projeto

```bash id="c0kz4t"
javac PrintProfile.java
```

---

## Executar o Projeto

```bash id="t64sy5"
java PrintProfile
```

---

# 💻 Exemplo de Uso

## Entrada

```text id="42j6m2"
Name: Rafael
Age: 25
Favorite food: Pizza
Favorite quote: Never stop learning
```

---

## Saída

```text id="tzg6bo"
--- PROFILE ---
Name: Rafael
Age: 25 years old
Favorite food: Pizza
Favorite quote: "Never stop learning"
```

---

# 🧠 Arquitetura e Decisões Técnicas

O projeto utiliza uma estrutura simples baseada em métodos estáticos, ideal para aplicações pequenas e projetos educacionais.

---

## Separação de Responsabilidades

### Método `main()`

Responsável por:

* iniciar o programa;
* capturar entradas do usuário;
* chamar a lógica principal.

---

### Método `printProfile()`

Responsável exclusivamente pela exibição formatada dos dados.

```java id="s9em8w"
printProfile(name, age, favoriteFood, quote);
```

Essa separação melhora:

* organização;
* reutilização;
* manutenção do código.

---

## Uso de `try-with-resources`

O projeto utiliza:

```java id="9iqwgt"
try (Scanner scanner = new Scanner(System.in))
```

Isso garante:

* fechamento automático do recurso;
* prevenção de vazamento de memória;
* código mais limpo.

---

## Tratamento de Entrada

Após o uso de:

```java id="j9u3nt"
scanner.nextInt();
```

foi necessário consumir a quebra de linha remanescente:

```java id="z9z19v"
scanner.nextLine();
```

Essa prática evita problemas na leitura subsequente de `String`.

---

# ✅ Boas Práticas Aplicadas

## ✔ Organização do Código

Separação clara entre:

* entrada;
* processamento;
* saída.

---

## ✔ Nomes Descritivos

Variáveis e métodos possuem nomes claros e intuitivos.

Exemplo:

```java id="md9yci"
favoriteFood
favoriteQuote
printProfile
```

---

## ✔ Código Legível

* indentação padronizada;
* estrutura simples;
* fácil compreensão para iniciantes.

---

## ✔ Gerenciamento de Recursos

Uso moderno de `try-with-resources`.

---

## ✔ Responsabilidade Única

Cada método possui apenas uma função específica.

---

# 📚 Conceitos Aprendidos

Este projeto ajuda a praticar:

* variáveis;
* métodos;
* parâmetros;
* entrada de dados;
* concatenação de strings;
* organização de código;
* `Scanner`;
* `try-with-resources`;
* boas práticas em Java.

---

# 🔮 Melhorias Futuras

Possíveis evoluções do projeto:

* Validação de idade;
* Tratamento de exceções;
* Permitir múltiplos perfis;
* Persistência em arquivo `.txt`;
* Persistência em banco de dados;
* Interface gráfica com JavaFX;
* Exportação de perfil em JSON;
* Conversão para API REST com Spring Boot.

---

# 🏗 Possível Evolução Arquitetural

Em versões futuras, o projeto pode evoluir para:

```bash id="c6m5cc"
src/
 ├── model/
 ├── service/
 ├── util/
 ├── view/
 └── Main.java
```

Separando:

* entidades;
* lógica;
* interface;
* utilidades.

---

# 👨‍💻 Autor

Rafael Correa de Lima

@correa.pwb

---
