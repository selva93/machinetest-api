package machine.test.api.service.employee;

import machine.test.api.model.employee.FullTimeEmployee;
import machine.test.api.repository.employee.FullTimeEmployeeRepository;
import machine.test.api.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FullTimeEmployeeService extends GenericService<FullTimeEmployee> {
    @Autowired
    public FullTimeEmployeeService(FullTimeEmployeeRepository crudRepository) {
        super(crudRepository);
    }
}
