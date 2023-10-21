package task_4;

public class Teacher {
    String lName;
    String fName;
    String surName;

    protected Teacher(String lName, String fName, String surName) {
        this.lName = lName;
        this.fName = fName;
        this.surName = surName;
    }

    public String getLastName() {
        return lName;
    }
    public String getFirstName() {
        return fName;
    }

    public String getSurName() {
        return surName;
    }

    public void setLastName(String lName) {
        this.lName = lName;
    }
    public void setFirstName(String fName) {
        this.fName = fName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Учитель - {" +
                "ФИО = " + lName + ' ' + fName + ' ' + surName + '}';
    }
}
