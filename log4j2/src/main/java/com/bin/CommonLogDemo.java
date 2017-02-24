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
