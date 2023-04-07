package Task_2;

public class Worker {
    private OnTaskDoneListener callback;

    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void oneDone(String result);
    }

    @FunctionalInterface
   public interface OnTaskErrorListener{
        void onError (String result);
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i !=33) callback.oneDone("Task" + i + " is done");
            errorCallback.onError("33 task not done");
        }
    }
}
