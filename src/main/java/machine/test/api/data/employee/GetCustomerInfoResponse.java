package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "getCustomerInfoResult"
})
public class GetCustomerInfoResponse {

    @JsonProperty("getCustomerInfoResult")
    private GetCustomerInfoResult getCustomerInfoResult;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("getCustomerInfoResult")
    public GetCustomerInfoResult getGetCustomerInfoResult() {
        return getCustomerInfoResult;
    }

    @JsonProperty("getCustomerInfoResult")
    public void setGetCustomerInfoResult(GetCustomerInfoResult getCustomerInfoResult) {
        this.getCustomerInfoResult = getCustomerInfoResult;
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
