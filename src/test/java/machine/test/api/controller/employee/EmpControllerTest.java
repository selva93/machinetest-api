package machine.test.api.controller.employee;

import machine.test.api.model.employee.EmpModel;
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
public class EmpControllerTest {

    MockMvc mvc;

    @Autowired
    protected WebApplicationContext wac;

    @Autowired
    protected EmpController empController;
    EmpModel empModel;

    @Before
    public void setUp() throws Exception {
        empModel = new EmpModel();
        this.mvc = standaloneSetup(this.empController).build();
    }

    @Test
    public void find() {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void add() throws Exception {

    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}
