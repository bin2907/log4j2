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
