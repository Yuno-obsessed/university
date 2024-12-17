package first;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.uni.inversion.SolutionSecond;
import org.uni.utils.LinkedList;
import org.uni.utils.LinkedList.ListNode;
import utils.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionSecondTest {

    private static SolutionSecond solutionSecond;
    private static List<TestCase<int[], int[]>> testCases = new ArrayList<>();

    @BeforeAll
    public void initTests() {
        solutionSecond = new SolutionSecond();
        testCases.add(new TestCase<>(new int[]{1,2,3,4}, new int[]{2,1,4,3}));
        testCases.add(new TestCase<>(null, new int[0]));
        testCases.add(new TestCase<>(new int[]{1}, new int[]{1}));
    }

    @Test
    public void testSwapPairs() {
        LinkedList linkedList = new LinkedList(new ListNode(1));
        linkedList.head.next = new ListNode(2);
        linkedList.head.next.next = new ListNode(3);
        linkedList.head.next.next.next = new ListNode(4);

        LinkedList linkedList1 = new LinkedList(new ListNode(null));

        LinkedList linkedList2 = new LinkedList(new ListNode(1));

        List<LinkedList> tests = List.of(linkedList, linkedList1, linkedList2);

        for (int i = 0; i < testCases.size(); i++) {
            int[] input = testCases.get(i).getInput();
            int[] output = solutionSecond.swapPairs(tests.get(i).head).toIntArray();
            int[] expected = testCases.get(i).getExpected();

            System.out.printf("Input: head = %s\nOutput: %s\nExpected: %s\n\n",
                    Arrays.toString(input), Arrays.toString(output), Arrays.toString(expected));

            assertThat(output).isEqualTo(expected);
        }
    }
}
