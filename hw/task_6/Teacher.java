package task_6;

public abstract class Teacher {
    // Класс стал абстрактным
    protected String lName;
    protected String fName;
    protected String surName;
    // Поля защищены

    protected Teacher(String lName, String fName, String surName) {
        this.lName = lName;
        this.fName = fName;
        this.surName = surName;
    }
}

// Убрана возможность получать и переписывать защищённые поля (класс закрыт для модификаций, открыт для расширений)
// Убраны неиспользуемые функции