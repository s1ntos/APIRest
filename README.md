# API REST 

## 📌 Descrição
Uma API REST desenvolvida em Java. Permite utilziar métodos HTTP.

## 🚀 Tecnologias
- java
- spring framework
- MySQL

## 📂 Estrutura Básica do Projeto
```
📦 tarefas
 ┣ ┗ 📂controller
 ┃ ┃ ┗ 📜 TarefaController.java
 ┃ ┗ 📂model
 ┃ ┃ ┗ 📜 Tarefa.java
 ┃ ┗ 📂repository
 ┃ ┃ ┗ 📜 TarefaRepository.java
 ┃ ┗ 📂service
 ┃ ┃ ┗ 📜 TarefasService.java
 ┃ TarefasApplication.java
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
👨‍💻 Em Desenvolvimento por [joão Paulo]
