# Java Employee System

## 📌 Descrição

Projeto simples em **Java (console)** desenvolvido com o objetivo de praticar **Programação Orientada a Objetos**, **listas**, **Streams**, **organização em camadas** e **boas práticas básicas de código**.

O sistema permite o **cadastro e gerenciamento de funcionários**, simulando um pequeno sistema administrativo executado via terminal.



---

## ⚙️ Funcionalidades

* Cadastrar funcionário
* Listar funcionários cadastrados
* Aumentar salário de um funcionário pelo ID
* Validações básicas (ID inexistente, dados inválidos)
* Menu interativo no console

---

## 🧱 Estrutura do Projeto

```text
src/
 ├── application/
 │    └── Program.java        # Classe principal (menu e entrada de dados)
 ├── entities/
 │    └── Employee.java       # Entidade funcionário
 └── services/
      └── EmployeeService.java # Regras de negócio
```

### 📂 application

Responsável por:

* Exibir o menu
* Ler dados do usuário (`Scanner`)
* Chamar os métodos do service

### 📂 entities

Contém a entidade **Employee**, responsável apenas por:

* Atributos
* Construtor
* Getters / Setters
* `toString()`

### 📂 services

Responsável pelas **regras de negócio**, como:

* Armazenar a lista de funcionários
* Buscar funcionário por ID
* Aplicar aumento de salário
* Realizar validações

---

## 🛠️ Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Collections (`List`, `ArrayList`)
* Streams e Lambda Expressions
* Scanner (entrada de dados)

---

## ▶️ Como Executar

1. Clone o repositório
2. Abra o projeto em uma IDE Java (IntelliJ, Eclipse, VS Code)
3. Execute a classe `Program.java`
4. Interaja com o menu pelo terminal

---

## 🎯 Objetivo do Projeto

* Consolidar conceitos de Java básico e intermediário
* Praticar organização de código em camadas
* Simular um sistema real de forma simples

---

## 📚 Aprendizados

Com este projeto foi possível praticar:

* Separação de responsabilidades
* Uso de Streams para busca em listas
* Organização de código além do método `main`
* Estruturação de um projeto Java do zero

---

## 👨‍💻 Autor

Henrique Ribeiro

---
