package machine.test.api.controller.employee;

import machine.test.api.controller.employee.DepartmentController;
import machine.test.api.model.employee.Department;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;
import java.util.Map;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentControllerTest {

    MockMvc mvc;

    @Autowired
    protected WebApplicationContext wac;

    @Autowired
    protected DepartmentController departmentController;

    Department department;
    Integer departmentId;

    @Before
    public void setUp() throws Exception {
        this.mvc = standaloneSetup(this.departmentController).build();
        department = new Department("IT Department");

    }

    @Order(3)
    public void find() throws Exception{
        findAll();
        mvc.perform( MockMvcRequestBuilders
                .get("/department/find/"+departmentId)
                .accept(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(departmentId))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(department.getName()));
    }

    @Test
    @Order(2)
    public void findAll() throws Exception {
        add();
        MvcResult mvcResult = mvc.perform( MockMvcRequestBuilders
                .get("/department/find")
                .accept(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.[0].id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.[0].id").isNotEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$.[0].name").value(department.getName())).andReturn();

        List<Object> objectList = new ObjectMapper().readValue(mvcResult.getResponse().getContentAsByteArray(), List.class);
        departmentId = (Integer) ((Map)objectList.get(0)).get("id");

    }

    @Test
    @Order(1)
    public void add() throws Exception {
        mvc.perform( MockMvcRequestBuilders
                .post("/department/add")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsBytes(department))
                .accept(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").isNotEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(department.getName()));
    }

    @Test
    public void update() throws Exception {
        findAll();
        department.setId(departmentId);
        department.setName(department.getName()+"-Updated");
        mvc.perform( MockMvcRequestBuilders
                .post("/department/update")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsBytes(department))
                .accept(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(departmentId))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(department.getName()));
    }

    @Test
    public void delete() throws Exception {
        find();
        mvc.perform( MockMvcRequestBuilders
                .delete("/department/delete/"+departmentId)
                .accept(MediaType.TEXT_PLAIN_VALUE)
        )
                .andDo(print())
                .andExpect(status().isOk());
    }
}
