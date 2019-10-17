package machine.test.api.controller.customer;


import machine.test.api.data.employee.CUSTOMERDETAILS;
import machine.test.api.data.employee.RESPONSE;
import machine.test.api.service.cutomer.CustomService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import java.util.Optional;

@RequestMapping("/customer")
@Controller
public class CustomController {

    @Autowired
    private CustomService customService;

    @PostMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<CUSTOMERDETAILS> add(@RequestBody RESPONSE model) {
        CUSTOMERDETAILS customerDetails = customService.saveCustomerDetails(model);
        return new ResponseEntity<>(customerDetails, HttpStatus.OK);
    }

    @ApiResponses({@ApiResponse(code = 200, response = CUSTOMERDETAILS.class, message = "ok"), @ApiResponse(code = 404, message = "Unable to find the details for the customer number")})
    @GetMapping(value = "/find/{customer_number}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Object> find(@PathVariable("customer_number") String customerNumber) {
        Optional<CUSTOMERDETAILS> customerDetails = customService.verifyCustomerDetails(customerNumber);
        if(customerDetails.isPresent()) {
            return new ResponseEntity<>(customerDetails.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new Json("{message : Unable to find the details for the customer number "+customerNumber+"}"), HttpStatus.NOT_FOUND);
        }
    }

}
