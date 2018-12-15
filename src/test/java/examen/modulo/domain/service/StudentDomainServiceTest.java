package examen.modulo.domain.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration({ "classpath:test-spring-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class StudentDomainServiceTest {

        @Autowired
	private StudentDomainService studentDomainService;
;

	@Before
	public void setUp() {
	}
        
        @Test
	public void prueba() throws Exception {
            
        }

}
