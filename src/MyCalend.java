
import java.util.Map;
import java.util.TreeMap;

public class MyCalend <T>{
    public Map<Integer, T> calendarMy = new TreeMap<>();

    public void add(int number, T T) {
        calendarMy.put(number, T);
    }

    public Map<Integer, T> getCalendar() {
        return calendarMy;
    }
    public T getNearEnd(){
        Map.Entry<Integer, T> entry = calendarMy.entrySet().iterator().next();
        Integer key = entry.getKey();
        T value = entry.getValue();
        return value;
    }

    @Override
    public String toString() {
        return "MyCalend{" +
                "calendarMy=" + calendarMy +
                '}';
    }
}
