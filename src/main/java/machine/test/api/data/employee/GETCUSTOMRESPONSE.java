package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "getCustomerInfoResult"
})
public class GETCUSTOMRESPONSE {

    @JsonProperty("getCustomerInfoResult")
    private GETCUSTOMERRESULT GETCUSTOMERRESULT;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("getCustomerInfoResult")
    public GETCUSTOMERRESULT getGETCUSTOMERRESULT() {
        return GETCUSTOMERRESULT;
    }

    @JsonProperty("getCustomerInfoResult")
    public void setGETCUSTOMERRESULT(GETCUSTOMERRESULT GETCUSTOMERRESULT) {
        this.GETCUSTOMERRESULT = GETCUSTOMERRESULT;
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
