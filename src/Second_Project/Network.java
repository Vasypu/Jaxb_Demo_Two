package Second_Project;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Network {

    private List<Node> nodeList = new ArrayList<>();

    public void setNodeList(List<Node> nodeList) {
        this.nodeList = nodeList;
    }

    @XmlElementWrapper
    @XmlElement(name = "Node")
    public List<Node> getNodes() {
        if (nodeList == null) {
            nodeList = new ArrayList<>();
            //contours = Collections.EMPTY_LIST;
        }
        return nodeList;
    }
}
