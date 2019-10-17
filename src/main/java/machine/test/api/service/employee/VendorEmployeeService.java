package machine.test.api.service.employee;

import machine.test.api.model.employee.VendorEmployee;
import machine.test.api.repository.employee.VendorEmployeeRepository;
import machine.test.api.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorEmployeeService extends GenericService<VendorEmployee> {
    @Autowired
    public VendorEmployeeService(VendorEmployeeRepository crudRepository) {
        super(crudRepository);
    }
}
