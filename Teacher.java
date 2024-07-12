public class Teacher extends User {
    
    private Long teacherid;
    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }
    public Long getTeachertid() {
        return teacherid;
    }
    public void setStudentid(Long teacherid) {
        this.teacherid = teacherid;
    }
    
}