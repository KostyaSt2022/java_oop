package task_3;

import java.util.Comparator;

public class StudentsComporator implements Comparator<Students> {

    public int compare(Students one, Students two) {
        return Integer.compare(one.Age, two.Age);
    }

}