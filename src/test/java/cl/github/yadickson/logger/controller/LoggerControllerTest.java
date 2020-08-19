/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.github.yadickson.logger.controller;

import cl.github.yadickson.logger.Application;

import cl.github.yadickson.logger.service.LoggerService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Configuration Service test.
 *
 * @author Yadickson Soto
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class, LoggerController.class})
@AutoConfigureMockMvc
public class LoggerControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private LoggerController controller;

    @MockBean
    private LoggerService service;

    @Test
    public void testLoggerMessage() {
        Mockito.when(service.process()).thenReturn("Logger OK");
        Assert.assertEquals("Logger OK", controller.message());
        Mockito.verify(service, Mockito.times(1)).process();
    }

    @Test
    public void testRestLoggerMessage() throws Exception {

        Mockito.when(service.process()).thenReturn("Logger Super OK");

        mvc.perform(MockMvcRequestBuilders.get("/service/log/message")
                .contentType(MediaType.TEXT_PLAIN))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Logger Super OK"));

        Mockito.verify(service, Mockito.times(1)).process();
    }

}
