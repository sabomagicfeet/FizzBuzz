public class FizzBuzz {

    public static String of(int i) {
        String fizzBuzzResult = "";

        if(i == 0) {
            fizzBuzzResult = "0";
        } else if( (i % 3 == 0) && (i % 5 == 0) ) {
            fizzBuzzResult = "FizzBuzz";
        } else if(i % 3 == 0) {
            fizzBuzzResult =  "Fizz";
        } else if(i % 5 == 0) {
            fizzBuzzResult = "Buzz";
        } else {
            fizzBuzzResult = String.valueOf(i);
        }

        return fizzBuzzResult;
    }
}
