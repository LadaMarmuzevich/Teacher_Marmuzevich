public class TeacherService {
    public TeacherController teacher;
    public void create(String firstName, String lastName, String middleName){
        teacher.addTeachers(firstName,lastName,middleName);
    }
}
