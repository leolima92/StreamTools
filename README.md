```md
# 🎥 StreamTools
Um sistema moderno para gestão de criadores de conteúdo, lives e clips — construído com **Java 17 + Spring Boot 3 + JPA + MySQL**.

O objetivo do StreamTools é oferecer uma base sólida para desenvolver ferramentas profissionais voltadas a lives, plataformas de streaming e gerenciamento de conteúdo digital.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
  - Spring Web
  - Spring Data JPA
  - Spring Validation
- **MySQL 8**
- **Hibernate ORM**
- **Lombok**
- **Maven**
- **HikariCP (pool de conexões)**

---

## 🧱 Arquitetura do Projeto

```

src/main/java/com.streamtools
├── domain
│    ├── model
│    │     ├── Account
│    │     ├── User
│    │     ├── LiveEvent
│    │     └── Clip
│    ├── enums
│    └── repository
│
├── web
│    └── controller
│         └── LiveEventController
│
└── StreamtoolsApplication.java

````

A estrutura segue uma organização limpa, separando:
- **domain** → entidades, enums e repositórios  
- **web** → controllers REST  
- **resources** → configs e migrations (caso adicionadas futuramente)

---

## 🗄 Banco de Dados

O StreamTools usa **MySQL**.  
Exemplo de configuração no `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/streamtools
spring.datasource.username=usuario_aqui
spring.datasource.password=senha_aqui
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
````

Ao iniciar o projeto, o Hibernate cria automaticamente as tabelas:

* `accounts`
* `users`
* `live_events`
* `clips`

---

## 📡 Endpoints REST

### 🎬 **Live Events**

| Método | Endpoint     | Descrição            |
| ------ | ------------ | -------------------- |
| GET    | `/api/lives` | Lista todas as lives |
| POST   | `/api/lives` | Cria uma nova live   |

### Exemplo — GET

```
GET http://localhost:8080/api/lives
```

Retorno esperado:

```json
[]
```

### Exemplo — POST

```
POST http://localhost:8080/api/lives
Content-Type: application/json
```

```json
{
  "title": "Primeira Live",
  "description": "Live de teste",
  "platform": "TWITCH",
  "status": "PLANNED",
  "scheduledAt": "2025-01-01T20:00:00"
}
```

---

## ▶️ Como Rodar o Projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/seu-usuario/streamtools.git
```

### 2. Entrar na pasta

```bash
cd streamtools
```

### 3. Rodar com Maven

```bash
mvn spring-boot:run
```

### 4. Acessar a API:

```
http://localhost:8080/api/lives
```

É só pedir!
```
