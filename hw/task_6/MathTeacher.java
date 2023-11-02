package task_6;

public class MathTeacher extends Teacher {
    protected MathTeacher(String lName, String fName, String surName) {
        super(lName, fName, surName);
    }
    @Override
    public String toString() {
        return "Учитель математики - {" +
                "ФИО = " + lName + ' ' + fName + ' ' + surName + '}';
    }
}