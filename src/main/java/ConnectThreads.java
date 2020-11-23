import java.util.PriorityQueue;

public class ConnectThreads {

    public static void main(String[] args) throws Exception {
        int threads[] = {20, 4, 8, 2};
        ConnectThreads connectThreads = new ConnectThreads();
        System.out.println(connectThreads.minCost(threads));
    }

    int minCost(int threads[]) throws Exception {
        ValidateThreads.validateThreads(threads);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        int totalCost = 0;
        for (int i = 0; i < threads.length; i++) {
            priorityQueue.add(threads[i]);
        }

        while (priorityQueue.size() > 1) {
            int first = priorityQueue.poll();
            int second = priorityQueue.poll();
            totalCost += first + second;
            priorityQueue.add(first + second);
        }
        return totalCost;
    }
}
