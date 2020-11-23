package io.zipcoder;
import java.lang.Comparable;
import java.util.Comparator;

public class Pet implements Comparable<Pet> {
    String name;

    public Pet(String name) {
        this.name = name;
    }


    public String speak() {
        return "";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * NOTES ON COMPARABLE / COMPARE TO
     * To sort an object by a property the Object must implement the Comparable interface and override the compareTo() method. The comparable interface is ONLY
     * allowed to sort a single property.
     * A comparable object is capable of comparing itself with another object. The class itself must implement the java.lang.Comparable interface to compare
     * its instances. When comparing strings there are 3 possible outcomes:
     * <p>
     * <p>
     * 1.) Int of 0 which means the strings are equal.
     * 2.) Int of -1 which means string on the left is greater lexigraphically than whats on the right (comparing value)
     * 3.) Int of 1 means whats on the left is smaller lexigraphically than whats on the right (comparing value)
     * <p>
     * in THIS compareTo fn: compared the current instance of the object's name to previous (left) or next (right). see comments in method.
     *
     * In this method I compared the current instance of the objects name to the previous(or next instance of the object..
     *  * code for compareTo does that). if it's 0 it falls through to the second return statement. if returns 1 or -1 then
     *  * it returns that value. Second return statement sorts it by speak.
     *
     *
     * @param otherPet
     * @return
     */

    @Override
    public int compareTo(Pet otherPet) {
        int equality = this.name.compareTo(otherPet.name);
        if (equality != 0) {
            return equality;
        } else {
            return this.getName().compareTo(otherPet.getName());
        }
    }

    @Override
    public String toString(){
        return "Pet name = " + name + "\n";

    }

//implemented comparator as the obj comparator NOT the interface. instantiated a new comparator object to ONLY override the compare method.
    //
    public static Comparator<Pet> PetTypeComparator = new Comparator<Pet>() {
        @Override
        public int compare(Pet pet1, Pet pet2) {
            int equality = pet1.getClass().getSimpleName().compareTo(pet2.getClass().getSimpleName());
            if (equality != 0) {
                return equality;
            } else {return pet1.getName().compareTo(pet2.getName());}
    }
};}