package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "MOB_OPER_ISO",
        "MOB_OPER_CODE",
        "SMS_FORMATTED",
        "SMS_LIST_ITEM_V7"
})
public class SMSLISTV7_ {

    @JsonProperty("MOB_OPER_ISO")
    private String mOBOPERISO;
    @JsonProperty("MOB_OPER_CODE")
    private String mOBOPERCODE;
    @JsonProperty("SMS_FORMATTED")
    private String sMSFORMATTED;
    @JsonProperty("SMS_LIST_ITEM_V7")
    private SMSLISTITEMV7 sMSLISTITEMV7;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MOB_OPER_ISO")
    public String getMOBOPERISO() {
        return mOBOPERISO;
    }

    @JsonProperty("MOB_OPER_ISO")
    public void setMOBOPERISO(String mOBOPERISO) {
        this.mOBOPERISO = mOBOPERISO;
    }

    @JsonProperty("MOB_OPER_CODE")
    public String getMOBOPERCODE() {
        return mOBOPERCODE;
    }

    @JsonProperty("MOB_OPER_CODE")
    public void setMOBOPERCODE(String mOBOPERCODE) {
        this.mOBOPERCODE = mOBOPERCODE;
    }

    @JsonProperty("SMS_FORMATTED")
    public String getSMSFORMATTED() {
        return sMSFORMATTED;
    }

    @JsonProperty("SMS_FORMATTED")
    public void setSMSFORMATTED(String sMSFORMATTED) {
        this.sMSFORMATTED = sMSFORMATTED;
    }

    @JsonProperty("SMS_LIST_ITEM_V7")
    public SMSLISTITEMV7 getSMSLISTITEMV7() {
        return sMSLISTITEMV7;
    }

    @JsonProperty("SMS_LIST_ITEM_V7")
    public void setSMSLISTITEMV7(SMSLISTITEMV7 sMSLISTITEMV7) {
        this.sMSLISTITEMV7 = sMSLISTITEMV7;
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
