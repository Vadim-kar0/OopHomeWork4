package example;

import java.util.Comparator;

public class TeacherComparator<T extends Teacher> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getWorkExperience() - o2.getWorkExperience();
    }
}
