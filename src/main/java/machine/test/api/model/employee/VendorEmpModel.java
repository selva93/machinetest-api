package machine.test.api.model.employee;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@JsonSerialize
@Entity
@Data
public class VendorEmpModel implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="employee_id")
    private EmpModel employee;
    private String vendor_name;
    private Long vendor_period;

}
