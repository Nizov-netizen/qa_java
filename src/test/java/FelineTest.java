import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals("Неправильное питание",expectedFood,actualFood);
    }

    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals("Неправильное семейство", expectedFamily, actualFamily);
    }

    @Test
    public void getKittensTest(){
        Feline feline = new Feline();
        int expectedKittens = 1 ;
        int actualKittens = feline.getKittens();
        assertEquals("Неправильное количество кошачьих",expectedKittens,actualKittens);
    }

    @Test
    public void getKittensWithCountTest(){
        Feline feline = new Feline();
        int expectedKittensCount = 5;
        int actualKittensCount = feline.getKittens(5);
        assertEquals("Неправильное количество кошачьих",expectedKittensCount,actualKittensCount);
    }
}
