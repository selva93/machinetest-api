package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "RETURN_CODE",
        "ERROR_MSG",
        "WARNING_MSG_LIST",
        "CUST_INFO"
})
public class GETCUSTOMERRESULT {

    @JsonProperty("RETURN_CODE")
    private String rETURNCODE;
    @JsonProperty("ERROR_MSG")
    private List<Object> eRRORMSG = null;
    @JsonProperty("WARNING_MSG_LIST")
    private List<Object> wARNINGMSGLIST = null;
    @JsonProperty("CUST_INFO")
    private CUSTINFO cUSTINFO;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("RETURN_CODE")
    public String getRETURNCODE() {
        return rETURNCODE;
    }

    @JsonProperty("RETURN_CODE")
    public void setRETURNCODE(String rETURNCODE) {
        this.rETURNCODE = rETURNCODE;
    }

    @JsonProperty("ERROR_MSG")
    public List<Object> getERRORMSG() {
        return eRRORMSG;
    }

    @JsonProperty("ERROR_MSG")
    public void setERRORMSG(List<Object> eRRORMSG) {
        this.eRRORMSG = eRRORMSG;
    }

    @JsonProperty("WARNING_MSG_LIST")
    public List<Object> getWARNINGMSGLIST() {
        return wARNINGMSGLIST;
    }

    @JsonProperty("WARNING_MSG_LIST")
    public void setWARNINGMSGLIST(List<Object> wARNINGMSGLIST) {
        this.wARNINGMSGLIST = wARNINGMSGLIST;
    }

    @JsonProperty("CUST_INFO")
    public CUSTINFO getCUSTINFO() {
        return cUSTINFO;
    }

    @JsonProperty("CUST_INFO")
    public void setCUSTINFO(CUSTINFO cUSTINFO) {
        this.cUSTINFO = cUSTINFO;
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
