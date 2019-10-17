package machine.test.api.controller.employee;

import machine.test.api.controller.GenericController;
import machine.test.api.model.employee.Employee;
import machine.test.api.service.employee.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/employee")
@Controller
public class EmployeeController extends GenericController<Employee> {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public EmployeeController(EmployeeService employeeServiceImpl) {
        super(employeeServiceImpl);
    }
}
