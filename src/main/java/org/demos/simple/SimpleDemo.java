package org.demos.simple;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @Description
 * @Author liuzhiqiang
 * @Date 2019/9/10 15:51
 */
public class SimpleDemo {
    private static Logger logger = LogManager.getLogger(SimpleDemo.class);

    public static void main(String[] args) {
        logger.trace("this is trace!");
        logger.debug("this is debug!");
        logger.info("this is info!");
        logger.warn("this is warn!");
        logger.error("this is error!");
        logger.fatal("this is fatal!");

        DogService dogService = new DogService();
        dogService.takeBath();
    }
}
