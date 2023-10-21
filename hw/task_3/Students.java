package task_3;

import java.util.Comparator;

public class Students implements Comparable<Students>{
    String Name;
    String Surname;
    int Age;

    public Students(String name, String surname, int age) {
        Name = name;
        Surname = surname;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public int compareTo(Students one) {
        return Integer.compare(this.Age, one.Age);
    }

    @Override
    public String toString() {
        return "Студент{" +
                "Имя='" + Name + '\'' +
                ", Фамилия='" + Surname + '\'' +
                ", Возраст=" + Age +
                '}';
    }
}