/*
 * Copyright 2011-2016 Nakivo Inc.
 * ALL RIGHTS RESERVED.
 *
 * PROPRIETARY/CONFIDENTIAL.
 *
 * This software is the confidential and proprietary information
 * of Company Inc.
 *
 * You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement
 * you entered into with Company Inc.
 */
package com.bin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Author: Binh
 * Date: 23.02.2017
 * Time: 21:15
 */
public class App {
    public static void main( String[] args ) {
        Logger logger = LogManager.getLogger();

        Logger logCommon = LogManager.getLogger("commons-log");
        Logger logAnalytics = LogManager.getLogger("analytics-log");

        logger.info("This is error");

        logger.debug("This is debug");

        logger.warn("This is warn");

        logger.error("This is error");

        System.out.println("System.out");
        System.err.println("System.err");
    }
}
