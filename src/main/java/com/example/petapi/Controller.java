package com.example.petapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {

    private ArrayList<Pet> pets = new ArrayList<>();

    @GetMapping("/pet-api/pets")
    public ArrayList<Pet> getPets(){
        return pets;
    }

    @PostMapping("/pet-api/pets")
    public Pet createPet(@RequestBody() Pet petRequest){
        Pet pet = new Pet(
                petRequest.getPetID(),
                petRequest.getPetName(),
                petRequest.getType(),
                petRequest.getAge(),
                petRequest.getOwnerName()
        );

        this.pets.add(pet);

        return pet;
    }

    @GetMapping("/pet-api/pets/{petID}")
    public Pet getOnePet(@PathVariable int petID){

        for (Pet pet : pets){
            if(pet.getPetID() == petID){
                return pet;
            }
        }
        return null;

    }

    @PutMapping("/pet-api/pets/{petID}")
    public ArrayList<Pet> updatePet(@RequestBody Pet petUpdate, @PathVariable int petID) {

        for (Pet pet : pets) {
            if (pet.getPetID() == petID) {
                pet.setPetName(petUpdate.getPetName());
                pet.setType(petUpdate.getType());
                pet.setAge(petUpdate.getAge());
                pet.setOwnerName(petUpdate.getOwnerName());
            }
        }

        return pets;

    }

    @DeleteMapping("/pet-api/pets/{petID}")
    public ArrayList<Pet> removePet(@PathVariable int petID){

        for (Pet pet : pets){
            if(pet.getPetID() == petID){
                this.pets.remove(pet);
            }
        }

        return pets;
    }

}
