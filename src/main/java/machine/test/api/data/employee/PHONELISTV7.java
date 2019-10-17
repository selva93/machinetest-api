package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "PHONE_LIST_ITEM_V7"
})
public class PHONELISTV7 {

    @JsonProperty("PHONE_LIST_ITEM_V7")
    private PHONELISTITEMV7 pHONELISTITEMV7;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("PHONE_LIST_ITEM_V7")
    public PHONELISTITEMV7 getPHONELISTITEMV7() {
        return pHONELISTITEMV7;
    }

    @JsonProperty("PHONE_LIST_ITEM_V7")
    public void setPHONELISTITEMV7(PHONELISTITEMV7 pHONELISTITEMV7) {
        this.pHONELISTITEMV7 = pHONELISTITEMV7;
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
