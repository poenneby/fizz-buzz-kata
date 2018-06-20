import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_generate_100_numbers() {
        String[] fizzBuzzSequence = FizzBuzz.generate();
        assertThat(fizzBuzzSequence.length).isEqualTo(100);
        assertThat(fizzBuzzSequence[0]).isNotNull();
        assertThat(fizzBuzzSequence[99]).isNotNull();
    }

    @Test
    public void should_generate_Fizz_for_multiples_of_3() {
        String[] fizzBuzzSequence = FizzBuzz.generate();
        assertThat(fizzBuzzSequence[2]).isEqualTo("Fizz");
        assertThat(fizzBuzzSequence[5]).isEqualTo("Fizz");
        assertThat(fizzBuzzSequence[8]).isEqualTo("Fizz");
    }

    @Test
    public void should_generate_Buzz_for_multiples_of_5() {
        String[] fizzBuzzSequence = FizzBuzz.generate();
        assertThat(fizzBuzzSequence[4]).isEqualTo("Buzz");
        assertThat(fizzBuzzSequence[9]).isEqualTo("Buzz");
    }

    @Test
    public void should_generate_FizzBuzz_for_multiples_of_3_and_5() {
        String[] fizzBuzzSequence = FizzBuzz.generate();
        assertThat(fizzBuzzSequence[14]).isEqualTo("FizzBuzz");
    }
}
