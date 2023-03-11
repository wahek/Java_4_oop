import java.util.Scanner;

public class View {
//    Scanner scanner = new Scanner(System.in);
    MyCalend<MainTusk> calend = new MyCalend<>();
    Writer writer = new Writer();
    public void getMenu() {
        System.out.println("""
                1: Посмотреть задачи
                2: Добавить задачу
                3: Показать ближайший дедлайн
                4: Выгрузить календарь задач в файл
                0: Выход""");
    }

    public int getChoiceMenu() {
        try {
            System.out.println("Введи цифру");
            Scanner scanner = new Scanner(System.in);
            int choce = scanner.nextInt();
            return choce;
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
        return 0;
    }
    public boolean Menu(){
        switch (getChoiceMenu()) {
            case 1 -> System.out.println(calend);
            case 2 -> {
                System.out.println("""
                        Выбери порядок задачи
                        2: Второстепенная
                        3: Трёхстепенная
                        0: Назад""");
                switch (getChoiceMenu()) {
                    case 2 -> {
                        MainTusk newTusk1 = new SecondTusk(requestString(), requestString(), getChoiceMenu(),
                                requestString(), requestString(), getChoiceMenu());
                        calend.add(newTusk1.getMainEnd(), newTusk1);
                    }
                    case 3 -> {
                        MainTusk newTusk2 = new ThirdTusk(requestString(), requestString(), getChoiceMenu(),
                                requestString(), requestString(), getChoiceMenu(), requestString(), requestString(),
                                getChoiceMenu(), getChoiceMenu());
                        calend.add(newTusk2.getMainEnd(), newTusk2);
                    }
                    case 0 -> {
                        return true;
                    }
                }
            }
            case 3 -> {
                System.out.println("Ближайший дедлайн");
                System.out.println(calend.getNearEnd());
            }
            case 4 -> {
                writer.setWriter(calend.toString());
            }
            case 0 -> {
                return false;
            }
        }
        return true;
    }

    public String requestString() {
        try {
            System.out.println("Введи название");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
        return null;
    }
}
