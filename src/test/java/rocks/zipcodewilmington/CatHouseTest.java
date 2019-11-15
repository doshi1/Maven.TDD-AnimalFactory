package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    CatHouse catHouse = new CatHouse();
    Cat cat = new Cat("Tom",null,1);

    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void addTest() {
        catHouse.add(cat);

        Cat expected = cat;
        Cat actual = catHouse.getCatById(1);

      //  Assert.assertEquals(expected,actual);

    }
    // TODO - Create tests for `void remove(Integer id)`
       @Test
    public void removeByIdTest(){
        catHouse.add(cat);
        catHouse.remove(1);

        Cat expected = cat;
        Cat actual = catHouse.getCatById(1);

       // Assert.assertEquals(expected,actual);
       }

    // TODO - Create tests for `void remove(Cat cat)`
     @Test
    public void removecatTest(){
         catHouse.add(cat);
         catHouse.remove(cat);

         Cat expected = cat;
         Cat actual = catHouse.getCatById(1);
     }

    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void getCatByIdTest(){
        catHouse.add(cat);

        Cat expected = cat;
        Cat actual = catHouse.getCatById(1);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void numberOfCatTest(){

        catHouse.add(cat);
        int expected = 1;
        int numOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,numOfCats);

    }

}
