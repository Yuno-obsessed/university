package first;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.uni.inversion.SolutionFifth;
import utils.Inputs;
import utils.TestCase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionFifthTest {

    private static SolutionFifth solutionFifth;
    private static List<TestCase<Inputs<BigDecimal, Integer>, BigDecimal>> testCases = new ArrayList<>();

    @BeforeAll
    public void initTests() {
        solutionFifth = new SolutionFifth();
        testCases.add(new TestCase<>(
                new Inputs<>(BigDecimal.valueOf(2), 10), BigDecimal.valueOf(1024)));
        testCases.add(new TestCase<>(
                new Inputs<>(BigDecimal.valueOf(2.1), 3), BigDecimal.valueOf(9.26100)));
        testCases.add(new TestCase<>(
                new Inputs<>(BigDecimal.valueOf(2.00000), -2), BigDecimal.valueOf(0.25000)));
        testCases.add(new TestCase<>(
                new Inputs<>(BigDecimal.ZERO, 3), BigDecimal.ZERO));
        testCases.add(new TestCase<>(
                new Inputs<>(BigDecimal.valueOf(1000), 0), BigDecimal.ONE));
    }

    @Test
    public void testPow() {
        for (TestCase<Inputs<BigDecimal, Integer>, BigDecimal> testCase : testCases) {
            Inputs<BigDecimal, Integer> input = testCase.getInput();
            BigDecimal output = solutionFifth.pow(input.getX(), input.getY());
            BigDecimal expected = testCase.getExpected();

            System.out.printf("Input: %s\nOutput: %s\nExpected: %s\n\n",
                    input, output, expected);

            assertThat(output).isEqualTo(expected);
        }
    }

}
