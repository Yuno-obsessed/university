package second;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.uni.arrays.SolutionThird;
import utils.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionThirdTest {

    private static SolutionThird solutionThird;
    private static List<TestCase<int[], int[]>> testCases = new ArrayList<>();

    @BeforeAll
    public void initTests() {
        solutionThird = new SolutionThird();
        testCases.add(new TestCase<>(new int[]{-4,-1,0,3,10}, new int[]{0,1,9,16,100}));
        testCases.add(new TestCase<>(new int[]{-7,-3,2,3,11}, new int[]{4,9,9,49,121}));
        testCases.add(new TestCase<>(new int[]{-13,-9,-5,8,12,19}, new int[]{25,64,81,144,169,361}));
    }

    @Test
    public void powArrayTest() {
        for (TestCase<int[], int[]> testCase : testCases) {
            int[] input = testCase.getInput();
            int[] output = solutionThird.powArray(input);
            int[] expected = testCase.getExpected();

            System.out.printf("Input: nums = %s\nOutput: %s\nExpected: %s\n\n",
                    Arrays.toString(input), Arrays.toString(output), Arrays.toString(expected));

            assertThat(expected).isEqualTo(output);
        }
    }

}
