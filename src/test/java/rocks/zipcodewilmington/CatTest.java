package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    //Given setup
    private String givenName1 = "CatName";
    private Date givenBirthDate1 = new Date();
    private Integer givenId1 = 1;
    private Cat cat1 = new Cat(givenName1,givenBirthDate1,givenId1);
    private String givenName2 = "CatName1";
    private Date givenBirthDate2 = new Date();
    private Integer givenId2 = 2;
    private Cat cat2 = new Cat(givenName2,givenBirthDate2,givenId2);
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest(){
        //Given
        String givenName2 = "ChangedCatName";

        //When
        cat1.setName(givenName2);
        String actualName = cat1.getName();

        // Then
        Assert.assertEquals(givenName2,actualName);
    }
    @Test
    public void setNameTest1(){
        //Given
        String givenName2 = "ChangedCatName1";

        //When
        cat1.setName(givenName2);
        String actualName = cat1.getName();

        // Then
        Assert.assertEquals(givenName2,actualName);
    }
    @Test
    public void SpeakTest() {
        //When
        String actualPhrase = cat1.speak();

        //Then
        Assert.assertEquals("meow!",actualPhrase);
    }
    @Test
    public void SpeakTest1() {
        //When
        String actualPhrase = cat2.speak();

        //Then
        Assert.assertEquals("meow!",actualPhrase);
    }
    @Test
    public void setBirthdayTest() {
        // Given
        Date newBirthdate = new Date(2022,1,1);

        //When
        cat1.setBirthDate(newBirthdate);
        Date actualBirthdate = cat1.getBirthDate();

        //Then
        Assert.assertEquals(newBirthdate,actualBirthdate);
    }
    @Test
    public void setBirthdayTest1() {
        // Given
        Date newBirthdate = new Date(2022,1,3);

        //When
        cat1.setBirthDate(newBirthdate);
        Date actualBirthdate = cat1.getBirthDate();

        //Then
        Assert.assertEquals(newBirthdate,actualBirthdate);
    }
    @Test
    public void eatTest(){
        // Given
        Integer numberOfMeals=1;
        Food food=new Food();

        //When
        cat1.eat(food);

        //Then
        Assert.assertEquals(numberOfMeals,cat1.getNumberOfMealsEaten());
    }
    @Test
    public void eatTest1(){
        // Given
        Integer numberOfMeals=2;
        Food food=new Food();

        //When
        cat1.eat(food);
        cat1.eat(food);

        //Then
        Assert.assertEquals(numberOfMeals,cat1.getNumberOfMealsEaten());
    }
    @Test
    public void getIDTest(){
        //When
        Integer actualID=cat1.getId();

        //Then
        Assert.assertEquals(givenId1,actualID);
    }

    @Test
    public void getIDTest1(){
        //When
        Integer actualID=cat2.getId();

        //Then
        Assert.assertEquals(givenId2,actualID);
    }
    @Test
    public void checkAnimalInheritance(){
        Assert.assertTrue(cat1 instanceof Animal);
    }
    @Test
    public void checkMammalInheritance(){
        Assert.assertTrue(cat1 instanceof Mammal);
    }
}
