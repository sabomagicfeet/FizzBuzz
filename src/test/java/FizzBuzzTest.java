import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void test_of_0is0() {

        int expected = 0;
        int actual = FizzBuzz.of(0);

        Assertions.assertEquals(expected, actual);
    }


}
