package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    //Given setup
    private String givenName1 = "DogName";
    private Date givenBirthDate1 = new Date();
    private Integer givenId1 = 1;
    private String givenName2 = "DogName1";
    private Date givenBirthDate2 = new Date();
    private Integer givenId2 = 2;
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void constructorTest() {
        // When
        Dog dog1 = new Dog(givenName1, givenBirthDate1, givenId1);

        // When
        String actualName = dog1.getName();
        Date actualBirthDate = dog1.getBirthDate();
        Integer actualId = dog1.getId();

        // Then
        Assert.assertEquals(givenName1, actualName);
        Assert.assertEquals(givenBirthDate1, actualBirthDate);
        Assert.assertEquals(givenId1, actualId);
    }
    @Test
    public void constructorTest1() {
        // When
        Dog dog2 = new Dog(givenName2, givenBirthDate2, givenId2);

        // When
        String actualName = dog2.getName();
        Date actualBirthDate = dog2.getBirthDate();
        Integer actualId = dog2.getId();

        // Then
        Assert.assertEquals(givenName2, actualName);
        Assert.assertEquals(givenBirthDate2, actualBirthDate);
        Assert.assertEquals(givenId2, actualId);
    }
    @Test
    public void SpeakTest() {
        // Given
        Dog dog1 = new Dog(givenName1,givenBirthDate1,givenId1);

        //When
        String actualPhrase = dog1.speak();

        //Then
        Assert.assertEquals("bark!",actualPhrase);
    }
    @Test
    public void SpeakTest1() {
        // Given
        Dog dog1 = new Dog(givenName1,givenBirthDate1,givenId1);

        //When
        String actualPhrase = dog1.speak();

        //Then
        Assert.assertEquals("bark!",actualPhrase);
    }
    @Test
    public void setBirthdayTest() {
        // Given
        Dog dog1 = new Dog(givenName1,givenBirthDate1,givenId1);
        Date newBirthdate = new Date(2022,2,1);

        //When
        dog1.setBirthDate(newBirthdate);
        Date actualBirthdate = dog1.getBirthDate();

        //Then
        Assert.assertEquals(newBirthdate,actualBirthdate);
    }
    @Test
    public void setBirthdayTest1() {
        // Given
        Dog dog1 = new Dog(givenName1,givenBirthDate1,givenId1);
        Date newBirthdate = new Date(2022,2,3);

        //When
        dog1.setBirthDate(newBirthdate);
        Date actualBirthdate = dog1.getBirthDate();

        //Then
        Assert.assertEquals(newBirthdate,actualBirthdate);
    }
    @Test
    public void eatTest(){
        // Given
        Dog dog1 = new Dog(givenName1,givenBirthDate1,givenId1);
        Integer numberOfMeals=1;
        Food food=new Food();

        //When
        dog1.eat(food);

        //Then
        Assert.assertEquals(numberOfMeals,dog1.getNumberOfMealsEaten());
    }
    @Test
    public void eatTest1(){
        // Given
        Dog dog1 = new Dog(givenName1,givenBirthDate1,givenId1);
        Integer numberOfMeals=2;
        Food food=new Food();

        //When
        dog1.eat(food);
        dog1.eat(food);

        //Then
        Assert.assertEquals(numberOfMeals,dog1.getNumberOfMealsEaten());
    }
    @Test
    public void getIDTest(){
        //Given
        Dog dog1 = new Dog(givenName1,givenBirthDate1,givenId1);

        //When
        Integer actualID=dog1.getId();

        //Then
        Assert.assertEquals(givenId1,actualID);
    }

    @Test
    public void getIDTest1(){
        //Given
        Dog dog2 = new Dog(givenName2,givenBirthDate2,givenId2);

        //When
        Integer actualID= dog2.getId();

        //Then
        Assert.assertEquals(givenId2,actualID);
    }
    @Test
    public void checkAnimalInheritance(){
        Dog dog1 = new Dog(givenName1,givenBirthDate1,givenId1);
        Assert.assertTrue(dog1 instanceof Animal);
    }
    @Test
    public void checkMammalInheritance(){
        Dog dog1 = new Dog(givenName1,givenBirthDate1,givenId1);
        Assert.assertTrue(dog1 instanceof Mammal);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
