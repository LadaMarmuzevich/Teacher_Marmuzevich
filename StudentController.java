import java.util.List;

public class StudentController implements UserController<Student> {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final FlowService flowService = new FlowService();
    private final StudentView studentView = new StudentView();
    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }
    public List<Student> getSortedStudentList() {
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }
    public List<Student> getSortedStudenByFIO() {
        List<Student> studentList = studentGroupService.getSortedStudenByFIO();
        studentView.sendOnConsole(studentList);
        return studentList; 
    }
    public void getsortedFlow(List<Stream> flow){
        flowService.getsortedFlow(flow);
    }
    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.create(firstName, lastName, middleName);
    }
    
}
