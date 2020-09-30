package threds;

public abstract class TaskImpl implements Task {


    private  int tryTask;

    @Override
    public int getTryCount() {
        return tryTask;
    }

    @Override
    public void incTryCount() {
        tryTask++;
    }

}
