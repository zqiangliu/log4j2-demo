package org.demos.simple;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @Description
 * @Author liuzhiqiang
 * @Date 2019/9/10 16:06
 */
public class DogService {
    private static Logger logger = LogManager.getLogger(DogService.class);
    public void takeBath(){
        logger.trace("takeBath trace!");
        logger.debug("takeBath debug!");
        logger.info("takeBath info!");
        logger.warn("takeBath warn!");
        logger.error("takeBath error!");
        logger.fatal("洗澡takeBath fatal!");
    }
}
