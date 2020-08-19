/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.github.yadickson.logger.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

/**
 * Configuration service implement.
 *
 * @author Yadickson Soto
 */
@Service
public final class LoggerServiceImpl implements LoggerService {

    /**
     * Logger.
     */
    private static final Log LOGGER = LogFactory.getLog(LoggerServiceImpl.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public String process() {
        LOGGER.info("service");
        return "Logger Message";
    }
}
