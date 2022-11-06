import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void test_of_0is0() {

        String expected = "0";
        String actual = FizzBuzz.of(0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_of_1is1() {
        String expected = "1";
        String actual = FizzBuzz.of(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_of_3isFizz() {
        String expected = "Fizz";
        String actual = FizzBuzz.of(3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_of_5isBuzz() {
        String expected = "Buzz";
        String actual = FizzBuzz.of(5);

        Assertions.assertEquals(expected, actual);
    }

}
