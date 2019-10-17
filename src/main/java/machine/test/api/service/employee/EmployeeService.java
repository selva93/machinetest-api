package machine.test.api.service.employee;

import machine.test.api.model.employee.Employee;
import machine.test.api.repository.employee.EmployeeRepository;
import machine.test.api.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends GenericService<Employee> {
    @Autowired
    public EmployeeService(EmployeeRepository crudRepository) {
        super(crudRepository);
    }
}
