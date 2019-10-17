package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "FAX"
})
public class FAXLISTITEMV7 {

    @JsonProperty("FAX")
    private List<Object> fAX = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("FAX")
    public List<Object> getFAX() {
        return fAX;
    }

    @JsonProperty("FAX")
    public void setFAX(List<Object> fAX) {
        this.fAX = fAX;
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
