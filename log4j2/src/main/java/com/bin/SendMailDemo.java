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

import java.util.Properties;

/**
 * Author: Binh
 * Date: 24.02.2017
 * Time: 09:49
 */
public class SendMailDemo {
    public static void main( String[] args ) {

        Properties p = System.getProperties();
        p.setProperty("mail.smtp.starttls.enable", "true");

        Logger logger = LogManager.getLogger("mail");

        logger.error("DISARTER");
    }
}
