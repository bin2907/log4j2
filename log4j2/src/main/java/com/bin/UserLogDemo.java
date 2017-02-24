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
