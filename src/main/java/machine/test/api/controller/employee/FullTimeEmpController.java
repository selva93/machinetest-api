package machine.test.api.controller.employee;

import machine.test.api.controller.GenericController;
import machine.test.api.model.employee.FullTimeEmpModel;
import machine.test.api.service.employee.FullTimeEmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/fulltimeemployee")
@Controller
public class FullTimeEmpController extends GenericController<FullTimeEmpModel> {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public FullTimeEmpController(FullTimeEmpService fullEmployeeService) {
        super(fullEmployeeService);
    }
}
