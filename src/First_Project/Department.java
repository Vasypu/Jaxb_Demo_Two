package First_Project;

import javax.xml.bind.annotation.*;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Department {

    @XmlAttribute
    @XmlID
    private String id;
}