package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "SMS_LIST_V7"
})
public class SMSLISTV7 {

    @JsonProperty("SMS_LIST_V7")
    private SMSLISTV7_ sMSLISTV7;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SMS_LIST_V7")
    public SMSLISTV7_ getSMSLISTV7() {
        return sMSLISTV7;
    }

    @JsonProperty("SMS_LIST_V7")
    public void setSMSLISTV7(SMSLISTV7_ sMSLISTV7) {
        this.sMSLISTV7 = sMSLISTV7;
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
