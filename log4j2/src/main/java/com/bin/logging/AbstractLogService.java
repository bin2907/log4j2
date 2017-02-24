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
package com.bin.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Author: Binh
 * Date: 23.02.2017
 * Time: 23:52
 */
public abstract class AbstractLogService {
    protected static Logger featureLogger = null;
    private static Logger errorLogger = null;

    public AbstractLogService() {
        featureLogger = LogManager.getLogger();
        errorLogger = LogManager.getLogger("error");
    }

    public void info(String msg) {
        featureLogger.info(msg);
    }

    public void error(String msg) {
        errorLogger.error(msg);
    }
}
