package machine.test.api.service.employee;

import machine.test.api.model.employee.EmpModel;
import machine.test.api.repository.employee.EmpRepository;
import machine.test.api.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService extends GenericService<EmpModel> {
    @Autowired
    public EmpService(EmpRepository crudRepository) {
        super(crudRepository);
    }
}
