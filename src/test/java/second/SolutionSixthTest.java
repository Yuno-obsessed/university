package second;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.uni.arrays.SolutionSixth;
import org.uni.utils.Output;
import utils.Outputs;
import utils.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionSixthTest {

    private static SolutionSixth solutionSixth;
    private static List<TestCase<int[], Outputs<Integer, int[]>>> testCases = new ArrayList<>();

    @BeforeAll
    public void initTests() {
        solutionSixth = new SolutionSixth();
        testCases.add(new TestCase<>(new int[]{1,1,2}, new Outputs<>(2, new int[]{1,2,0})));
        testCases.add(new TestCase<>(new int[]{0,0,1,1,1,2,2,3,3,4}, new Outputs<>(5,new int[]{0,1,2,3,4,0,0,0,0,0})));
    }

    @Test
    public void removeDuplicatesTest() {
        for (TestCase<int[], Outputs<Integer, int[]>> testCase : testCases) {
            int[] input = testCase.getInput();
            Output<Integer, int[]> output1 = solutionSixth.removeDuplicates(input);
            Outputs<Integer, int[]> output = new Outputs<>(output1.getX(), output1.getY());
            Outputs<Integer, int[]> expected = testCase.getExpected();

            System.out.printf("Input: nums = %s\nOutput: %s, nums = %s\nExpected: %s, nums = %s\n\n",
                    Arrays.toString(input), output.getX(), Arrays.toString(output.getY()),
                    expected.getX(), Arrays.toString(expected.getY()));

            assertThat(output).isEqualTo(expected);
        }
    }
}
