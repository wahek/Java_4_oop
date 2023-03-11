public class MainTusk {
    private String mainTask;
    private String mainOwner;
    private int mainEnd;

    public MainTusk(String mainTask, String mainOwner, int mainEnd) {
        this.mainTask = mainTask;
        this.mainOwner = mainOwner;
        this.mainEnd = mainEnd;
    }

    public String getMainTask() {
        return mainTask;
    }

    public String getMainOwner() {
        return mainOwner;
    }

    public int getMainEnd() {
        return mainEnd;
    }

    @Override
    public String toString() {
        return "MainTusk{" +
                "mainTask='" + mainTask + '\'' +
                ", mainOwner='" + mainOwner + '\'' +
                ", mainEnd=" + mainEnd +
                '}';
    }
}
