package Task_2;

public class Worker {
    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener callback2) {
        this.callback = callback;
        this.errorCallback = callback2;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i!=33) callback.onDone("Task " + i + " is done");
            else errorCallback.onError("Task " + i + " is error");
        }
    }
}
