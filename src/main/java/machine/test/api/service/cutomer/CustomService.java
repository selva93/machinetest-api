package machine.test.api.service.cutomer;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import machine.test.api.data.employee.CUSTOMERDETAILS;
import machine.test.api.data.employee.RESPONSE;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomService {

    Cache<String, CUSTOMERDETAILS> customerDetailsCache = CacheBuilder.newBuilder().build();

    public CUSTOMERDETAILS saveCustomerDetails(RESPONSE customerInfo) {
        CUSTOMERDETAILS customerDetails = new CUSTOMERDETAILS();
        customerDetails.setCustomerNumber(customerInfo.getResponseXML().getGetCustomerInfoResponse().getGETCUSTOMERRESULT().getCUSTINFO().getCUSTNO());
        customerDetails.setShortName(customerInfo.getResponseXML().getGetCustomerInfoResponse().getGETCUSTOMERRESULT().getCUSTINFO().getSHORTNAME());
        customerDetails.setContactinfov7(customerInfo.getResponseXML().getGetCustomerInfoResponse().getGETCUSTOMERRESULT().getCUSTINFO().getCONTACTINFOV7().getCONTACTINFOV7());
        customerDetailsCache.put(customerDetails.getCustomerNumber(), customerDetails);
        return customerDetails;
    }

    public Optional<CUSTOMERDETAILS> verifyCustomerDetails(String customerNumber) {
        CUSTOMERDETAILS customerDetails = customerDetailsCache.getIfPresent(customerNumber);
        if (customerDetails != null) {
            return Optional.ofNullable(customerDetails);
        }
        return Optional.empty();
    }
}
