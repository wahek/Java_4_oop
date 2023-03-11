public class ThirdTusk extends SecondTusk {
    private String task2;
    private String owner2;
    private int end2;
    private int priority;

    public ThirdTusk(String mainTask, String owner, int mainEnd, String task1, String owner1, int end1, String task2, String owner2, int end2, int priority) {
        super(mainTask, owner, mainEnd, task1, owner1, end1);
        this.task2 = task2;
        this.end2 = end2;
        this.priority = priority;
        this.owner2 = owner2;
    }

    public String getTask2() {
        return task2;
    }

    public void setTask2(String task2) {
        this.task2 = task2;
    }

    public int getEnd2() {
        return end2;
    }

    public void setEnd2(int end2) {
        this.end2 = end2;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getOwner2() {
        return owner2;
    }

    public void setOwner2(String owner2) {
        this.owner2 = owner2;
    }

    @Override
    public String toString() {
        return "ThirdTusk{" +
                "task2='" + task2 + '\'' +
                ", owner2='" + owner2 + '\'' +
                ", end2=" + end2 +
                ", priority=" + priority +
                '}';
    }
}
