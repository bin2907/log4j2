package com.bin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Author: Binh
 * Date: 23.02.2017
 * Time: 23:44
 */
public class LogInfo {
    public static void main( String[] args ) {
        Logger logErr = LogManager.getLogger("info");

        logErr.info("INFO");
    }
}
