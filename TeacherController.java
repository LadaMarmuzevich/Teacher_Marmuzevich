import java.util.ArrayList;
import java.util.List;

public class TeacherController {
    private List<Teacher> teachers = new ArrayList<>();

    public void addTeachers(String firstName, String lastName, String middleName){
        Teacher newtTeacher = new Teacher(firstName, lastName, middleName);
        teachers.add(newtTeacher);

    }
    public void changeTeacher(int index, String NewfirstName, String NewlastName, String NewmiddleName) {
        if (index >= 0 && index < teachers.size()) {
            Teacher teacher = teachers.get(index);
            teacher.setFirstName(NewfirstName);
            teacher.setLastName(NewlastName);
            teacher.setMiddleName(NewmiddleName);
        } else {
            System.out.println("Учитель с таким индексом не найден");
        }
    }
    public void sendOnConsoleTeachers(){
        System.out.println("Список учителей: ");
        for (int i = 0; i < teachers.size(); i++) {
            Teacher teacher = teachers.get(i);
            System.out.println(i + ". " + teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.getMiddleName());  
        }
    }

    
}
