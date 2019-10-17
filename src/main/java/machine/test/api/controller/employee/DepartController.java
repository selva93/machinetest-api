package machine.test.api.controller.employee;

import machine.test.api.controller.GenericController;
import machine.test.api.model.employee.DepartModel;
import machine.test.api.service.employee.DepartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/department")
@Controller
public class DepartController extends GenericController<DepartModel> {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public DepartController(DepartService departService) {
        super(departService);
    }
}
