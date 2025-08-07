package com.smart.bear;

import com.smart.bear.controller.TimeController;
import com.smart.bear.service.BritishTimeFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(TimeController.class)
class TimeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BritishTimeFormatter britishTimeFormatter;

    @Test
    void testGetLocalTime_Valid() throws Exception {
        Mockito.when(britishTimeFormatter.format(Mockito.any())).thenReturn("three o'clock");
        mockMvc.perform(get("/localTime/uk").param("time", "03:00"))
                .andExpect(status().isOk())
                .andExpect(content().string("three o'clock"));
    }


    @Test
    void testGetLocalTime_InvalidTime_Direct() {
        TimeController controller = new TimeController();
        // set up controller dependencies if needed
        assertThrows(IllegalArgumentException.class, () -> {
            controller.getLocalTime("uk", "invalid");
        });
    }

    @Test
    void testGetLocalTime_MissingTimeParam() throws Exception {
        mockMvc.perform(get("/localTime/uk"))
                .andExpect(status().isBadRequest());
    }
}