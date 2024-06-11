import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class QueueManager {
    private Queue<String> waitingList;
    private Set<String> uniqueNames;

    public QueueManager() {
        waitingList = new LinkedList<>();
        uniqueNames = new HashSet<>();
    }

    public void addCustomer(String name) {
        if (uniqueNames.contains(name)) {
            System.out.println(name + " is already on the waiting list.");
        } else {
            waitingList.add(name);
            uniqueNames.add(name);
            System.out.println(name + " has been added to the queue.");
        }
    }

    public String serveCustomer() {
        if (waitingList.isEmpty()) {
            return "The queue is empty.";
        } else {
            String name = waitingList.poll();
            uniqueNames.remove(name);
            return name + " has been served.";
        }
    }

    public boolean isCustomerInList(String name) {
        return uniqueNames.contains(name);
    }

    public int getWaitingListSize() {
        return waitingList.size();
    }

    public void displayWaitingList() {
        if (waitingList.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Waiting list:");
            for (String name : waitingList) {
                System.out.println(name);
            }
        }
    }
}