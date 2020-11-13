package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class QuokkaTest {
    @Test
    public void speakTest() {
        // Given

        Quokka testQuokka = new Quokka("");

        // When
        String expected = "squeak!";

        // Then
        String actual = testQuokka.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getQuokkaNameTest() {
        // Given
        String quokkaName = "binx";
        Quokka testQuokka = new Quokka(quokkaName);

        // When
        String expected = quokkaName;

        // Then
        String actual = testQuokka.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setQuokkaNameTest() {
        // Given
        Quokka testQuokka = new Quokka("");

        // When
        String expected = "portabella";
        testQuokka.setName(expected);

        // Then
        String actual = testQuokka.getName();
        Assert.assertEquals(expected, actual);
    }
}