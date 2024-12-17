package second;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.uni.arrays.SolutionSeventh;
import utils.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionSeventhTest {

    private static SolutionSeventh solutionSeventh;
    private static List<TestCase<int[], Boolean>> testCases = new ArrayList<>();

    @BeforeAll
    public void initTests() {
        solutionSeventh = new SolutionSeventh();
        testCases.add(new TestCase<>(new int[]{10,2,5,3}, true));
        testCases.add(new TestCase<>(new int[]{3,1,7,11}, false));
    }

    @Test
    public void hasDoubleTest() {
        for (TestCase<int[], Boolean> testCase : testCases) {
            int[] input = testCase.getInput();
            boolean output = solutionSeventh.hasDouble(input);
            boolean expected = testCase.getExpected();

            System.out.printf("Input: nums = %s\nOutput: %s\nExpected: %s\n\n",
                    Arrays.toString(input), output, expected);

            assertThat(output).isEqualTo(expected);
        }
    }
}
