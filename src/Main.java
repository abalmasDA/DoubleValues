import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Використовуючи колекцію, підвійте слово:
 * 1. Введіть із клавіатури 5 слів до списку рядків.
 * 2. Метод doubleValues повинен підвоювати слова за принципом a, b, c -> a, a, b, b, c, c.
 * 3. Використовуючи цикл for виведіть результат на екран, кожне значення нового рядка.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> someList = new ArrayList<>();
        int numberWords = 5;

        for (int i = 0; i < numberWords; i++) {
            someList.add(scanner.next());

        }
        System.out.println(someList);

        List<String> listDouble = DoubleValues.doubleValues(someList);
        System.out.print("[");
        for (int i = 0; i < listDouble.size(); i++) {
            if (i == listDouble.size() - 1) {
                System.out.print(listDouble.get(i) + "]");
            } else {
                System.out.print(listDouble.get(i) + ", ");
            }


        }

    }


}
