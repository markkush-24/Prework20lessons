package threds;

public class CopyFile extends TaskImpl implements CopyFileTask  {

    private FileCopyUtils copyUtils;
    private String copyFrom;
    private String copyTo;

    public String getCopyFrom() {
        return copyFrom;
    }

    public void setCopyFrom(String copyFrom) {
        this.copyFrom = copyFrom;
    }

    public String getCopyTo() {
        return copyTo;
    }

    public void setCopyTo(String copyTo) {
        this.copyTo = copyTo;
    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            copyUtils.copyFile(copyFrom,copyTo);
        } catch (Exception e) {
            throw new TaskExecutionFailedException("Упс! почему-то не получилось скопировать файл");
        }
    }
}
