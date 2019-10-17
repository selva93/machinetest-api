package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "PHONE"
})
public class PHONELISTITEMV7 {

    @JsonProperty("PHONE")
    private String pHONE;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("PHONE")
    public String getPHONE() {
        return pHONE;
    }

    @JsonProperty("PHONE")
    public void setPHONE(String pHONE) {
        this.pHONE = pHONE;
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
