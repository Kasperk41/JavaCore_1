package Task_2;

import Task_2.Worker.OnTaskDoneListener;
import Task_2.Worker.OnTaskErrorListener;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;

        Worker worker = new Worker(listener);
        worker.start();
    }
}
