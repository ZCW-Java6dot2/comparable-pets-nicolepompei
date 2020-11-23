package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class PetsDisplay {
    private Scanner scanner;

    public PetsDisplay(Scanner scanner){
        this.scanner = scanner;
    }

    public PetOwner createPetOwnerAndPets(){
        System.out.println("Welcome to the Pet Show! What is your name?");
        userResponse();
        String ownerName = scanner.nextLine();
        System.out.println("How many pets do you have?");
        userResponse();
        Integer numberOfPets = scanner.nextInt();
        ArrayList<Pet> listOfPets = createPets(numberOfPets);
        return new PetOwner(ownerName, listOfPets);
    }

    public ArrayList<Pet> createPets(Integer numberOfPets){
        ArrayList<Pet> pet = new ArrayList<Pet>();
        for (int i = 1; i <= numberOfPets; i++) {
            System.out.println("What kind of animal is pet " + i + "? A dog, cat, or quokka?");
            userResponse();
            String typeOfPet = scanner.next();
            if (typeOfPet.toLowerCase().equals("dog")) {
                scanner.nextLine();
                System.out.println("What is the name of the pet?");
            userResponse();
            pet.add(new Dog(scanner.nextLine()));
            } else if(typeOfPet.toLowerCase().equals("cat")) {
                scanner.nextLine();
                System.out.println("What is the name of the pet?");
                userResponse();
                pet.add(new Cat(scanner.nextLine()));
            } else if(typeOfPet.toLowerCase().equals("quokka")) {
                scanner.nextLine();
                System.out.println("What is the name of the pet?");
                userResponse();
                pet.add(new Quokka(scanner.nextLine()));
            } else {
                System.out.println("Invalid response. Please enter the type of pet you have (either a dog, cat, or quokka).");
            }
        }
        return pet;
    }

    public void userResponse(){
        System.out.println("Please enter your response here -->");
    }


    public String petInformation(PetOwner petOwner){
        StringBuilder petInfo = new StringBuilder("Hello " + petOwner.getPetOwner() + " here are all your pets, including their names and what they say when they speak: ");
                for(Pet pet: petOwner.getListOfPets()){
                    petInfo.append("\n").append(pet.getName()).append(" says:").append(pet.speak());

        }
                return petInfo.toString();

    }

}
