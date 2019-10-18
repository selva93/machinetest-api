package machine.test.api.service.employee;

import machine.test.api.model.employee.DepartModel;
import machine.test.api.repository.employee.DepartRepository;
import machine.test.api.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartService extends GenericService<DepartModel> {
    @Autowired
    public DepartService(DepartRepository crudRepository) {
        super(crudRepository);
    }
}
