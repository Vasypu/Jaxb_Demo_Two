package First_Project;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

    @XmlAttribute
    @XmlID
    private String id;

    public String getId() {
        return id;
    }

    @XmlIDREF
    private Employee manager;


//    @XmlJavaTypeAdapter(EmpAdapter.class)
//    @XmlIDREF
//    private Department department;
}
