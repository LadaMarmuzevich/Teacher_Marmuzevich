import java.util.Comparator;

public class StreamComparator implements Comparator<Flow> {

    @Override
    public int compare(Flow f1, Flow f2) {
        return Integer.compare(f1.getGroupList().size(),f2.getGroupList().size());
    }
    
}
