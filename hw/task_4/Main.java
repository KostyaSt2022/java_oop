//Урок 4. ООП: Обобщения. ч1
//— Создать класс Учитель;
//— Создать класс УчительГруппа и реализовать с параметризацией;
//— Создать несколько несколько наследников класса учитель и использовать их с УчительГруппой
// Формат сдачи: ссылка на гитхаб проект

package task_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeachersClass<Teacher> teachers = new TeachersClass<>("teachers");
        teachers.add(new MathTeacher("Туктаров", "Вениамин", "Андреевич"));
        teachers.add(new MusicTeacher("Потапова", "Ольга", "Александровна"));

        for (int index = 0; index < teachers.count(); index++) {
            System.out.println(teachers.get(index));
        }
    }
}