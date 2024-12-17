package second;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.uni.arrays.SolutionEighth;
import utils.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionEighthTest {

    private static SolutionEighth solutionEighth;
    private static List<TestCase<int[], Boolean>> testCases = new ArrayList<>();

    @BeforeAll
    public void initTests() {
        solutionEighth = new SolutionEighth();
        testCases.add(new TestCase<>(new int[]{2,1}, false));
        testCases.add(new TestCase<>(new int[]{3,5,5}, false));
        testCases.add(new TestCase<>(new int[]{0,3,2,1}, true));
    }

    @Test
    public void validMountainTest() {
        for (TestCase<int[], Boolean> testCase : testCases) {
            int[] input = testCase.getInput();
            boolean output = solutionEighth.validMountain(input);
            boolean expected = testCase.getExpected();

            System.out.printf("Input: nums = %s\nOutput: %s\nExpected: %s\n\n",
                    Arrays.toString(input), output, expected);

            assertThat(output).isEqualTo(expected);
        }
    }
}
