import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {
    @Test
    public void should_convert_numbers_to_strings() throws Exception {
        assertThat(Converter.convert(1)).isEqualTo("1");
        assertThat(Converter.convert(2)).isEqualTo("2");
    }

    @Test
    public void should_convert_multiples_of_3_into_Fizz() throws Exception {
        assertThat(Converter.convert(3)).isEqualTo("Fizz");
        assertThat(Converter.convert(6)).isEqualTo("Fizz");
    }

    @Test
    public void should_convert_multiples_of_5_into_Buzz() throws Exception {
        assertThat(Converter.convert(5)).isEqualTo("Buzz");
        assertThat(Converter.convert(10)).isEqualTo("Buzz");
    }

    @Test
    public void should_convert_multiples_of_both_3_and_5_to_FizzBuzz() throws Exception {
        assertThat(Converter.convert(15)).isEqualTo("FizzBuzz");
    }
}
