import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.println("Hello!");
        System.out.println("Введите размер списка: ");
        int n = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int m = scanner.nextInt();

        logger.log("Создаём и наполняем список");

        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input.add(random.nextInt(m));
        }

        System.out.println("Вот случайный список: " + input);

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.println("Введите порог для фильтра: ");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(input);

        logger.log(" Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);

        logger.log("Завершаем программу");
    }
}