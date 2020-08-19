package cl.github.yadickson.logger.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.github.yadickson.logger.service.LoggerService;
/**
 * Logger controller definition.
 *
 * @author yadickson
 */
@RestController
@RequestMapping("/service/log")
public final class LoggerController {

    /**
     * Logger.
     */
    private static final Log LOGGER = LogFactory.getLog(LoggerController.class);

    /**
     * The logger service.
     */
    @Autowired
    private LoggerService service;

    /**
     * RESTful to send info logger.
     *
     * @return text logger
     */
    @GetMapping(value = "/message")
    @ResponseBody
    public String message() {
        LOGGER.info("controller");
        return service.process();
    }

}
