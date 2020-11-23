package io.zipcoder;

import java.util.ArrayList;

public class PetOwner {
    ArrayList<Pet> listOfPets;
    String petOwnerName;

    public PetOwner(String petOwnerName, ArrayList<Pet> listOfPets){
        this.petOwnerName = petOwnerName;
        this.listOfPets = listOfPets;

    }

    public String getPetOwner() {
        return petOwnerName;
    }

    public void setPetOwner(String petOwnerName){
        this.petOwnerName = petOwnerName;
    }

    public ArrayList<Pet> getListOfPets() {
        return listOfPets;
    }

    public void setListOfPets(ArrayList<Pet> listOfPets){
        this.listOfPets = listOfPets;
    }

    public void sortPetsByName(ArrayList<Pet> listOfPets){

    }
}
