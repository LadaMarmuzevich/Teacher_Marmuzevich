import java.util.List;

public class Controller {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private FlowService flowService = new FlowService();
    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }
    public List<Student> getSortedStudentList() {
        return studentGroupService.getSortedStudentList();
    }
    public List<Student> getSortedStudenByFIO() {
        return studentGroupService.getSortedStudenByFIO();
    }
    public void getsortedFlow(List<Flow> flow){
        flowService.getsortedFlow(flow);
    }
    
}
