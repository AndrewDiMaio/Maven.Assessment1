package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

    private String ownerName;
    private ArrayList<Pet> ownedPets;

    public PetOwner(String name, Pet... pets) { //Constructor setting each pet to owner
        ownerName = name;

        ownedPets = new ArrayList<>(0);

        if(pets != null){  //checks to see if ownedPets ArrayList exists
            for(Pet newPet : pets){ //creates a new list and assigns the pet to its owner
                ownedPets.add(newPet);
                newPet.setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pet.setOwner(this);
        ownedPets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for(int i = 0; i < ownedPets.size(); i++){ //checks each pet in
            if(ownedPets.get(i) == pet){            //if the pet is in the collection
                ownedPets.set(i, null);             //replaces the pet with null
            }                                       //.remove does not work
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return (pet.getOwner() == this);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngestPet = ownedPets.get(0).getAge();
        for(Pet x : ownedPets){
            if(x.getAge() < youngestPet) {
                youngestPet = x.getAge();
            }
        }
        return youngestPet;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldest = ownedPets.get(0).getAge();
        for(Pet x : ownedPets){
            if(x.getAge() > oldest) oldest = x.getAge();
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer s = 0;
        for(Pet x : ownedPets){
            s += x.getAge();
        }
        return (float)s / ownedPets.size();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        Integer count = 0;
        for(Pet x : ownedPets){
            if(x != null) count++;
        }
        return count;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return ownerName;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return ownedPets.toArray(new Pet[0]);
    }
}