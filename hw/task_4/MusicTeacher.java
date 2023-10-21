package task_4;

public class MusicTeacher extends Teacher{

    protected MusicTeacher(String lName, String fName, String surName) {
        super(lName, fName, surName);
    }

    @Override
    public String toString() {
        return "Учитель музыки - {" +
                "ФИО = " + lName + ' ' + fName + ' ' + surName + '}';
    }
}