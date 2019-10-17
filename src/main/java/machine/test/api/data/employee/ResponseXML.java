package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "getCustomerInfoResponse"
})
public class ResponseXML {

    @JsonProperty("getCustomerInfoResponse")
    private GetCustomerInfoResponse getCustomerInfoResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("getCustomerInfoResponse")
    public GetCustomerInfoResponse getGetCustomerInfoResponse() {
        return getCustomerInfoResponse;
    }

    @JsonProperty("getCustomerInfoResponse")
    public void setGetCustomerInfoResponse(GetCustomerInfoResponse getCustomerInfoResponse) {
        this.getCustomerInfoResponse = getCustomerInfoResponse;
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
