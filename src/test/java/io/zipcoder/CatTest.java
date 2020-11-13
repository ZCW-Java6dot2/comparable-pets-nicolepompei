package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void speakTest() {
        // Given
        Cat testCat = new Cat("");

        // When
        String expected = "meow!";

        // Then
        String actual = testCat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatNameTest() {
        // Given
        String catName = "john";
        Cat testCat = new Cat(catName);

        // When
        String expected = catName;

        // Then
        String actual = testCat.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setCatNameTest() {
        // Given
        Cat testCat = new Cat("");

        // When
        String expected = "jessie";
        testCat.setName(expected);

        // Then
        String actual = testCat.getName();
        Assert.assertEquals(expected, actual);
    }
}
