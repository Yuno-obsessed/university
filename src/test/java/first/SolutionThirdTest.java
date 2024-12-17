package first;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.uni.recursion.SolutionThird;
import utils.TestCase;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionThirdTest {

    private static SolutionThird solutionThird;
    private static List<TestCase<Integer, Integer>> testCases = new ArrayList<>();

    @BeforeAll
    public void initTests() {
        solutionThird = new SolutionThird();
        testCases.add(new TestCase<>(2, 1));
        testCases.add(new TestCase<>(3, 2));
        testCases.add(new TestCase<>( 4, 3));
    }

    @Test
    public void testFibonacci() {
        for (TestCase<Integer, Integer> testCase : testCases) {
            Integer input = testCase.getInput();
            Integer output = solutionThird.calculateFibonacci(input);
            Integer expected = testCase.getExpected();

            System.out.printf("Input: n = %s\nOutput: %s\nExpected: %s\n\n",
                    input, output, expected);

            assertThat(output).isEqualTo(expected);
        }
    }
}
