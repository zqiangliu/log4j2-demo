package org.demos.patternMatch;

import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

/**
 * @Description
 * @Author liuzhiqiang
 * @Date 2019/9/11 15:09
 */
public class MarkerDemo {
    public static void main(String[] args) {

        Marker marker = MarkerManager.getMarker("CLAZZ");

        Child child = new Child();
        child.log(null);
        child.log(marker);

        child.logFromChild(null);
        child.logFromChild(marker);

        child.parentLog(null);
        child.parentLog(marker);

        //
        System.out.println("---set to child logger---");
        child.setLogger(child.childLogger);

        child.log(null);
        child.log(marker);

        child.logFromChild(null);
        child.logFromChild(marker);
    }
}
