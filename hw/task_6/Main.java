/*
Урок 6. ООП Дизайн и Solid
Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов, усвоенных на семинаре.
Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему.
Формат сдачи: ссылка на гитхаб проект
*/


package task_6;

public class Main {
    public static void main(String[] args) {
        ClassOfTeachers<Teacher> teachers = new ClassOfTeachers<>("teachers");
        teachers.add(new MathTeacher("Туктаров", "Вениамин", "Андреевич"));
        teachers.add(new MusicTeacher("Потапова", "Ольга", "Александровна"));

        for (int index = 0; index < teachers.count(); index++) {
            System.out.println(teachers.get(index));
        }
    }
}