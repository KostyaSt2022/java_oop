package task_3;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class ClassOfStudents implements Iterable<Students>{
    private String nameGroup;
    private List<Students> numberOfStudents = new ArrayList<Students>();
    private int index = 0;

    public ClassOfStudents(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public String getName() {
        return nameGroup;
    }

    @Override
    public Iterator<Students> iterator() {
        return new StudentsIterator() {
        };
    }

    private class StudentsIterator implements Iterator<Students> {
        @Override
        public boolean hasNext() {
            return index < numberOfStudents.size();
        }

        @Override
        public Students next() {
            if (hasNext()) {
                return numberOfStudents.get(index++);
            }
            return null;
        }

        @Override
        public void remove() {
            numberOfStudents.remove(numberOfStudents.get(index));
        }
    }
}