public class FizzBuzz {

    public static String of(int i) {
        if(i % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(i);
    }
}
