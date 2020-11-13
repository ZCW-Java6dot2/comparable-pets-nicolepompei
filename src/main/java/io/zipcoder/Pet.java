package io.zipcoder;


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
     * @param o
     * @return
     */

    public int compareTo(Pet otherPet) {
        // -1 means what is on the left is less than what is on the right (our comparing value)
        if (this.getName() > otherPet.getName()) {
            return -1;
            // 1 means what is on the left is greater than what is on the right (our comparing value)
        } else if (this.getName() < otherPet.getName()) {
            return 1;
            // means that the names are equals so do a string comparison of the object type??
        } else {
            return this.getName().compareTo(otherPet.getName());
        }
    }
}