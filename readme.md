Sistema de Gestão de Estoque de Veículos

Projeto desenvolvido em Java utilizando Spring Boot e MySQL, seguindo arquitetura em camadas (controller, service, repository e model). O sistema permite a gestão de marcas e veículos, incluindo cadastro, consulta, atualização e remoção.

Estrutura do Projeto
src/main/java/com/exemplo/veiculos
 ├── controller
 ├── model
 ├── repository
 ├── service
 └── VeiculosApiApplication.java


model: contém as entidades Marca e Veiculo.

repository: interfaces que acessam o banco utilizando Spring Data JPA.

service: camada com regras de negócio e chamadas ao repository.

controller: expõe as operações CRUD através de endpoints REST.

application.properties: configurações de conexão com o MySQL.

Tecnologias Utilizadas

Java 17

Spring Boot

Spring Web

Spring Data JPA

MySQL

Maven

Lombok

Banco de Dados

O banco utiliza duas tabelas principais: marca e veiculo, relacionadas por chave estrangeira.
O script completo está no arquivo schema.sql.

Executando o Projeto

Criar o banco veiculosdb.

Configurar usuário e senha no application.properties.

Executar com:

mvn spring-boot:run

Código Fonte

O código completo das classes, controllers, serviços e repositórios está disponível na pasta src/main/java.
