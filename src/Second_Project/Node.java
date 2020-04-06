package Second_Project;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;

public class Node {

    String id;

    public void setId(String id) {
        this.id = id;
    }

    @XmlAttribute
    @XmlID
    public String getId() {
        return id;
    }
}
