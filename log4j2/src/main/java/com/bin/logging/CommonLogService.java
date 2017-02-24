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
