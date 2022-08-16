# Class Task

Create a simple API for pets:

one controller that manages the list of pets;

CRUD operation for Pet;

pet can contain (name, age, type, owner Name) and any other information.

It should follow http Request types e.g. POST for creating pet and GET for showing pet list, PUT for updating pet and DELETE for removing pet

Bonus: 'path variable to send the pet id' to receive single pet information in GET request

# scratch.http file consists of:

DELETE http://localhost:8080/pet-api/pets/1

Accept: application/json

###

PUT http://localhost:8080/pet-api/pets/1

Content-Type: application/json

{
  "petName": "Bella",
  "type": "cat",
  "age": 1,
  "ownerName": "John"
}

###

POST http://localhost:8080/pet-api/pets

Content-Type: application/json

{
  "petID": 1,
  "petName": "Rex",
  "type": "dog",
  "age": 1,
  "ownerName": "Mark"
  }

###

GET http://localhost:8080/pet-api/pets/1

Accept: application/json

###

GET http://localhost:8080/pet-api/pets

Accept: application/json

###
