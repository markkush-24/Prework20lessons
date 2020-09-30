package threds;

public abstract class TaskImplImpl extends TaskImpl {

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

