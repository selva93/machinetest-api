package machine.test.api.model.employee;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@JsonSerialize
@Entity
@Data
public class FullTimeEmployee implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="employee_id")
    private Employee employee;

    private String dateOfJoining;
    private Long insuranceNumber;
}
