package com.mdresort.microservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class MicroserviceApplicationTests {

    @Test
    void contextLoads() {
        // This test simply verifies that the Spring application context loads successfully
    }
}
