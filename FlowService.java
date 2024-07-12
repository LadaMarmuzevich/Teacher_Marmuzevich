
import java.util.Collections;
import java.util.List;

public class FlowService {
    public void getsortedFlow(List<Stream> flow){
        Collections.sort(flow, new StreamComparator());

    }
    
}
