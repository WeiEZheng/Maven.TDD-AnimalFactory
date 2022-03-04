package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        String givenName = "Dog";
        Date givenBirthDate = new Date();
        Dog dog = AnimalFactory.createDog(givenName,givenBirthDate);

        // When
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();

        // Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }
    @Test
    public void createCatTest(){
        String givenName = "Cat";
        Date givenBirthDate = new Date();
        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);
        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }
}
