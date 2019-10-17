package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CONTACT_INFO_V7"
})
public class CONTACTINFOV7 {

    @JsonProperty("CONTACT_INFO_V7")
    private CONTACTINFOV7_ cONTACTINFOV7;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CONTACT_INFO_V7")
    public CONTACTINFOV7_ getCONTACTINFOV7() {
        return cONTACTINFOV7;
    }

    @JsonProperty("CONTACT_INFO_V7")
    public void setCONTACTINFOV7(CONTACTINFOV7_ cONTACTINFOV7) {
        this.cONTACTINFOV7 = cONTACTINFOV7;
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
