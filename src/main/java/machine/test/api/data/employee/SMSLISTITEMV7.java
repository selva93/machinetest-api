package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "SMS_LIST_ITEM_V7"
})
public class SMSLISTITEMV7 {

    @JsonProperty("SMS_LIST_ITEM_V7")
    private SMSLISTITEMV7_ sMSLISTITEMV7;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SMS_LIST_ITEM_V7")
    public SMSLISTITEMV7_ getSMSLISTITEMV7() {
        return sMSLISTITEMV7;
    }

    @JsonProperty("SMS_LIST_ITEM_V7")
    public void setSMSLISTITEMV7(SMSLISTITEMV7_ sMSLISTITEMV7) {
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
