import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Test for {@link MyTextUtils#addSpaceInterval(String, int)}
 */
@RunWith(Parameterized.class)
public class SpaceIntervalTest {

    private final String input;
    private final String expected;

    public SpaceIntervalTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: input: '{0}' | expected output: '{1}'")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                new String[]{"12345", "1234 5"},
                new String[]{"1234", "1234"},
                new String[]{"1234567890123456", "1234 5678 9012 3456"},
                new String[]{"12345678901", "1234 5678 901"},
        });
    }

    @Test
    public void testSpaceInterval() throws Exception {
        String actual = MyTextUtils.addSpaceInterval(input, 4);
        assertThat(actual, Matchers.equalTo(expected));
    }
}