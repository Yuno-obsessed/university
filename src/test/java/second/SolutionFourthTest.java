package second;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.uni.arrays.SolutionFourth;
import utils.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionFourthTest {

    private static SolutionFourth solutionFourth;
    private static List<TestCase<int[], int[]>> testCases = new ArrayList<>();

    @BeforeAll
    public void initTests() {
        solutionFourth = new SolutionFourth();
        testCases.add(new TestCase<>(new int[]{1,0,2,3,0,4,5,0}, new int[]{1,0,0,2,3,0,0,4}));
        testCases.add(new TestCase<>(new int[]{1,2,3}, new int[]{1,2,3}));
        testCases.add(new TestCase<>(new int[]{0,1,3,0,0,2,3}, new int[]{0,0,1,3,0,0,0}));
    }

    @Test
    public void duplicateZerosTest() {
        for (TestCase<int[], int[]> testCase : testCases) {
            int[] input = testCase.getInput();
            int[] output = solutionFourth.duplicateZeros(input);
            int[] expected = testCase.getExpected();

            System.out.printf("Input: nums = %s\nOutput: %s\nExpected: %s\n\n",
                    Arrays.toString(input), Arrays.toString(output), Arrays.toString(expected));

            assertThat(output).isEqualTo(expected);
        }
    }

}
