# Gerenciador de Desafios Pessoais

🚀 Uma API REST para gerenciar desafios pessoais, permitindo a criação, listagem, atualização e conclusão de desafios de forma simples e eficiente.

## 📋 Funcionalidades

✔ Criar desafios personalizados  
✔ Definir prazos e acompanhar o progresso  
✔ Listar desafios pendentes e concluídos  
✔ Atualizar ou excluir desafios  

## 🛠 Tecnologias Utilizadas

- Java 17 + Spring Boot 3  
- Spring Data JPA  
- PostgreSQL  
- Lombok  
- Maven  

## 🚀 Como Executar o Projeto

### Pré-requisitos

Antes de rodar o projeto, certifique-se de ter os seguintes pré-requisitos instalados:

- **Java 17**: [Download Java](https://adoptopenjdk.net/)
- **PostgreSQL**: [Download PostgreSQL](https://www.postgresql.org/download/)
- **Maven**: [Download Maven](https://maven.apache.org/download.cgi)

### 1️⃣ Clonar o Repositório

Clone o repositório usando o comando abaixo:

```bash
git clone https://github.com/seu-usuario/gerenciador-desafios.git
```
2️⃣ Configurar o Banco de Dados
No arquivo src/main/resources/application.properties, adicione as configurações do seu banco de dados PostgreSQL:

properties
Copy
```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/desafios_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

3️⃣ Compilar e Executar
A API estará disponível em:
```bash
http://localhost:8080/
```
🛠 Exemplos de Uso (Endpoints)
Criar um Desafio
POST /desafios
Cria um novo desafio.

Request:

json
Copy
```bash
{
  "titulo": "Ler um livro",
  "descricao": "Ler um livro até o final do mês",
  "dataLimite": "2025-03-30"
}
```
Listar Todos os Desafios
GET /desafios
Retorna a lista de todos os desafios.

Atualizar um Desafio
PUT /desafios/{id}
Atualiza um desafio existente.

Request:
```bash
{
  "titulo": "Ler dois livros",
  "descricao": "Ler dois livros até o final do mês",
  "dataLimite": "2025-03-30"
}
```
Marcar Desafio como Concluído
PUT /desafios/{id}/concluir
Marca o desafio como concluído.

Excluir um Desafio
DELETE /desafios/{id}
Exclui um desafio existente.

📅 Próximos Passos
🔹 Implementar autenticação JWT 🔐
🔹 Adicionar notificações para desafios pendentes 🔔
