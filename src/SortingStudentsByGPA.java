import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator<Student> {
    private int a;
    public SortingStudentsByGPA(int b) {
        a=b;
    }
    @Override
    public int compare(Student student1, Student student2) {
        if (a==1)
            return student1.getFinals() - student2.getFinals();
        else
            return student1.getCourse() - student2.getCourse();
    }
}