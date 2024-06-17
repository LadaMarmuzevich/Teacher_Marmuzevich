public class Student implements Comparable<Student> {

    private Long studentid;
    private String firstName;
    private String lastName;
    private String middleName;

    public Long getStudentid() {
        return studentid;
    }
    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    @Override
    public int compareTo(Student o) {
        return this.studentid.compareTo(studentid);
    }
    
}