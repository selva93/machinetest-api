package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "OFFICE_PHONE_LIST_ITEM_V7"
})
public class OFFICEPHONELISTV7 {

    @JsonProperty("OFFICE_PHONE_LIST_ITEM_V7")
    private OFFICEPHONELISTITEMV7 oFFICEPHONELISTITEMV7;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("OFFICE_PHONE_LIST_ITEM_V7")
    public OFFICEPHONELISTITEMV7 getOFFICEPHONELISTITEMV7() {
        return oFFICEPHONELISTITEMV7;
    }

    @JsonProperty("OFFICE_PHONE_LIST_ITEM_V7")
    public void setOFFICEPHONELISTITEMV7(OFFICEPHONELISTITEMV7 oFFICEPHONELISTITEMV7) {
        this.oFFICEPHONELISTITEMV7 = oFFICEPHONELISTITEMV7;
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
