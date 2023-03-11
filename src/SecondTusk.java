import java.util.Scanner;

public class SecondTusk extends MainTusk {
    private String task1;
    private String owner1;
    private int end1;
    private View view = new View();

    public SecondTusk(String mainTask, String owner, int mainEnd, String task1, String owner1, int end1) {
        super(mainTask, owner, mainEnd);
        this.task1 = task1;
        this.owner1 = owner1;
        this.end1 = end1;
    }

    public String getTask1() {
        return task1;
    }

    public String getOwner1() {
        return owner1;
    }

    public int getEnd1() {
        return end1;
    }
    public SecondTusk addTuskSecond(){
        SecondTusk secondTusk = new SecondTusk(view.requestString(), view.requestString(), view.getChoiceMenu(),
                view.requestString(), view.requestString(), view.getChoiceMenu());
        return secondTusk;
    }

    @Override
    public String toString() {
        return "SecondTusk{" +
                "task1='" + task1 + '\'' +
                ", owner1='" + owner1 + '\'' +
                ", end1=" + end1 +
                '}';
    }
}
