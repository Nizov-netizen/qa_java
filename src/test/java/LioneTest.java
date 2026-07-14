import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class LioneTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest()throws Exception{
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(3);
        int expectedKittensCount = 3;
        int actualKittensCount = lion.getKittens();
        assertEquals("Неправильное количество львят",expectedKittensCount,actualKittensCount);
    }

    @Test
    public void getFoodTest()throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        assertEquals("Неправильное питание",expectedFood,actualFood);
    }

    @Test
    public void lionConstructorWithInvalidSexTest() {
        try {
            new Lion("Неизвестно", feline);
            fail("Должно быть выброшено исключение");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка",
                    e.getMessage());
        }
    }
}
