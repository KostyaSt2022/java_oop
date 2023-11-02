package task_6;

import java.util.Iterator;
import java.util.List;

public class TeachersIterator<T extends Teacher> implements Iterator<Teacher> {
    private List<T> numberOfTeachers;
    private int counter;
    private int index;

    public TeachersIterator(List<T> numberOfTeachers) {
        this.numberOfTeachers = numberOfTeachers;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return index < numberOfTeachers.size() - 1;
    }

    @Override
    public T next() {
        if (hasNext()) {
            return numberOfTeachers.get(index++);
        }
        return null;
    }

    @Override
    public void remove() {
        numberOfTeachers.remove(numberOfTeachers.get(index));
    }
}

//  Интерфейс разделён, класс реализует только функцию итератора