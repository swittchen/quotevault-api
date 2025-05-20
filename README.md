# QuoteVault API

A simple RESTful API built with Spring Boot and PostgreSQL to manage inspirational quotes.

This project is designed as a learning playground and can be used as a backend service to store, retrieve, and manage quotes. It uses UUIDs as primary keys and supports containerized database deployment via Docker Compose.

---

## 🚀 Features

- Store quotes with author and content
- Retrieve all quotes
- Get a random quote
- Easily extendable (CRUD-ready)
- PostgreSQL with persistent Docker volume
- UUID-based entity IDs

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Docker & Docker Compose
- Maven

---

## 📦 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/swittchen/quotevault-api.git
cd quotevault-api
```

### 2. Start PostgreSQL via Docker Compose

```bash
docker-compose up -d
```

> This will start a PostgreSQL container with the database `quotevault` and initialize it using the `init.sql` file.

### 3. Run the Spring Boot application

You can run the app using your IDE or:

```bash
./mvnw spring-boot:run
```

---

## ⚙️ Configuration

Make sure your `application.properties` contains:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/quotevault
spring.datasource.username=sergei
spring.datasource.password=secret
spring.jpa.hibernate.ddl-auto=update
```

---

## 🔗 API Endpoints (Planned)

| Method | Endpoint         | Description                |
|--------|------------------|----------------------------|
| GET    | `/api/quotes`    | Get all quotes             |
| GET    | `/api/quotes/random` | Get a random quote      |
| POST   | `/api/quotes`    | Add a new quote            |
| PUT    | `/api/quotes/{id}` | Update an existing quote |
| DELETE | `/api/quotes/{id}` | Delete a quote           |

---

## 📂 Project Structure

```
quotevault-api/
├── src/
│   └── main/
│       └── java/com/sergei/quotevault/
│           ├── entity/
│           ├── repository/
│           ├── controller/
│           └── QuoteVaultApplication.java
├── initdb/init.sql
├── docker-compose.yml
└── README.md
```

---

## 📖 License

This project is open source and available under the [MIT License](LICENSE).

---

## 🙌 Contributions

Pull requests are welcome! Feel free to fork this project and improve it.
