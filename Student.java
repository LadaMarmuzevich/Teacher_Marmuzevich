public class Student extends User implements Comparable<Student> {

    private Long studentid;

    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public Long getStudentid() {
        return studentid;
    }
    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentid.compareTo(studentid);
    }
    
}