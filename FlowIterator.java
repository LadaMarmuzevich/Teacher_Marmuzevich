
import java.util.Iterator;
import java.util.List;

public class FlowIterator implements Iterator<StudentGroup> {
    
    private final List<StudentGroup> groupList;
    private int count;
    public FlowIterator(Flow flow) {
        this.groupList = flow.getGroupList();
        this.count = 0;
    }
    @Override
    public boolean hasNext() {
        return count < groupList.size() - 1;
    }
    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
           }
           count ++;
           return groupList.get(count);
    }
    @Override
    public void  remove() {
        groupList.remove(count);
    }
}
