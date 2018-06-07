public class FizzBuzz {
    public static String[] generate() {
        String[] fizzBuzzSequence = new String[100];
        for (int i = 0; i < 100; i++) {
            int number = i + 1;
            fizzBuzzSequence[i] = "";
            if (number % 3 == 0) {
                fizzBuzzSequence[i] = "Fizz";
            }
            if (number % 5 == 0) {
                fizzBuzzSequence[i] += "Buzz";
            }
            if (fizzBuzzSequence[i].isEmpty()) {
                fizzBuzzSequence[i] = "" + number;
            }
        }
        return fizzBuzzSequence;
    }
}
