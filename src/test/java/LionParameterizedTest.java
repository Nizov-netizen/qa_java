import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    String sex;
    boolean hasMane;

    public LionParameterizedTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters()
    public static Object[][] getTextData(){
        return new Object[][]{
                {"Самец",true},
                {"Самка",false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception{
        Lion lion = new Lion(sex, new Feline());
        assertEquals(hasMane, lion.doesHaveMane());

    }

}
