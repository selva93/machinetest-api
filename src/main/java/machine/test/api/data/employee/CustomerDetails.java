package machine.test.api.data.employee;

import lombok.Data;

@Data
public class CustomerDetails {
    private String customerNumber;
    private String shortName;
    private CONTACTINFOV7_ contactinfov7;

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public CONTACTINFOV7_ getContactinfov7() {
        return contactinfov7;
    }

    public void setContactinfov7(CONTACTINFOV7_ contactinfov7) {
        this.contactinfov7 = contactinfov7;
    }
}
