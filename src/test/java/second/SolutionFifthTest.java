package second;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.uni.arrays.SolutionFifth;
import utils.Inputs;
import utils.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionFifthTest {

    private static SolutionFifth solutionFifth;
    private static List<TestCase<List<Inputs<int[], Integer>>, int[]>> testCases = new ArrayList<>();

    @BeforeAll
    public void initTests() {
        solutionFifth = new SolutionFifth();
        testCases.add(new TestCase<>(List.of(new Inputs<>(new int[]{1,2,3,0,0,0}, 3),
                new Inputs<>(new int[]{2,5,6}, 3)), new int[]{1,2,2,3,5,6}));
        testCases.add(new TestCase<>(List.of(new Inputs<>(new int[]{1}, 1),
                new Inputs<>(new int[]{}, 0)), new int[]{1}));
        testCases.add(new TestCase<>(List.of(new Inputs<>(new int[]{0}, 0),
                new Inputs<>(new int[]{1}, 1)), new int[]{1}));
    }

    @Test
    public void mergeTest() {
        for (TestCase<List<Inputs<int[], Integer>>, int[]> testCase : testCases) {
            List<Inputs<int[], Integer>> input = testCase.getInput();
            int[] output = solutionFifth.merge(input.get(0).getX(), input.get(0).getY(),
                    input.get(1).getX(), input.get(1).getY());
            int[] expected = testCase.getExpected();

            System.out.printf("Input: nums1 = %s, m = %s, nums2 = %s, n = %s\nOutput: %s\nExpected: %s\n\n",
                    Arrays.toString(input.get(0).getX()), input.get(0).getY(), Arrays.toString(input.get(1).getX()),
                    input.get(1).getY(), Arrays.toString(output), Arrays.toString(expected));

            assertThat(output).isEqualTo(expected);
        }
    }
}
