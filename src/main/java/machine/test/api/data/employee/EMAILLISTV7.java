package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "EMAIL_LIST_ITEM_V7"
})
public class EMAILLISTV7 {

    @JsonProperty("EMAIL_LIST_ITEM_V7")
    private EMAILLISTITEMV7 eMAILLISTITEMV7;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EMAIL_LIST_ITEM_V7")
    public EMAILLISTITEMV7 getEMAILLISTITEMV7() {
        return eMAILLISTITEMV7;
    }

    @JsonProperty("EMAIL_LIST_ITEM_V7")
    public void setEMAILLISTITEMV7(EMAILLISTITEMV7 eMAILLISTITEMV7) {
        this.eMAILLISTITEMV7 = eMAILLISTITEMV7;
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
