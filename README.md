# E-commerce API

API REST desenvolvida com Spring Boot para gerenciamento de produtos de um e-commerce.

## 🚀 Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Lombok
* Jakarta Validation

## 📋 Funcionalidades

* Cadastro de produtos
* Listagem de todos os produtos
* Busca de produto por ID
* Atualização de produtos
* Remoção de produtos
* Busca de produtos por categoria
* Validação de dados de entrada
* Tratamento global de exceções

## 🏗️ Estrutura do Projeto

```text
controller
├── ProdutoController

service
├── ProdutoService

repository
├── ProdutoRepository

entity
├── Produto

dto
├── ProdutoRequestDTO
└── ProdutoResponseDTO

exception
├── ErrorResponse
└── GlobalExceptionHandler
```

## 📌 Endpoints

### Criar produto

```http
POST /produtos
```

### Listar todos os produtos

```http
GET /produtos
```

### Buscar produto por ID

```http
GET /produtos/{id}
```

### Atualizar produto

```http
PUT /produtos/{id}
```

### Remover produto

```http
DELETE /produtos/{id}
```

### Buscar produtos por categoria

```http
GET /produtos/categoria/{categoria}
```

## 📦 Exemplo de Requisição

```json
{
  "nome": "Mouse Gamer G502",
  "marca": "Logitech",
  "preco": 249.90,
  "descricao": "Mouse gamer com sensor de alta precisão",
  "estoque": 15,
  "categoria": "Mouse"
}
```

## ⚙️ Configuração do Banco de Dados

Crie um banco MySQL chamado:

```sql
CREATE DATABASE ecommerce;
```

Configure o arquivo `application.properties` conforme o seu ambiente:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=root
spring.datasource.password=
```

## 🧪 Validações Implementadas

* Nome obrigatório
* Marca obrigatória
* Categoria obrigatória
* Preço deve ser positivo
* Estoque não pode ser negativo
* Descrição limitada a 500 caracteres

## 📚 Conceitos Aplicados

* API REST
* Arquitetura em camadas (Controller, Service e Repository)
* DTOs para entrada e saída de dados
* Validação de requisições
* Tratamento global de exceções
* Persistência de dados com Spring Data JPA
* Conversão de entidades para DTOs utilizando Streams

## 👨‍💻 Autor

André Rodrigues

Projeto desenvolvido para estudos de Java, Spring Boot e APIs REST.
