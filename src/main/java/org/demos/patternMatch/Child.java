package org.demos.patternMatch;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

/**
 * @Description
 * @Author liuzhiqiang
 * @Date 2019/9/11 15:06
 */
public class Child extends Parent {
    public Logger childLogger = LogManager.getLogger();

    public void childLog(Marker marker){
        childLogger.debug(marker, "child log message");
    }

    public void logFromChild(Marker marker){
        getLogger().debug(marker, "log message from child");
    }

    public void parentLog(Marker marker){
        parentLogger.debug(marker, "parent log message, from child");
    }
}
