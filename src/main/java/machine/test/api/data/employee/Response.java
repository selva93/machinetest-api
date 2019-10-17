package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "responseXML"
})
public class Response {

    @JsonProperty("responseXML")
    private ResponseXML responseXML;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("responseXML")
    public ResponseXML getResponseXML() {
        return responseXML;
    }

    @JsonProperty("responseXML")
    public void setResponseXML(ResponseXML responseXML) {
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