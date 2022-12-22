public class Student {
    private String FIO;
    private String Specialization;
    private int Course;
    private int Finals;
    private String Group;
    public Student (String _FIO, String _Specialization, int _Course, String _Group, int _Finals) {
        FIO = _FIO;
        Specialization=_Specialization;
        Course=_Course;
        Group=_Group;
        Finals=_Finals;
    }

    public String getFIO(){ return FIO;}
    public void setFIO(String _FIO){FIO = _FIO;}
    public int getFinals(){ return Finals;}
    public void setFinals(int _Finals){Finals = _Finals;}
    public String getSpecialization() {
        return Specialization;
    }
    public void setSpecialization(String _Specialization){Specialization = _Specialization;}
    public int getCourse() {
        return Course;
    }
    public void setCourse(int _Course){Course = _Course;}
    public String getGroup() {
        return Group;
    }
    public void setGroup(String _Group){Group = _Group;}
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("FIO : ").append(getFIO());
        sb.append("; Specialization : ").append(getSpecialization());
        sb.append("; Course : ").append(getCourse());
        sb.append("; Group : ").append(getGroup());
        sb.append("; Finals : ").append(getFinals());
        sb.append("}");
        return sb.toString();
    }
    public static void showRes(Student[] list) {
        for (int index = 0; index < list.length; index++) {
            System.out.println(list[index]);
        }
        System.out.println("========================================================");
    }
}