package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "getCustomerInfoResponse"
})
public class RESPONSEXML {

    @JsonProperty("getCustomerInfoResponse")
    private GETCUSTOMRESPONSE getCustomerInfoResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("getCustomerInfoResponse")
    public GETCUSTOMRESPONSE getGetCustomerInfoResponse() {
        return getCustomerInfoResponse;
    }

    @JsonProperty("getCustomerInfoResponse")
    public void setGetCustomerInfoResponse(GETCUSTOMRESPONSE getCustomerInfoResponse) {
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
