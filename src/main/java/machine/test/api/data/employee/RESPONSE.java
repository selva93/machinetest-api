package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "responseXML"
})
public class RESPONSE {

    @JsonProperty("responseXML")
    private RESPONSEXML responseXML;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("responseXML")
    public RESPONSEXML getResponseXML() {
        return responseXML;
    }

    @JsonProperty("responseXML")
    public void setResponseXML(RESPONSEXML responseXML) {
        this.responseXML = responseXML;
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