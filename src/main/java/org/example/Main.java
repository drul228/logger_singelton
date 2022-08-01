package org.example;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class Main {
    public static List <Integer> fillRandom() {
        Random random = new Random();
        List result = new ArrayList();
        int i = 0;
        while (i < N){
            result.add(random.nextInt(M));
            i++;
        }
        return result;
    }
    private static int N = 0;
    private static int M = 0;

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        Scanner scanner = new Scanner(in);
        out.println("Введите размер списка:");
        N = Integer.parseInt(scanner.nextLine());
        out.println("Введите верхнюю границу для значений:");
        M = Integer.parseInt(scanner.nextLine());

        logger.log("Создаём и наполняем список");
        var list = fillRandom();
        out.println(list.toString());
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        out.println("Введите порог для фильтра:");
        Filter filter = new Filter(Integer.parseInt(scanner.nextLine()));

        List<Integer> result = filter.filterOut(list);
        out.println("Отфильтрованный список: " + list);
        logger.log("Завершаем программу");


    }
}