package Second_Project;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class NetworkInputs {

    private List<Flow> flowList = new ArrayList<>();

    public void setFlowList(List<Flow> flowList) {
        this.flowList = flowList;
    }

    @XmlElementWrapper
    @XmlElement(name = "node")
    public List<Flow> getFlowList() {
        if (flowList == null) {
            flowList = new ArrayList<>();
            //contours = Collections.EMPTY_LIST;
        }
        return flowList;
    }
}