/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.github.yadickson.logger.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Logger Service test.
 *
 * @author Yadickson Soto
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerServiceTest {

    @Autowired
    private LoggerService service;

    @Test
    public void testProcess() {
        String response = service.process();
        Assert.assertNotNull(response);
        Assert.assertEquals("Logger Message", response);
    }
}
