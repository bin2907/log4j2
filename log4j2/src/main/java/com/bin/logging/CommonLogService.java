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

import com.bin.logging.AbstractLogService;
import org.apache.logging.log4j.LogManager;

/**
 * Author: Binh
 * Date: 24.02.2017
 * Time: 00:17
 */
public class CommonLogService extends AbstractLogService {
    public CommonLogService() {
        featureLogger = LogManager.getLogger("info");
    }
}
