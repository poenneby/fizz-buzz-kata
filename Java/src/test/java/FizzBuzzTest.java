import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_print_numbers() throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(output);
        System.setOut(printStream);

        FizzBuzz.main();

        assertThat(output.toString()).isEqualTo("1");
    }

    @Test
    public void should_print_a_given_amount_of_numbers() throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(output);
        System.setOut(printStream);

        FizzBuzz.main("2");

        assertThat(output.toString()).isEqualTo("1\n2");
    }
}
