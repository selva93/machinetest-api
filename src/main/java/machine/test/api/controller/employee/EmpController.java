package machine.test.api.controller.employee;

import machine.test.api.controller.GenericController;
import machine.test.api.model.employee.EmpModel;
import machine.test.api.service.employee.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/employee")
@Controller
public class EmpController extends GenericController<EmpModel> {


    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public EmpController(EmpService empServiceImpl) {
        super(empServiceImpl);
    }
}
