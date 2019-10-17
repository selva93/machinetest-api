package machine.test.api.model.employee;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@JsonSerialize
@Entity
public class Employee implements Serializable {

//    private long id;
    private String name;
    @Id
    private String employeeNumber;
    private String address;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @JsonIgnore
    @OneToOne(mappedBy="employee",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private FullTimeEmployee fullTimeEmployee;


    @JsonIgnore
    @OneToOne(mappedBy="employee",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private VendorEmployee vendorEmployee;

    public Employee() {
    }

    public FullTimeEmployee getFullTimeEmployee() {
        return fullTimeEmployee;
    }

    public void setFullTimeEmployee(FullTimeEmployee fullTimeEmployee) {
        this.fullTimeEmployee = fullTimeEmployee;
    }

    public VendorEmployee getVendorEmployee() {
        return vendorEmployee;
    }

    public void setVendorEmployee(VendorEmployee vendorEmployee) {
        this.vendorEmployee = vendorEmployee;
    }

//    public Employee(String name, String employeeNumber, String address, Department department, VendorEmployee vendorEmployee) {
//        this.name = name;
//        this.employeeNumber = employeeNumber;
//        this.address = address;
//        this.department = department;
//    }

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
