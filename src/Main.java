import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyCalend myCalend = new MyCalend();
        View view = new View();
//        NewTusk newTusk = new NewTusk();
//        view.getMenu();
//        MainTusk inviteVova = new ThirdTusk("Вечеринка", "Максим", 31, "Позвать гостей", "Маша", 25, "Позвонить Вове", "Игорь", 24, 1);
//        MainTusk inviteDasha = new ThirdTusk("Вечеринка", "Максим", 31, "Позвать гостей", "Маша", 25, "Позвонить Даше", "Егор", 24, 3);
//        MainTusk choiceGastro = new ThirdTusk("Вечеринка", "Максим", 31, "Выбрать кухню", "Саша", 29, "Заказать еду", "Егор", 30, 3);
//        System.out.println(choiceGastro);
//        MyCalend<MainTusk> calend = new MyCalend<>();
//        calend.add(((ThirdTusk) inviteDasha).getEnd2(), inviteDasha);
//        System.out.println(calend);
        while (true) {
            view.getMenu();
            if (!view.Menu()) break;
        }

    }
}