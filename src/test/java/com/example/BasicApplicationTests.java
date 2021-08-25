package com.example;

import com.example.controller.ControladorPersona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasicApplicationTests {
    private ControladorPersona cp;
	@Test
	void contextLoads() {
            Assertions.assertNotNull(cp);
	}

}
