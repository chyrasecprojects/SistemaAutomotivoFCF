Sistema de Gestão de Estoque de Veículos

Tecnologias Utilizadas

Java 17+

Spring Boot

Spring Web

Spring Data JPA

H2 Database

Maven

Como Executar o Projeto

Instale o Java 17 ou superior.

Instale o Maven ou utilize o Maven embutido no VS Code.

Clone ou baixe o projeto.

No terminal, execute:

mvn spring-boot:run


Ou pelo VS Code:
Run > Run Without Debugging.

O servidor iniciará em:

http://localhost:8080

Banco de Dados (H2)

O projeto usa o banco em memória H2, já configurado no application.properties.

Acesse o console:

http://localhost:8080/h2-console


Configuração padrão:

JDBC URL: jdbc:h2:mem:concessionaria

User: SA

Password: (vazia)

As tabelas são geradas automaticamente.

Estrutura do Código

model/ – Contém as entidades Veiculo e Marca

repository/ – Interfaces JPA para acesso ao banco

controller/ – Endpoints REST para gerenciamento dos veículos

service/ – Regra de negócio básica

application.properties – Configurações de H2 e JPA

VeiculosApiApplication – Classe principal

Funcionalidades Implementadas

Cadastro de veículos

Cadastro de marcas

Consulta geral e filtrada

Atualização de dados

Remoção de veículos

MySQL:

CREATE DATABASE concessionaria;
USE concessionaria;

CREATE TABLE marca (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255)
);

CREATE TABLE veiculo (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    modelo VARCHAR(255),
    ano INT NOT NULL,
    cor VARCHAR(255),
    preco DOUBLE NOT NULL,
    quilometragem INT NOT NULL,
    status VARCHAR(255),
    marca_id BIGINT,
    FOREIGN KEY (marca_id) REFERENCES marca(id)
);
