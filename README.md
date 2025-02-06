# API REST Simples

## 📌 Descrição
Uma API REST simples desenvolvida em Java. Permite utilziar métodos HTTP.

## 🚀 Tecnologias
- java
- spring framework

## 📂 Estrutura Básica do Projeto
```
📦 tarefas
 ┣ 📂com.api.tarefas
 ┃ ┣ 📜 TarefasApplication.java
 ┃ ┣ 📂controller
 ┃ ┃ ┗ 📜 TarefaController.java
 ┃ ┗ 📂model
 ┃ ┃ ┗ 📜 Tarefa.java
```


A API estará disponível em: `http://localhost:8080/tarefas`

## 🔍 Rotas Principais
| Método | Rota         | Descrição                  |
|--------|--------------|----------------------------|
| GET    | `/tarefas`     | Lista todos os itens       |
| POST   | `/tarefas`     | Cria um novo item          |
| PUT    | `/tarefas/:id` | Atualiza um item existente |
| DELETE | `/tarefas/:id` | Remove um item             |

---
👨‍💻 Desenvolvido por [joão Paulo]
