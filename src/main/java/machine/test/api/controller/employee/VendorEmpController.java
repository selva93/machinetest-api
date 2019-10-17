package machine.test.api.controller.employee;

import machine.test.api.controller.GenericController;
import machine.test.api.model.employee.VendorEmpModel;
import machine.test.api.service.employee.VendorEmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vendoremployee")
@Controller
public class VendorEmpController extends GenericController<VendorEmpModel> {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public VendorEmpController(VendorEmpService vendorEmpService) {
        super(vendorEmpService);
    }
}
