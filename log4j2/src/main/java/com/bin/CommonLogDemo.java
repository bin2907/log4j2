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

import com.bin.logging.CommonLogService;

/**
 * Author: Binh
 * Date: 24.02.2017
 * Time: 00:19
 */
public class CommonLogDemo {
    public static void main( String[] args ) {
        CommonLogService commonLogService = new CommonLogService();
        commonLogService.info("Common info");
        commonLogService.error("Common error");
    }
}
