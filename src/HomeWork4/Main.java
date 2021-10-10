package HomeWork4;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Введите имя первого мужчины");
        String man1 = scanner.next();

        System.out.println("Введите имя второго мужчины");
        String man2 = scanner.next();

        System.out.println("Введите имя третего мужчины");
        String man3 = scanner.next();

        System.out.println("Введите имя четвертого мужчины");
        String man4 = scanner.next();

        System.out.println("Введите имя пятого мужчины");
        String man5 = scanner.next();*/

        ArrayList<String> men = new ArrayList<>();
        men.add("Улан");
        men.add("Бексултан");
        men.add("Курман");
        men.add("Рыскелди");
        men.add("Айдар");

        System.out.println(men);

      /*  System.out.println("Введите имя первой женщины");
        String woman1 = scanner.next();

        System.out.println("Введите имя второй женщины");
        String woman2 = scanner.next();

        System.out.println("Введите имя третей женщины");
        String woman3 = scanner.next();

        System.out.println("Введите имя четвертой женщины");
        String woman4 = scanner.next();

        System.out.println("Введите имя пятой женщины");
        String woman5 = scanner.next();*/

        ArrayList<String> women = new ArrayList<>();
        women.add("Диана");
        women.add("Геша");
        women.add("Бегимай");
        women.add("Даткайым");
        women.add("Сайкал");

        Collections.reverse(women);

        men.addAll(women);

        ArrayList<String> people = new ArrayList<>();
        int countMen = 0;
        int countWomen = 0;

        for (int i = 0; i < (men.size()); i++) {
            if ((i % 2) == 0) {
                people.add(men.get(countMen));
                countMen++;

            } else {
                people.add(women.get(countWomen));
                countWomen++;
            }
        }
        System.out.println("Список C " + people);

        people.sort(Comparator.comparing(String::length));
        System.out.println("Отсортированный список " + people);
    }
}
