package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "COMM_CHANNEL",
        "PHONE_LIST_V7",
        "OFFICE_PHONE_LIST_V7",
        "FAX_LIST_V7",
        "SMS_LIST_V7",
        "EMAIL_LIST_V7"
})
public class CONTACTINFOV7_ {

    @JsonProperty("COMM_CHANNEL")
    private String cOMMCHANNEL;
    @JsonProperty("PHONE_LIST_V7")
    private PHONELISTV7 pHONELISTV7;
    @JsonProperty("OFFICE_PHONE_LIST_V7")
    private OFFICEPHONELISTV7 oFFICEPHONELISTV7;
    @JsonProperty("FAX_LIST_V7")
    private FAXLISTV7 fAXLISTV7;
    @JsonProperty("SMS_LIST_V7")
    private SMSLISTV7 sMSLISTV7;
    @JsonProperty("EMAIL_LIST_V7")
    private EMAILLISTV7 eMAILLISTV7;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("COMM_CHANNEL")
    public String getCOMMCHANNEL() {
        return cOMMCHANNEL;
    }

    @JsonProperty("COMM_CHANNEL")
    public void setCOMMCHANNEL(String cOMMCHANNEL) {
        this.cOMMCHANNEL = cOMMCHANNEL;
    }

    @JsonProperty("PHONE_LIST_V7")
    public PHONELISTV7 getPHONELISTV7() {
        return pHONELISTV7;
    }

    @JsonProperty("PHONE_LIST_V7")
    public void setPHONELISTV7(PHONELISTV7 pHONELISTV7) {
        this.pHONELISTV7 = pHONELISTV7;
    }

    @JsonProperty("OFFICE_PHONE_LIST_V7")
    public OFFICEPHONELISTV7 getOFFICEPHONELISTV7() {
        return oFFICEPHONELISTV7;
    }

    @JsonProperty("OFFICE_PHONE_LIST_V7")
    public void setOFFICEPHONELISTV7(OFFICEPHONELISTV7 oFFICEPHONELISTV7) {
        this.oFFICEPHONELISTV7 = oFFICEPHONELISTV7;
    }

    @JsonProperty("FAX_LIST_V7")
    public FAXLISTV7 getFAXLISTV7() {
        return fAXLISTV7;
    }

    @JsonProperty("FAX_LIST_V7")
    public void setFAXLISTV7(FAXLISTV7 fAXLISTV7) {
        this.fAXLISTV7 = fAXLISTV7;
    }

    @JsonProperty("SMS_LIST_V7")
    public SMSLISTV7 getSMSLISTV7() {
        return sMSLISTV7;
    }

    @JsonProperty("SMS_LIST_V7")
    public void setSMSLISTV7(SMSLISTV7 sMSLISTV7) {
        this.sMSLISTV7 = sMSLISTV7;
    }

    @JsonProperty("EMAIL_LIST_V7")
    public EMAILLISTV7 getEMAILLISTV7() {
        return eMAILLISTV7;
    }

    @JsonProperty("EMAIL_LIST_V7")
    public void setEMAILLISTV7(EMAILLISTV7 eMAILLISTV7) {
        this.eMAILLISTV7 = eMAILLISTV7;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
