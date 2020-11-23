import java.util.Arrays;

public class ValidateThreads {

    public static boolean validateThreadsNotEmpty(int[] threads) throws Exception {
        if (!(threads.length > 0)) {
            throw new Exception("Threads cannot be empty");
        }
        return true;
    }

    public static boolean validateThreadPositiveValue(int[] threads) throws Exception {
        if (!(Arrays.stream(threads).allMatch(t -> t > 0))) {
            throw new Exception("Threads must hold a positive value");
        }
        return true;
    }
}
