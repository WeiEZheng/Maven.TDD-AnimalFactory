package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    @Before
    public void setupDog(){
        DogHouse.clear();
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    //Given setup
    private String givenName = "DogName";
    private Date givenBirthDate = new Date();
    private Integer givenId = 0;
    private Dog dog = new Dog(givenName,givenBirthDate,givenId);
    private String givenName1 = "DogName1";
    private Date givenBirthDate1 = new Date();
    private Integer givenId1 = 1;
    private Dog dog1 = new Dog(givenName1,givenBirthDate1,givenId1);

    @Test
    public void addDogTest(){
        //When
        DogHouse.add(dog);
        DogHouse.add(dog1);
        Integer numberOfDog = 2;

        //Then
        Assert.assertEquals(dog1, DogHouse.getDogById(1));
        Assert.assertEquals(numberOfDog,DogHouse.getNumberOfDogs());
    }
    @Test
    public void addDogTest1(){
        //When
        DogHouse.add(dog);
        Integer numberOfDog = 1;

        //Then
        Assert.assertEquals(dog, DogHouse.getDogById(0));
        Assert.assertEquals(numberOfDog,DogHouse.getNumberOfDogs());
    }
    @Test
    public void removeDogTest(){
        //Given
        DogHouse.add(dog);

        //When
        DogHouse.remove(dog);
        Integer numberOfDog = 0, actualNumber = DogHouse.getNumberOfDogs();
        Dog actualDog = DogHouse.getDogById(0);

        //Then
        Assert.assertNotEquals(dog,actualDog);
        Assert.assertEquals(numberOfDog,actualNumber);
    }
    @Test
    public void removeDogTest1(){
        //Given
        DogHouse.add(dog1);
        DogHouse.add(dog);

        //When
        DogHouse.remove(dog1);
        Integer numberOfDog = 1,  actualNumber = DogHouse.getNumberOfDogs();
        Dog actualDog = DogHouse.getDogById(1);

        //Then
        Assert.assertNotEquals(dog1,actualDog);
        Assert.assertEquals(numberOfDog,actualNumber);
    }
    @Test
    public void removeIDTest(){
        //Given
        DogHouse.add(dog);
        DogHouse.add(dog1);

        //When
        DogHouse.remove(givenId);
        Integer numberOfDog=1, actualNumber = DogHouse.getNumberOfDogs();
        Dog actualDog = DogHouse.getDogById(0);

        //Then
        Assert.assertNotEquals(dog,actualDog);
        Assert.assertEquals(numberOfDog,actualNumber);
    }
    @Test
    public void removeIDTest1(){
        //Given
        DogHouse.add(dog1);

        //When
        DogHouse.remove(givenId1);
        Integer numberOfDog=0, actualNumber = DogHouse.getNumberOfDogs();
        Dog actualDog = DogHouse.getDogById(1);

        //Then
        Assert.assertNotEquals(dog1,actualDog);
        Assert.assertEquals(numberOfDog,actualNumber);
    }
    @Test
    public void getDogTest(){
        //Given
        DogHouse.add(dog);

        //When
        Dog actual = DogHouse.getDogById(0);

        //Then
        Assert.assertEquals(dog, actual);
    }
    @Test
    public void getDogTest1(){
        //Given
        DogHouse.add(dog1);

        //When
        Dog actual = DogHouse.getDogById(1);

        //Then
        Assert.assertEquals(dog1, actual);
    }
    @Test
    public void getNumberOfDogsTest(){
        //Given
        DogHouse.add(dog);

        //When
        Integer actual=DogHouse.getNumberOfDogs(),
                expected = 1;

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getNumberOfDogTest2(){
        //Given
        DogHouse.add(dog);
        DogHouse.add(dog1);

        //When
        Integer actual=DogHouse.getNumberOfDogs(),
                expected = 2;

        //Then
        Assert.assertEquals(expected,actual);
    }
}
