package machine.test.api.service.cutomer;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import machine.test.api.data.employee.CustomerDetails;
import machine.test.api.data.employee.Response;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    Cache<String, CustomerDetails> customerDetailsCache = CacheBuilder.newBuilder().build();

    public CustomerDetails saveCustomerInfo(Response customerInfo) {
        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setCustomerNumber(customerInfo
                .getResponseXML()
                .getGetCustomerInfoResponse()
                .getGetCustomerInfoResult()
                .getCUSTINFO()
                .getCUSTNO());
        customerDetails.setShortName(customerInfo
                .getResponseXML()
                .getGetCustomerInfoResponse()
                .getGetCustomerInfoResult()
                .getCUSTINFO()
                .getSHORTNAME());
        customerDetails.setContactinfov7(customerInfo
                .getResponseXML()
                .getGetCustomerInfoResponse()
                .getGetCustomerInfoResult()
                .getCUSTINFO()
                .getCONTACTINFOV7().getCONTACTINFOV7());

        customerDetailsCache.put(customerDetails.getCustomerNumber(), customerDetails);
        return customerDetails;
    }

    public Optional<CustomerDetails> findCustomerDetails(String customerNumber) {
        CustomerDetails customerDetails = customerDetailsCache.getIfPresent(customerNumber);
        if (customerDetails != null) {
            return Optional.ofNullable(customerDetails);
        }
        return Optional.empty();
    }
}
