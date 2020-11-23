import java.util.Arrays;

public class ValidateThreads {

    public static void validateThreads(int[] threads) throws Exception {
        if (!(threads.length > 0)) {
            throw new Exception("Please enter additional elements");
        }
        if (!(Arrays.stream(threads).max().getAsInt() <= Integer.MAX_VALUE)) {
            System.out.println("Please enter valid threads");
        }
    }
}
