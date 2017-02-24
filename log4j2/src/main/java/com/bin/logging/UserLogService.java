package com.bin.logging;

import org.apache.logging.log4j.LogManager;

/**
 * Author: Binh
 * Date: 23.02.2017
 * Time: 23:58
 */
public class UserLogService extends AbstractLogService {

    public UserLogService() {
        super();
        featureLogger = LogManager.getLogger("user");
    }
}
