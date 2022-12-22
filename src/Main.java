public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[4];
        student[0] = new Student("Петров А.С.", "Программная инженерия", 1,"ИКБО-04",99);
        student[1] = new Student("Митрошина А.Ю.",  "Программная инженерия", 1,"ИКБО-04", 65);
        student[2] = new Student("Поляков Л.М.",  "Программная инженерия", 2,"ИКБО-04", 77);
        student[3] = new Student("Теплихин Р.Д.",  "Программная инженерия", 2,"ИКБО-04", 45);
        System.out.println("BEFORE");
        Student.showRes(student);
        Sort.quickSort(student, 0, student.length - 1, 1);
        System.out.println("AFTER QUICK SORT FINALS");
        Student.showRes(student);
        Sort.quickSort(student, 0, student.length - 1, 0);
        System.out.println("AFTER QUICK SORT COURSE");
        Student.showRes(student);
        Student[] student1 = new Student[4];
        student1[0] = new Student("Солдунова А.С.",  "Программная инженерия", 3,"ИКБО-04",100);
        student1[1] = new Student("Анохин А.Ю.",  "Программная инженерия", 4,"ИКБО-04", 23);
        student1[2] = new Student("Дмитриенко Л.М.",  "Программная инженерия", 1,"ИКБО-04", 84);
        student1[3] = new Student("Солнцев Р.Д.",  "Программная инженерия", 2,"ИКБО-04", 75);
        Student[] student2 = new Student[4];
        student2[0] = new Student("Петров А.С.",  "Программная инженерия", 1,"ИКБО-04", 99);
        student2[1] = new Student("Митрошина А.Ю.",  "Программная инженерия", 1,"ИКБО-04",65);
        student2[2] = new Student("Поляков Л.М.",  "Программная инженерия", 2,"ИКБО-04", 77);
        student2[3] = new Student("Теплихин Р.Д.",  "Программная инженерия", 2,"ИКБО-04", 45);
        Student[] student3 = new Student[8];
        for (int i = 0; i < 4; i++) {
            student3[i] = student1[i];
            student3[i + 4] = student2[i];
        }
        Sort.MergeSort1(student3, 7, 0,1);
        System.out.println("AFTER MERGE SORT FINALS");
        Student.showRes(student3);
        Sort.MergeSort1(student3, 7, 0,0);
        System.out.println("AFTER MERGE SORT COURSE");
        Student.showRes(student3);
    }
}