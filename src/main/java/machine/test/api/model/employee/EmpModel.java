package machine.test.api.model.employee;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@JsonSerialize
@Entity
public class EmpModel implements Serializable {

    private String name;
    @Id
    private String employee_no;
    private String address;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "department_id", nullable = false)
    private DepartModel departModel;

    @JsonIgnore
    @OneToOne(mappedBy="employee",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private FullTimeEmpModel fullTimeEmpModel;


    @JsonIgnore
    @OneToOne(mappedBy="employee",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private VendorEmpModel vendorEmpModel;

    public EmpModel() {
    }

    public FullTimeEmpModel getFullTimeEmployee() {
        return fullTimeEmpModel;
    }

    public void setFullTimeEmployee(FullTimeEmpModel fullTimeEmpModel) {
        this.fullTimeEmpModel = fullTimeEmpModel;
    }

    public VendorEmpModel getVendorEmpModel() {
        return vendorEmpModel;
    }

    public void setVendorEmpModel(VendorEmpModel vendorEmpModel) {
        this.vendorEmpModel = vendorEmpModel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployee_no() {
        return employee_no;
    }

    public void setEmployee_no(String employee_no) {
        this.employee_no = employee_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DepartModel getDepartModel() {
        return departModel;
    }

    public void setDepartModel(DepartModel departModel) {
        this.departModel = departModel;
    }
}
