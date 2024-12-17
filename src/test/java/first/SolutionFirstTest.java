package first;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.uni.recursion.SolutionFirst;
import utils.TestCase;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionFirstTest {

    private static SolutionFirst solutionFirst;
    private static List<TestCase<String, String>> testCases = new ArrayList<>();

    @BeforeAll
    public void initTests() {
        solutionFirst = new SolutionFirst();
        testCases.add(new TestCase<>("tiger", "regit"));
        testCases.add(new TestCase<>("lovare", "eravol"));
        testCases.add(new TestCase<>("gym rat", "tar myg"));
        testCases.add(new TestCase<>("joking_state2", "2etats_gnikoj"));
    }

    @Test
    public void reverseStringTest() {
        for (TestCase<String, String> testCase : testCases) {
            String input = testCase.getInput();
            String output = solutionFirst.reverseStringRecursively(input);
            String expected = testCase.getExpected();

            System.out.printf("Input: str = %s\nOutput: %s\nExpected: %s\n\n",
                    input, output, expected);

            assertThat(output).isEqualTo(expected);
        }
    }

}
