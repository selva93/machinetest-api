package machine.test.api.service.employee;

import machine.test.api.model.employee.Department;
import machine.test.api.repository.employee.DepartmentRepository;
import machine.test.api.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService extends GenericService<Department> {
    @Autowired
    public DepartmentService(DepartmentRepository crudRepository) {
        super(crudRepository);
    }
}
