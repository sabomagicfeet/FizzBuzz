public class FizzBuzz {

    public static String of(int i) {
        if(i == 0) {
            return "0";
        } else if( (i % 3 == 0) && (i % 5 == 0) ) {
            return "FizzBuzz";
        } else if(i % 3 == 0) {
            return "Fizz";
        } else if(i % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(i);
    }
}
