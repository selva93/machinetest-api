package machine.test.api.controller.employee;

import machine.test.api.controller.employee.EmployeeController;
import machine.test.api.model.employee.Employee;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeControllerTest {

    MockMvc mvc;

    @Autowired
    protected WebApplicationContext wac;

    @Autowired
    protected EmployeeController employeeController;
    Employee employee;

    @Before
    public void setUp() throws Exception {
        employee = new Employee();
        this.mvc = standaloneSetup(this.employeeController).build();
    }

    @Test
    public void find() {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void add() throws Exception {
//        mvc.perform( MockMvcRequestBuilders
//                .get("/v1/employee/add")
//                .accept(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.name").isNotEmpty());
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}
