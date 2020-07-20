package com.phone.test.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureWebMvc
class PhoneControllerTest {

    @Autowired
    private WebApplicationContext applicationContext;

    MockMvc mockMvc;
@BeforeEach
 public void setup(){
    mockMvc = MockMvcBuilders.webAppContextSetup(applicationContext).build();

}



    @Test
    public void shouldFetchResults() throws Exception {
        String data = "{\"phoneNumber\" : \"9121233434\",\"pageSize\":100 , \"pageNumber\": 1}";
        mockMvc.perform(
                post("/phone")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(data)
        ).andExpect(status().isOk())
                .andDo(print());
    }


}