package io.zipcoder;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Engine {

    private int numPets;
    private int totalPets;
    private String petName;
    private ArrayList<Pet> petInfo = new ArrayList<Pet>();

    public void runEngine() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the pet show! How many pets do you have?\n");
        totalPets = scanner.nextInt();
        scanner.nextLine();

        //  if (totalPets > 0) {
        for (int i = 0; i < totalPets; i++) {

            System.out.println("Please select the type of pet you have:\n"
                    + "\n1: Dog"
                    + "\n2: Cat"
                    + "\n3: Quokka"
                    + "\n4: Quit");

            Integer input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    System.out.println("What's your dog's name?");
                    petName = scanner.next();
                    Dog dog = new Dog(petName);
                    dog.setName(petName);
                    this.petInfo.add(dog);
                    break;

                case 2:
                    System.out.println("What's your cat's name?");
                    petName = scanner.next();
                    petInfo.add(new Cat(petName));
                    break;

                case 3:
                    System.out.println("What's your quokka's name?");
                    petName = scanner.next();
                    petInfo.add(new Quokka(petName));
                    break;
                case 4:
                    System.out.println("Turning off. Goodbye!");
                    break;
                default:
                    System.out.println("Please choose a number from the list.");
            }
        }


        //iterate over arraylist using for each loop. use getter to return name and call speak method
        for (Pet obj : petInfo) {
            System.out.println(obj.getName() + " says " + obj.speak());
        }
        // }

    }
}