package threds;

import java.util.ArrayList;
import java.util.List;

public class TaskStorageImpl implements TasksStorage{

    private final List<Task> tasks = new ArrayList<>();

    @Override
    public synchronized void add(Task task) throws NullPointerException {
        if (task == null) {
            throw new NullPointerException ("Отсутствует ссылка на задачу!");
        }
        tasks.add(task);

    }

    @Override
    public synchronized Task get() {
        if (tasks.size()== 0) {
            System.out.println("Список задач пуст");
            return null;
        } else {
            return tasks.remove(0);
        }
    }

    @Override
    public  synchronized int count() {
            return tasks.size();
        }

    }
