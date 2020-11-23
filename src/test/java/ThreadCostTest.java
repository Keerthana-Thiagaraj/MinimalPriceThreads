import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ThreadCostTest {
    private static ConnectThreads connectThreads;

    @BeforeClass
    public static void setUp() {
        connectThreads = new ConnectThreads();
    }

    @Test
    public void connectThreadsSuccess() throws Exception {
        int[] successThreads = {4, 6, 8, 12};
        Assert.assertTrue(connectThreads.minCost(successThreads) == 58);
    }

    @Test
    public void connectThreadsSameValueSuccess() throws Exception {
        int[] successSameValueThreads = {2, 2, 2};
        connectThreads.minCost(successSameValueThreads);
        Assert.assertTrue(connectThreads.minCost(successSameValueThreads) == 10);
    }

    @Test
    public void connectThreadsSingleValueSuccess() throws Exception {
        int[] successSingleValueThreads = {2};
        connectThreads.minCost(successSingleValueThreads);
        Assert.assertTrue(connectThreads.minCost(successSingleValueThreads) == 2);
    }


    @Test(expected = Exception.class)
    public void connectEmptyThread() throws Exception {
        int[] emptyThreads = {};
        ValidateThreads.validateThreadsNotEmpty(emptyThreads);
    }

    @Test(expected = Exception.class)
    public void connectThreadsWithZeroValue() throws Exception {
        int[] zeroValuedThreads = {0, 3};
        ValidateThreads.validateThreadPositiveValue(zeroValuedThreads);
    }

    @Test(expected = Exception.class)
    public void connectThreadsWithNegativeValue() throws Exception {
        int[] negativeThreads = {1, -3};
        ValidateThreads.validateThreadPositiveValue(negativeThreads);
    }
}
