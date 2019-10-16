package org.demos.patternMatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

/**
 * @Description
 * @Author liuzhiqiang
 * @Date 2019/9/11 15:03
 */
public class Parent {
    protected static Logger parentLogger = LogManager.getLogger();

    private Logger logger = parentLogger;

    protected Logger getLogger(){
        return logger;
    }

    protected void setLogger(Logger logger){
        this.logger = logger;
    }

    protected void log(Marker marker){
        logger.debug(marker, "parent log message");
    }
}
