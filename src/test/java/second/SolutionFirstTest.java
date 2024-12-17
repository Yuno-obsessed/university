package second;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.uni.arrays.SolutionFirst;
import utils.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionFirstTest {

    private static SolutionFirst solutionFirst;
    private static List<TestCase<int[], Integer>> testCases = new ArrayList<>();

    @BeforeAll
    public void initTests() {
        solutionFirst = new SolutionFirst();
        testCases.add(new TestCase<>(new int[]{1,1,0,1,1,1}, 3));
        testCases.add(new TestCase<>(new int[]{1,0,1,1,0,1}, 2));
        testCases.add(new TestCase<>(new int[]{1,1,0,0,0,1,1,1,1,0,1,0,1,1,1}, 4));
    }

    @Test
    public void maxRepeatsTest() {
        for (TestCase<int[], Integer> testCase : testCases) {
            int[] input = testCase.getInput();
            Integer output = solutionFirst.maxRepeats(input);
            Integer expected = testCase.getExpected();

            System.out.printf("Input: nums = %s\nOutput: %s\nExpected: %s\n\n",
                    Arrays.toString(input), output, expected);

            assertThat(output).isEqualTo(expected);
        }
    }
}
