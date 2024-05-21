interface Task extends Runnable {
    void execute();
    @Override
    default void run() {
        execute();
    }
}