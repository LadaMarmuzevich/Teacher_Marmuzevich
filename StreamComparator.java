import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream f1, Stream f2) {
        return Integer.compare(f1.getGroupList().size(),f2.getGroupList().size());
    }
    
}
