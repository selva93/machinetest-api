package machine.test.api.model.employee;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class DepartModel {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private EmpModel employee;

    public EmpModel getEmployee() {
        return employee;
    }

    public void setEmployee(EmpModel employee) {
        this.employee = employee;
    }

    public DepartModel() {
    }

    public DepartModel(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
