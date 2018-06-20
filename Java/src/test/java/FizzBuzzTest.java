import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private ByteArrayOutputStream output;

    @Before
    public void prepare_streams() {
        output = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(output);
        System.setOut(printStream);
    }

    @Test
    public void should_print_numbers() throws Exception {
        FizzBuzz.main();
        assertThat(output.toString()).isEqualTo("1");
    }

    @Test
    public void should_print_a_given_amount_of_numbers() throws Exception {
        FizzBuzz.main("2");
        assertThat(output.toString()).isEqualTo("1\n2");
    }
}
