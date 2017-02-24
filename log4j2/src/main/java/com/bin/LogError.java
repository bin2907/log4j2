package com.bin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Author: Binh
 * Date: 23.02.2017
 * Time: 23:34
 */
public class LogError {
    public static void main( String[] args ) {

        Logger logErr = LogManager.getLogger("error");

        logErr.error("ERROR");
    }
}
