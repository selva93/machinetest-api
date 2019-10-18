package machine.test.api.service.employee;

import machine.test.api.model.employee.VendorEmpModel;
import machine.test.api.repository.employee.VendorEmpRepository;
import machine.test.api.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorEmpService extends GenericService<VendorEmpModel> {
    @Autowired
    public VendorEmpService(VendorEmpRepository crudRepository) {
        super(crudRepository);
    }
}
