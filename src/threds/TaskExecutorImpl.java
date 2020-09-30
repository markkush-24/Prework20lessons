package threds;

public class TaskExecutorImpl extends Thread implements TaskExecutor {
    private TasksStorage storage;
    private boolean stop;

    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        this.storage = storage;
    }

    @Override
    public TasksStorage getStorage() {
        return storage;

    }

    @Override
    public void run() {
        while (!stop) {
            Task task = storage.get();
            System.out.println(Thread.currentThread().getName() + "---Взял задачу---" + task);
            if (task != null) {
                System.out.println(Thread.currentThread().getName() + "---буду пробовать выполнить задачу---" + task);
                try {
                    task.execute();
                    System.out.println(Thread.currentThread().getName() + "---Успешна выполнена задача---" + task);
                } catch (TaskExecutionFailedException e) {
                    System.out.println(Thread.currentThread().getName() + "---Не удалось выполнить задачу---" + task);
                    int tryCount = task.getTryCount();
                    if (tryCount < 5) {
                        task.incTryCount();
                        storage.add(task);
                        System.out.println(Thread.currentThread().getName() + "---Возвращаю задачу---" + task);
                    } else {
                        System.out.println(Thread.currentThread().getName() + "---НЕВЫПОЛНИМА ЗАДАЧА,УДАЛЯЕМ ЕЕ---" + task);
                    }
                }
            } else {
                stop = true;
                System.out.println(Thread.currentThread().getName() + "---Задач нет , завершаю работу---");
            }
        }
    }
}
