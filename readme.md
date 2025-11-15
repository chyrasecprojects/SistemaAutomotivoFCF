Sistema de Gestão de Estoque de Veículos

API REST desenvolvida em Java com Spring Boot e MySQL para gerenciamento de marcas e veículos.

Funcionalidades

Cadastro de marcas

Cadastro de veículos

Listagem geral

Filtros por marca, ano, status e preço

Atualização de dados

Remoção de veículos

API REST seguindo padrão CRUD

Tecnologias Utilizadas

Java 17+

Spring Boot

Spring Data JPA

MySQL

Maven

Lombok

Como Executar:
Clonar o repositório
git clone https://github.com/SEU-USUARIO/veiculos-api.git

2. Criar o banco de dados MySQL
CREATE DATABASE veiculosdb;


Ou utilizar o arquivo schema.sql.

Configurar o arquivo application.properties

Local: src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/veiculosdb
spring.datasource.username=root
spring.datasource.password=123456
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Executar o projeto
mvn spring-boot:run

Endpoints
Marcas
Método	Rota	Descrição
POST	/marcas	Cadastrar marca
GET	/marcas	Listar marcas
Veículos
Método	Rota	Descrição
POST	/veiculos	Cadastrar veículo
GET	/veiculos	Listar veículos
PUT	/veiculos	Atualizar veículo
DELETE	/veiculos/{id}	Remover veículo
GET	/veiculos/marca/{nome}	Filtrar por marca
GET	/veiculos/ano/{ano}	Filtrar por ano
GET	/veiculos/status/{status}	Filtrar por status
GET	/veiculos/preco?min=&max=	Filtrar por faixa de preço
