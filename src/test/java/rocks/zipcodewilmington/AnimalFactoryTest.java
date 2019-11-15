package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
//TODO - Create Test for `Animal createDog(String name, Date birthDate)`
//TODO - Create Test for `Animal createCat(String name, Date birthDate)`


public class AnimalFactoryTest {

    @Test
    public void testCreateDog(){
       // AnimalFactory miralsFactory = new AnimalFactory();

        String expectedName = "tommy";
        Date expectedBirthDate = new Date();

        // when dog constructed
        Dog tommy =  AnimalFactory.createDog(expectedName, expectedBirthDate);

        // retrieve data from cat
        String getNameResult = tommy.getName();
        Date getBirthDateResult = tommy.getBirthDate();

        // match expected data to given data

        Assert.assertEquals(expectedName, getNameResult);
        Assert.assertEquals(expectedBirthDate, getBirthDateResult);
    }

    @Test
    public void testCreateCat(){
        // AnimalFactory miralsFactory = new AnimalFactory();

        String expectedName = "Yoda";
        Date expectedBirthDate = new Date();

        // when dog constructed
        Cat yoda =  AnimalFactory.createCat(expectedName, expectedBirthDate);

        // retrieve data from cat
        String getNameResult = yoda.getName();
        Date getBirthDateResult = yoda.getBirthDate();

        // match expected data to given data

        Assert.assertEquals(expectedName, getNameResult);
        Assert.assertEquals(expectedBirthDate, getBirthDateResult);
    }

}
