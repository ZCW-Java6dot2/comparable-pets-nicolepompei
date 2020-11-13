package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void speakTest() {
        // Given
        Dog testDog = new Dog("");

        // When
        String expected = "bark!";

        // Then
        String actual = testDog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogNameTest() {
        // Given
        String dogName = "georgie";
        Dog testDog = new Dog(dogName);

        // When
        String expected = dogName;

        // Then
        String actual = testDog.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setDogNameTest() {
        // Given
        Dog testDog = new Dog("");

        // When
        String expected = "zoey";
        testDog.setName(expected);

        // Then
        String actual = testDog.getName();
        Assert.assertEquals(expected, actual);
    }
}