package second;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.uni.arrays.SolutionSecond;
import utils.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionSecondTest {

    private static SolutionSecond solutionSecond;
    private static List<TestCase<int[], Integer>> testCases = new ArrayList<>();

    @BeforeAll
    public void initTests() {
        solutionSecond = new SolutionSecond();
        testCases.add(new TestCase<>(new int[]{12,345,2,6,7896}, 2));
        testCases.add(new TestCase<>(new int[]{555,901,482,1771}, 1));
        testCases.add(new TestCase<>(new int[]{2321, 1239, 12, 0, 12345, 1769}, 5));
    }

    @Test
    public void countEvenDigitsTest() {
        for (TestCase<int[], Integer> testCase : testCases) {
            int[] input = testCase.getInput();
            Integer output = solutionSecond.countEvenDigits(input);
            Integer expected = testCase.getExpected();

            System.out.printf("Input: nums = %s\nOutput: %s\nExpected: %s\n\n",
                    Arrays.toString(input), output, expected);

            assertThat(output).isEqualTo(expected);
        }
    }
}
