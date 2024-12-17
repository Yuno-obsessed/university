package first;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.uni.inversion.SolutionFourth;
import utils.TestCase;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionFourthTest {

    private static SolutionFourth solutionFourth;
    private static List<TestCase<Integer, Integer>> testCases = new ArrayList<>();

    @BeforeAll
    public void initTests() {
        solutionFourth = new SolutionFourth();
        testCases.add(new TestCase<>(2, 2));
        testCases.add(new TestCase<>(3, 3));
        testCases.add(new TestCase<>(4, 5));
        testCases.add(new TestCase<>(10, 89));
    }

    @Test
    public void testUniqueWaysToClimb() {
        for (TestCase<Integer, Integer> testCase : testCases) {
            int input = testCase.getInput();
            int output = solutionFourth.uniqueWaysToClimb(testCase.getInput());
            int expected = testCase.getExpected();

            System.out.printf("Input: n = %s\nOutput: %s\nExpected: %s\n\n",
                    input, output, expected);

            assertThat(output).isEqualTo(expected);
        }
    }
}
