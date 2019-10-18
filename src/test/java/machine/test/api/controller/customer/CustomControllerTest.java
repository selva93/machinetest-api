package machine.test.api.controller.customer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomControllerTest {

    MockMvc mvc;

    @Autowired
    protected WebApplicationContext wac;

    @Autowired
    protected CustController customController;

    private String DATA_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "\n" +
            "<response>\n" +
            "\n" +
            " <responseXML>\n" +
            "\n" +
            "   <getCustomerInfoResponse>\n" +
            "\n" +
            "     <getCustomerInfoResult>\n" +
            "\n" +
            "       <RETURN_CODE>0</RETURN_CODE>\n" +
            "\n" +
            "       <ERROR_MSG/>\n" +
            "\n" +
            "       <WARNING_MSG_LIST/>\n" +
            "\n" +
            "       <CUST_INFO>\n" +
            "\n" +
            "         <CUST_NO>23423</CUST_NO>\n" +
            "\n" +
            "         <SHORT_NAME>SHORT.NAME1673948</SHORT_NAME>\n" +
            "\n" +
            "         <IS_INDIVIDUAL>Y</IS_INDIVIDUAL>\n" +
            "\n" +
            "         <NATIONALITY>MU</NATIONALITY>\n" +
            "\n" +
            "         <NATIONALITY_NUM>480</NATIONALITY_NUM>\n" +
            "\n" +
            "         <NATIONALITY_DESC>MAURITIUS</NATIONALITY_DESC>\n" +
            "\n" +
            "         <STREET_ADDR>STREET-ADDR</STREET_ADDR>\n" +
            "\n" +
            "         <ADDRESS_LINE2/>\n" +
            "\n" +
            "         <ADDRESS_LINE3/>\n" +
            "\n" +
            "         <TOWN_COUNTRY>CUREPIPE</TOWN_COUNTRY>\n" +
            "\n" +
            "         <POST_CODE/>\n" +
            "\n" +
            "         <COUNTRY>COUNTRY</COUNTRY>\n" +
            "\n" +
            "         <COUNTRY_CODE>MU</COUNTRY_CODE>\n" +
            "\n" +
            "         <COUNTRY_CODE_NUM>480</COUNTRY_CODE_NUM>\n" +
            "\n" +
            "         <DESPATCH_CODE>MA</DESPATCH_CODE>\n" +
            "\n" +
            "         <CONTACT_INFO_V7>\n" +
            "\n" +
            "           <CONTACT_INFO_V7>\n" +
            "\n" +
            "             <COMM_CHANNEL>BY EMAIL</COMM_CHANNEL>\n" +
            "\n" +
            "             <PHONE_LIST_V7>\n" +
            "\n" +
            "               <PHONE_LIST_ITEM_V7>\n" +
            "\n" +
            "                 <PHONE>22222222</PHONE>\n" +
            "\n" +
            "               </PHONE_LIST_ITEM_V7>\n" +
            "\n" +
            "             </PHONE_LIST_V7>\n" +
            "\n" +
            "             <OFFICE_PHONE_LIST_V7>\n" +
            "\n" +
            "               <OFFICE_PHONE_LIST_ITEM_V7>\n" +
            "\n" +
            "                 <OFFICE_PHONE/>\n" +
            "\n" +
            "               </OFFICE_PHONE_LIST_ITEM_V7>\n" +
            "\n" +
            "             </OFFICE_PHONE_LIST_V7>\n" +
            "\n" +
            "             <FAX_LIST_V7>\n" +
            "\n" +
            "               <FAX_LIST_ITEM_V7>\n" +
            "\n" +
            "                 <FAX/>\n" +
            "\n" +
            "               </FAX_LIST_ITEM_V7>\n" +
            "\n" +
            "             </FAX_LIST_V7>\n" +
            "\n" +
            "             <SMS_LIST_V7>\n" +
            "\n" +
            "               <SMS_LIST_V7>\n" +
            "\n" +
            "                 <MOB_OPER_ISO>48</MOB_OPER_ISO>\n" +
            "\n" +
            "                 <MOB_OPER_CODE>ORANGEMU</MOB_OPER_CODE>\n" +
            "\n" +
            "                 <SMS_FORMATTED>+230123456789</SMS_FORMATTED>\n" +
            "\n" +
            "                 <SMS_LIST_ITEM_V7>\n" +
            "\n" +
            "                   <SMS_LIST_ITEM_V7>\n" +
            "\n" +
            "                     <SMS>+230123456789</SMS>\n" +
            "\n" +
            "                   </SMS_LIST_ITEM_V7>\n" +
            "\n" +
            "                 </SMS_LIST_ITEM_V7>\n" +
            "\n" +
            "               </SMS_LIST_V7>\n" +
            "\n" +
            "             </SMS_LIST_V7>\n" +
            "\n" +
            "             <EMAIL_LIST_V7>\n" +
            "\n" +
            "               <EMAIL_LIST_ITEM_V7>\n" +
            "\n" +
            "                 <EMAIL>THIS_IS_A_TEST@GMAIL.COM</EMAIL>\n" +
            "\n" +
            "               </EMAIL_LIST_ITEM_V7>\n" +
            "\n" +
            "             </EMAIL_LIST_V7>\n" +
            "\n" +
            "           </CONTACT_INFO_V7>\n" +
            "\n" +
            "         </CONTACT_INFO_V7>\n" +
            "\n" +
            "       </CUST_INFO>\n" +
            "\n" +
            "     </getCustomerInfoResult>\n" +
            "\n" +
            "   </getCustomerInfoResponse>\n" +
            "\n" +
            " </responseXML>\n" +
            "\n" +
            "</response>";

    private String DATA_JSON = "{\n" +
            "\n" +
            "  \"responseXML\": {\n" +
            "\n" +
            "     \"getCustomerInfoResponse\": {\n" +
            "\n" +
            "        \"getCustomerInfoResult\": {\n" +
            "\n" +
            "           \"RETURN_CODE\": \"0\",\n" +
            "\n" +
            "           \"ERROR_MSG\": [],\n" +
            "\n" +
            "           \"WARNING_MSG_LIST\": [],\n" +
            "\n" +
            "           \"CUST_INFO\": {\n" +
            "\n" +
            "              \"CUST_NO\": \"23423\",\n" +
            "\n" +
            "              \"SHORT_NAME\": \"SHORT.NAME1673948\",\n" +
            "\n" +
            "              \"IS_INDIVIDUAL\": \"Y\",\n" +
            "\n" +
            "              \"NATIONALITY\": \"MU\",\n" +
            "\n" +
            "              \"NATIONALITY_NUM\": \"480\",\n" +
            "\n" +
            "              \"NATIONALITY_DESC\": \"MAURITIUS\",\n" +
            "\n" +
            "              \"STREET_ADDR\": \"STREET-ADDR\",\n" +
            "\n" +
            "              \"ADDRESS_LINE2\": [],\n" +
            "\n" +
            "              \"ADDRESS_LINE3\": [],\n" +
            "\n" +
            "              \"TOWN_COUNTRY\": \"CUREPIPE\",\n" +
            "\n" +
            "              \"POST_CODE\": [],\n" +
            "\n" +
            "              \"COUNTRY\": \"COUNTRY\",\n" +
            "\n" +
            "              \"COUNTRY_CODE\": \"MU\",\n" +
            "\n" +
            "              \"COUNTRY_CODE_NUM\": \"480\",\n" +
            "\n" +
            "              \"DESPATCH_CODE\": \"MA\",\n" +
            "\n" +
            "              \"CONTACT_INFO_V7\": {\n" +
            "\n" +
            "                 \"CONTACT_INFO_V7\": {\n" +
            "\n" +
            "                    \"COMM_CHANNEL\": \"BY EMAIL\",\n" +
            "\n" +
            "                    \"PHONE_LIST_V7\": {\n" +
            "\n" +
            "                       \"PHONE_LIST_ITEM_V7\": {\n" +
            "\n" +
            "                          \"PHONE\": \"22222222\"\n" +
            "\n" +
            "                       }\n" +
            "\n" +
            "                    },\n" +
            "\n" +
            "                    \"OFFICE_PHONE_LIST_V7\": {\n" +
            "\n" +
            "                       \"OFFICE_PHONE_LIST_ITEM_V7\": {\n" +
            "\n" +
            "                          \"OFFICE_PHONE\": []\n" +
            "\n" +
            "                       }\n" +
            "\n" +
            "                    },\n" +
            "\n" +
            "                    \"FAX_LIST_V7\": {\n" +
            "\n" +
            "                       \"FAX_LIST_ITEM_V7\": {\n" +
            "\n" +
            "                          \"FAX\": []\n" +
            "\n" +
            "                       }\n" +
            "\n" +
            "                    },\n" +
            "\n" +
            "                    \"SMS_LIST_V7\": {\n" +
            "\n" +
            "                       \"SMS_LIST_V7\": {\n" +
            "\n" +
            "                          \"MOB_OPER_ISO\": \"48\",\n" +
            "\n" +
            "                          \"MOB_OPER_CODE\": \"ORANGEMU\",\n" +
            "\n" +
            "                          \"SMS_FORMATTED\": \"+230123456789\",\n" +
            "\n" +
            "                          \"SMS_LIST_ITEM_V7\": {\n" +
            "\n" +
            "                             \"SMS_LIST_ITEM_V7\": {\n" +
            "\n" +
            "                                \"SMS\": \"+230123456789\"\n" +
            "\n" +
            "                             }\n" +
            "\n" +
            "                          }\n" +
            "\n" +
            "                       }\n" +
            "\n" +
            "                    },\n" +
            "\n" +
            "                    \"EMAIL_LIST_V7\": {\n" +
            "\n" +
            "                       \"EMAIL_LIST_ITEM_V7\": {\n" +
            "\n" +
            "                          \"EMAIL\": \"THIS_IS_A_TEST@GMAIL.COM\"\n" +
            "\n" +
            "                       }\n" +
            "\n" +
            "                    }\n" +
            "\n" +
            "                 }\n" +
            "\n" +
            "              }\n" +
            "\n" +
            "           }\n" +
            "\n" +
            "        }\n" +
            "\n" +
            "     }\n" +
            "\n" +
            "  }\n" +
            "\n" +
            "}";

    @Before
    public void setUp() throws Exception {
        this.mvc = standaloneSetup(this.customController).build();
    }

    @Order(2)
    @Test
    public void find() throws Exception{
        add();
        mvc.perform( MockMvcRequestBuilders
                .get("/customer/find/"+"23423")
                .accept(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.customerNumber").value("23423"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.shortName").value("SHORT.NAME1673948"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.contactinfov7.PHONE_LIST_V7.PHONE_LIST_ITEM_V7.PHONE").value("22222222"));    }

    @Test
    @Order(1)
    public void add() throws Exception {
        mvc.perform( MockMvcRequestBuilders
                .post("/customer/save")
                .contentType(MediaType.APPLICATION_JSON)
                .content(DATA_JSON)
                .accept(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.customerNumber").value("23423"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.shortName").value("SHORT.NAME1673948"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.contactinfov7.PHONE_LIST_V7.PHONE_LIST_ITEM_V7.PHONE").value("22222222"));
    }

    @Test
    public void add_xml() throws Exception {
        mvc.perform( MockMvcRequestBuilders
                .post("/customer/save")
                .contentType(MediaType.APPLICATION_XML)
                .content(DATA_XML)
                .accept(MediaType.APPLICATION_XML)
        )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.xpath("CustomerDetails/customerNumber").string("23423"))
                .andExpect(MockMvcResultMatchers.xpath("CustomerDetails/shortName").string("SHORT.NAME1673948"))
                .andExpect(MockMvcResultMatchers.xpath("CustomerDetails/contactinfov7/PHONE_LIST_V7/PHONE_LIST_ITEM_V7/PHONE").string("22222222"));
    }

    @Test
    public void find_xml() throws Exception {
        mvc.perform( MockMvcRequestBuilders
                .get("/customer/find/23423")
                .accept(MediaType.APPLICATION_XML)
        )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.xpath("CustomerDetails/customerNumber").string("23423"))
                .andExpect(MockMvcResultMatchers.xpath("CustomerDetails/shortName").string("SHORT.NAME1673948"))
                .andExpect(MockMvcResultMatchers.xpath("CustomerDetails/contactinfov7/PHONE_LIST_V7/PHONE_LIST_ITEM_V7/PHONE").string("22222222"));
    }
}
