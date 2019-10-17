package machine.test.api.controller.employee;

import machine.test.api.controller.GenericController;
import machine.test.api.model.employee.Department;
import machine.test.api.service.employee.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/department")
@Controller
public class DepartmentController extends GenericController<Department> {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        super(departmentService);
    }
}
