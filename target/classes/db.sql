CREATE DATABASE IF NOT EXISTS veiculosdb;
USE veiculosdb;

CREATE TABLE IF NOT EXISTS marca (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS veiculo (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    modelo VARCHAR(100) NOT NULL,
    ano INT NOT NULL,
    cor VARCHAR(50),
    preco DOUBLE NOT NULL,
    quilometragem INT,
    status VARCHAR(50),
    marca_id BIGINT,
    FOREIGN KEY (marca_id) REFERENCES marca(id)
);
