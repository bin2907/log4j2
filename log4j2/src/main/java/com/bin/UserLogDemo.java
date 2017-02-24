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

import com.bin.logging.UserLogService;

/**
 * Author: Binh
 * Date: 24.02.2017
 * Time: 00:12
 */
public class UserLogDemo {
    public static void main( String[] args ) {
        UserLogService userLogService = new UserLogService();
        userLogService.info("User: binh");

        userLogService.error("Wrong name");
    }
}
