package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


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
    public void setNameTest() {
        // Given (cat data)
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //set name
        String newName = "tom";
        cat.setName(newName);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newName, retrievedName);
    }

    @Test
    public void speakTest(){
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //speak
        String whatSpeak = "meow!";

        // When (we retrieve data from the cat)
        String retrievedSpeak = cat.speak();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(whatSpeak, whatSpeak);

    }
    @Test
    public void setBirthdateTest(){
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //birthdate
        Date newBirthDate = new Date(02/20/2009);
        cat.setBirthDate(newBirthDate);

        // When (we retrieve data from the cat)
        Date retriveBirthDate = cat.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newBirthDate, retriveBirthDate);
    }

    @Test
    public void eat(){
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        int mealsAEatenAlready = cat.getNumberOfMealsEaten();

        // set meals
        cat.eat(new Food());
        int totalmeals = cat.getNumberOfMealsEaten();

        //match result
        Assert.assertEquals(totalmeals, mealsAEatenAlready+1);
    }

    @Test
    public void getIdTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 12;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //get id
        Integer retrivetId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenId, retrivetId);
    }

    @Test
    public void animalInheritanceTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 21;

        // When (a cat is constructed)
       Cat cat = new Cat("Zula", null, 22);


        Boolean expected =true;

        Boolean actual =  cat instanceof Animal;


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void mammalInheritanceTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 21;

        // When (a cat is constructed)
        Mammal mammal = new Cat(givenName, givenBirthDate, givenId);

        //Use Animal Interface to Retrieve cats id
        //Integer retrievedId  = mammal.getId();

        Boolean expected = true;
        Boolean actual =  mammal instanceof Mammal;

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected,actual);

    }

}
