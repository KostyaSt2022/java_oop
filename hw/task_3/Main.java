//Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
//Взять за основу код с семинара и модифицировать классы,
// добавив имплементацию comparable/comparator

package task_3;

import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Students one = new Students("Сергей", "Иванов", 25);
        Students two = new Students("Алексей", "Никитин", 22);
        Students three = new Students("Андрей", "Пушкин", 25);
        Students four = new Students("Константин", "Серов", 24);
        Students five = new Students("Станислав", "Сергеев", 23);

        List<Students> numberGroup = new ArrayList<>();
        numberGroup.add(one);
        numberGroup.add(two);
        numberGroup.add(three);
        numberGroup.add(four);
        numberGroup.add(five);
        System.out.println(numberGroup);
        numberGroup.sort(new StudentsComporator());

        System.out.println(numberGroup);
    }
}