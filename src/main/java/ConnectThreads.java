import java.util.PriorityQueue;

public class ConnectThreads {

    public static void main(String[] args) throws Exception {
        int threads[] = {2};
        ConnectThreads connectThreads = new ConnectThreads();
        System.out.println(connectThreads.minCost(threads));
    }

    int minCost(int threads[]) throws Exception {
        int totalCost = 0;
        try {
            if (ValidateThreads.validateThreadsNotEmpty(threads) &&
                    ValidateThreads.validateThreadPositiveValue(threads)) {
                PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
                for (int i = 0; i < threads.length; i++)
                    priorityQueue.add(threads[i]);
                if (priorityQueue.size() == 1)
                    return priorityQueue.poll();
                while (priorityQueue.size() > 1) {
                    int first = priorityQueue.poll();
                    int second = priorityQueue.poll();
                    totalCost += first + second;
                    priorityQueue.add(first + second);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return totalCost;
    }
}
