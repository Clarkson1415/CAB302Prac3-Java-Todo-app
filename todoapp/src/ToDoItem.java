public class ToDoItem {
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    private boolean isDone;

    public void setDone(boolean done) {
        isDone = done;
    }

    public boolean IsDone(){
        return isDone;
    }

    public ToDoItem(String description)
    {
        setDone(false);
        setDescription(description);
    }
}