package second;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.uni.arrays.SolutionNinth;
import utils.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionNinthTest {

    private static SolutionNinth solutionNinth;
    private static List<TestCase<int[], int[]>> testCases = new ArrayList<>();

    @BeforeAll
    public void initTests() {
        solutionNinth = new SolutionNinth();
        testCases.add(new TestCase<>(new int[]{17,18,5,4,6,1}, new int[]{18,6,6,6,1,-1}));
        testCases.add(new TestCase<>(new int[]{400}, new int[]{-1}));
    }

    @Test
    public void replaceElementsTest() {
        for (TestCase<int[], int[]> testCase : testCases) {
            int[] input = testCase.getInput();
            int[] output = solutionNinth.replaceElements(Arrays.copyOf(input, input.length));
            int[] expected = testCase.getExpected();

            System.out.printf("Input: nums = %s\nOutput: %s\nExpected: %s\n\n",
                    Arrays.toString(input), Arrays.toString(output), Arrays.toString(expected));

            assertThat(output).isEqualTo(expected);
        }
    }

}
