package com.hari.sb.jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
class JenkinsCicdDemoApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGreetEndpoint() throws Exception {
        String s = "Haritha";
        mockMvc.perform(MockMvcRequestBuilders.get("/greet/{name}", s))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello " + s + "!You have successfully completed Jenkins CI/Cd"));
    }

}
