package second;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.uni.arrays.SolutionTenth;
import utils.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionTenthTest {

    private static SolutionTenth solutionTenth;
    private static List<TestCase<int[], int[]>> testCases = new ArrayList<>();

    @BeforeAll
    public void initTests() {
        solutionTenth = new SolutionTenth();
        testCases.add(new TestCase<>(new int[]{3,1,2,4}, new int[]{4,2,1,3}));
        testCases.add(new TestCase<>(new int[]{0}, new int[]{0}));
    }

    @Test
    public void moveEvenOddTest() {
        for (TestCase<int[], int[]> testCase : testCases) {
            int[] input = testCase.getInput();
            int[] output = solutionTenth.moveEvenOdd(Arrays.copyOf(input, input.length));
            int[] expected = testCase.getExpected();

            System.out.printf("Input: nums = %s\nOutput: %s\nExpected: %s\n\n",
                    Arrays.toString(input), Arrays.toString(output), Arrays.toString(expected));

            assertThat(output).isEqualTo(expected);
        }
    }
}
