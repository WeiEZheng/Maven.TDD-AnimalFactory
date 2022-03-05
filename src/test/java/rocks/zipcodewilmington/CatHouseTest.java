package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    //Given setup
    private String givenName = "CatName";
    private Date givenBirthDate = new Date();
    private Integer givenId = 0;
    private Cat cat = new Cat(givenName,givenBirthDate,givenId);
    private String givenName1 = "CatName1";
    private Date givenBirthDate1 = new Date();
    private Integer givenId1 = 1;
    private Cat cat1 = new Cat(givenName1,givenBirthDate1,givenId1);

    @Before
    public void setupCat(){
        CatHouse.clear();
    }

    @Test
    public void addCatTest(){
        //When
        CatHouse.add(cat);
        CatHouse.add(cat1);
        Integer numberOfCat = 2;

        //Then
        Assert.assertEquals(cat1, CatHouse.getCatById(1));
        Assert.assertEquals(numberOfCat,CatHouse.getNumberOfCats());
    }
    @Test
    public void addCatTest1(){
        //When
        CatHouse.add(cat);
        Integer numberOfCat = 1;

        //Then
        Assert.assertEquals(cat, CatHouse.getCatById(0));
        Assert.assertEquals(numberOfCat,CatHouse.getNumberOfCats());
    }
    @Test
    public void removeCatTest(){
        //Given
        CatHouse.add(cat);

        //When
        CatHouse.remove(cat);
        Integer numberOfCat = 0, actualNumber = CatHouse.getNumberOfCats();
        Cat actualCat = CatHouse.getCatById(0);

        //Then
        Assert.assertNotEquals(cat,actualCat);
        Assert.assertEquals(numberOfCat,actualNumber);
    }
    @Test
    public void removeCatTest1(){
        //Given
        CatHouse.add(cat1);

        //When
        CatHouse.remove(cat1);
        Integer numberOfCat = 0,  actualNumber = CatHouse.getNumberOfCats();
        Cat actualCat = CatHouse.getCatById(1);

        //Then
        Assert.assertNotEquals(cat1,actualCat);
        Assert.assertEquals(numberOfCat,actualNumber);
    }
    @Test
    public void removeIDTest(){
        //Given
        CatHouse.add(cat);

        //When
        CatHouse.remove(givenId);
        Integer numberOfCat=0, actualNumber = CatHouse.getNumberOfCats();
        Cat actualCat = CatHouse.getCatById(0);

        //Then
        Assert.assertNotEquals(cat,actualCat);
        Assert.assertEquals(numberOfCat,actualNumber);
    }
    @Test
    public void removeIDTest1(){
        //Given
        CatHouse.add(cat1);

        //When
        CatHouse.remove(givenId1);
        Integer numberOfCat=0, actualNumber = CatHouse.getNumberOfCats();
        Cat actualCat = CatHouse.getCatById(1);

        //Then
        Assert.assertNotEquals(cat1,actualCat);
        Assert.assertEquals(numberOfCat,actualNumber);
    }
    @Test
    public void getCatTest(){
        //Given
        CatHouse.add(cat);

        //When
        Cat actual = CatHouse.getCatById(0);

        //Then
        Assert.assertEquals(cat, actual);
    }
    @Test
    public void getCatTest1(){
        //Given
        CatHouse.add(cat1);

        //When
        Cat actual = CatHouse.getCatById(1);

        //Then
        Assert.assertEquals(cat1, actual);
    }
    @Test
    public void getNumberOfCatsTest(){
        //Given
        CatHouse.add(cat);

        //When
        Integer actual=CatHouse.getNumberOfCats(),
            expected = 1;

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getNumberOfCatsTest2(){
        //Given
        CatHouse.add(cat);
        CatHouse.add(cat1);

        //When
        Integer actual=CatHouse.getNumberOfCats(),
                expected = 2;

        //Then
        Assert.assertEquals(expected,actual);
    }
}
