package First_Project;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Company {

    public Company() {
        employees = new ArrayList<>();
        departments = new ArrayList<>();
    }

    @XmlElementWrapper(name = "employeeList")
    @XmlElement(name = "employee")
    private List<Employee> employees;

    @XmlElementWrapper(name = "departmentList")
    @XmlElement(name = "department")
    private List<Department> departments;
}