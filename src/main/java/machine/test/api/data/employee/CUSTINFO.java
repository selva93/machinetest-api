package machine.test.api.data.employee;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CUST_NO",
        "SHORT_NAME",
        "IS_INDIVIDUAL",
        "NATIONALITY",
        "NATIONALITY_NUM",
        "NATIONALITY_DESC",
        "STREET_ADDR",
        "ADDRESS_LINE2",
        "ADDRESS_LINE3",
        "TOWN_COUNTRY",
        "POST_CODE",
        "COUNTRY",
        "COUNTRY_CODE",
        "COUNTRY_CODE_NUM",
        "DESPATCH_CODE",
        "CONTACT_INFO_V7"
})
public class CUSTINFO {

    @JsonProperty("CUST_NO")
    private String cUSTNO;
    @JsonProperty("SHORT_NAME")
    private String sHORTNAME;
    @JsonProperty("IS_INDIVIDUAL")
    private String iSINDIVIDUAL;
    @JsonProperty("NATIONALITY")
    private String nATIONALITY;
    @JsonProperty("NATIONALITY_NUM")
    private String nATIONALITYNUM;
    @JsonProperty("NATIONALITY_DESC")
    private String nATIONALITYDESC;
    @JsonProperty("STREET_ADDR")
    private String sTREETADDR;
    @JsonProperty("ADDRESS_LINE2")
    private List<Object> aDDRESSLINE2 = null;
    @JsonProperty("ADDRESS_LINE3")
    private List<Object> aDDRESSLINE3 = null;
    @JsonProperty("TOWN_COUNTRY")
    private String tOWNCOUNTRY;
    @JsonProperty("POST_CODE")
    private List<Object> pOSTCODE = null;
    @JsonProperty("COUNTRY")
    private String cOUNTRY;
    @JsonProperty("COUNTRY_CODE")
    private String cOUNTRYCODE;
    @JsonProperty("COUNTRY_CODE_NUM")
    private String cOUNTRYCODENUM;
    @JsonProperty("DESPATCH_CODE")
    private String dESPATCHCODE;
    @JsonProperty("CONTACT_INFO_V7")
    private CONTACTINFOV7 cONTACTINFOV7;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CUST_NO")
    public String getCUSTNO() {
        return cUSTNO;
    }

    @JsonProperty("CUST_NO")
    public void setCUSTNO(String cUSTNO) {
        this.cUSTNO = cUSTNO;
    }

    @JsonProperty("SHORT_NAME")
    public String getSHORTNAME() {
        return sHORTNAME;
    }

    @JsonProperty("SHORT_NAME")
    public void setSHORTNAME(String sHORTNAME) {
        this.sHORTNAME = sHORTNAME;
    }

    @JsonProperty("IS_INDIVIDUAL")
    public String getISINDIVIDUAL() {
        return iSINDIVIDUAL;
    }

    @JsonProperty("IS_INDIVIDUAL")
    public void setISINDIVIDUAL(String iSINDIVIDUAL) {
        this.iSINDIVIDUAL = iSINDIVIDUAL;
    }

    @JsonProperty("NATIONALITY")
    public String getNATIONALITY() {
        return nATIONALITY;
    }

    @JsonProperty("NATIONALITY")
    public void setNATIONALITY(String nATIONALITY) {
        this.nATIONALITY = nATIONALITY;
    }

    @JsonProperty("NATIONALITY_NUM")
    public String getNATIONALITYNUM() {
        return nATIONALITYNUM;
    }

    @JsonProperty("NATIONALITY_NUM")
    public void setNATIONALITYNUM(String nATIONALITYNUM) {
        this.nATIONALITYNUM = nATIONALITYNUM;
    }

    @JsonProperty("NATIONALITY_DESC")
    public String getNATIONALITYDESC() {
        return nATIONALITYDESC;
    }

    @JsonProperty("NATIONALITY_DESC")
    public void setNATIONALITYDESC(String nATIONALITYDESC) {
        this.nATIONALITYDESC = nATIONALITYDESC;
    }

    @JsonProperty("STREET_ADDR")
    public String getSTREETADDR() {
        return sTREETADDR;
    }

    @JsonProperty("STREET_ADDR")
    public void setSTREETADDR(String sTREETADDR) {
        this.sTREETADDR = sTREETADDR;
    }

    @JsonProperty("ADDRESS_LINE2")
    public List<Object> getADDRESSLINE2() {
        return aDDRESSLINE2;
    }

    @JsonProperty("ADDRESS_LINE2")
    public void setADDRESSLINE2(List<Object> aDDRESSLINE2) {
        this.aDDRESSLINE2 = aDDRESSLINE2;
    }

    @JsonProperty("ADDRESS_LINE3")
    public List<Object> getADDRESSLINE3() {
        return aDDRESSLINE3;
    }

    @JsonProperty("ADDRESS_LINE3")
    public void setADDRESSLINE3(List<Object> aDDRESSLINE3) {
        this.aDDRESSLINE3 = aDDRESSLINE3;
    }

    @JsonProperty("TOWN_COUNTRY")
    public String getTOWNCOUNTRY() {
        return tOWNCOUNTRY;
    }

    @JsonProperty("TOWN_COUNTRY")
    public void setTOWNCOUNTRY(String tOWNCOUNTRY) {
        this.tOWNCOUNTRY = tOWNCOUNTRY;
    }

    @JsonProperty("POST_CODE")
    public List<Object> getPOSTCODE() {
        return pOSTCODE;
    }

    @JsonProperty("POST_CODE")
    public void setPOSTCODE(List<Object> pOSTCODE) {
        this.pOSTCODE = pOSTCODE;
    }

    @JsonProperty("COUNTRY")
    public String getCOUNTRY() {
        return cOUNTRY;
    }

    @JsonProperty("COUNTRY")
    public void setCOUNTRY(String cOUNTRY) {
        this.cOUNTRY = cOUNTRY;
    }

    @JsonProperty("COUNTRY_CODE")
    public String getCOUNTRYCODE() {
        return cOUNTRYCODE;
    }

    @JsonProperty("COUNTRY_CODE")
    public void setCOUNTRYCODE(String cOUNTRYCODE) {
        this.cOUNTRYCODE = cOUNTRYCODE;
    }

    @JsonProperty("COUNTRY_CODE_NUM")
    public String getCOUNTRYCODENUM() {
        return cOUNTRYCODENUM;
    }

    @JsonProperty("COUNTRY_CODE_NUM")
    public void setCOUNTRYCODENUM(String cOUNTRYCODENUM) {
        this.cOUNTRYCODENUM = cOUNTRYCODENUM;
    }

    @JsonProperty("DESPATCH_CODE")
    public String getDESPATCHCODE() {
        return dESPATCHCODE;
    }

    @JsonProperty("DESPATCH_CODE")
    public void setDESPATCHCODE(String dESPATCHCODE) {
        this.dESPATCHCODE = dESPATCHCODE;
    }

    @JsonProperty("CONTACT_INFO_V7")
    public CONTACTINFOV7 getCONTACTINFOV7() {
        return cONTACTINFOV7;
    }

    @JsonProperty("CONTACT_INFO_V7")
    public void setCONTACTINFOV7(CONTACTINFOV7 cONTACTINFOV7) {
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
