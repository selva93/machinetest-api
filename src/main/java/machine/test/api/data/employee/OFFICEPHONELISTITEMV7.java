package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "OFFICE_PHONE"
})
public class OFFICEPHONELISTITEMV7 {

    @JsonProperty("OFFICE_PHONE")
    private List<Object> oFFICEPHONE = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("OFFICE_PHONE")
    public List<Object> getOFFICEPHONE() {
        return oFFICEPHONE;
    }

    @JsonProperty("OFFICE_PHONE")
    public void setOFFICEPHONE(List<Object> oFFICEPHONE) {
        this.oFFICEPHONE = oFFICEPHONE;
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
