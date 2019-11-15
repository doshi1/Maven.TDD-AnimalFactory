package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
   private Dog  dog;
  @Before
  public void setup() {
      String givenName = "Milo";
      Date givenBirthDate = new Date();
      Integer givenId = 1;
      dog = new Dog("Milo", null, 1);
  }


  @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
      //  Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void constructorTest() {
        // Given (a name exists and a dog exists)
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 1;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest(){
        // Given (a name exists and a dog exists)
        String expectedSpeak = "bark!";

        // When (a dog's name is set to the given name)
        String retriveDogSpeak =  dog.speak();

        Assert.assertEquals(expectedSpeak, retriveDogSpeak);
        }

    @Test
    public void setBirthDate(){
     // set birthday
      Date newDate =  new  Date();
      dog.setBirthDate(newDate);

      // When (we retrieve data from the cat)
        Date retriveBirthDate = dog.getBirthDate();

      // then
        Assert.assertEquals(newDate,retriveBirthDate);
    }

    @Test
    public  void eatTest(){
        int mealsEaten = dog.getNumberOfMealsEaten();

      // set meals
        dog.eat(new Food());
        int totalmealsEaten = dog.getNumberOfMealsEaten();

        // match result
        Assert.assertEquals(mealsEaten + 1,totalmealsEaten);
    }

    @Test
    public  void  getIDTest(){
      // when
      Integer newId = dog.getId();
        Integer givenId = 1;
      //then
        Assert.assertEquals(newId, givenId);
    }

    @Test
    public void instanceofAnimal(){
      Boolean expected = true;
      Boolean actual = dog instanceof Animal;

      // match
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void instanceofMammal(){
      Boolean expected = true;
      boolean actual = dog instanceof Mammal;

      Assert.assertEquals(actual,expected);

    }
}

