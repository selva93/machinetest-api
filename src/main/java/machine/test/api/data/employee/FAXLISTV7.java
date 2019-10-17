package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "FAX_LIST_ITEM_V7"
})
public class FAXLISTV7 {

    @JsonProperty("FAX_LIST_ITEM_V7")
    private FAXLISTITEMV7 fAXLISTITEMV7;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("FAX_LIST_ITEM_V7")
    public FAXLISTITEMV7 getFAXLISTITEMV7() {
        return fAXLISTITEMV7;
    }

    @JsonProperty("FAX_LIST_ITEM_V7")
    public void setFAXLISTITEMV7(FAXLISTITEMV7 fAXLISTITEMV7) {
        this.fAXLISTITEMV7 = fAXLISTITEMV7;
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
