
http://localhost:8080/h2-console
 

POST: http://localhost:8080/marcas

Body:

{
  "nome": "Toyota"
}


POST: http://localhost:8080/veiculos

Body:

{
  "modelo": "Corolla",
  "cor": "Prata",
  "ano": 2020,
  "quilometragem": 30000,
  "preco": 85000,
  "status": "disponivel",
  "marca": { "id": 1 }
}

GET: http://localhost:8080/veiculos

“Lista todos os veículos”

GET: http://localhost:8080/veiculos/marca/Toyota

“Filtra por marca”

GET: http://localhost:8080/veiculos/ano/2020

“Filtra por ano”

GET: http://localhost:8080/veiculos/status/disponivel

“Filtra por status”


PUT: http://localhost:8080/veiculos

{
  "id": 1,
  "modelo": "Corolla XEI",
  "cor": "Prata",
  "ano": 2020,
  "quilometragem": 30000,
  "preco": 90000,
  "status": "vendido",
  "marca": { "id": 1 }
}

 (DELETE)
http://localhost:8080/veiculos/1

