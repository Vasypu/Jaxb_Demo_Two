package First_Project;

import First_Project.Department;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DepartmentList {

    @XmlElementWrapper(name = "departmentList")
    @XmlElement(name = "department")
    private List<Department> departments;
}
