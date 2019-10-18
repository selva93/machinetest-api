package machine.test.api.service.employee;

import machine.test.api.model.employee.FullTimeEmpModel;
import machine.test.api.repository.employee.FullTimeEmpRepository;
import machine.test.api.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FullTimeEmpService extends GenericService<FullTimeEmpModel> {
    @Autowired
    public FullTimeEmpService(FullTimeEmpRepository crudRepository) {
        super(crudRepository);
    }
}
