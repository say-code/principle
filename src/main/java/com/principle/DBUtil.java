package com.principle;


import org.junit.Test;

import java.util.logging.Logger;

/**
 * @author saycode
 * @date 2022/09/15
 */
public class DBUtil {
    private Logger loggerDBUtil = Logger.getLogger("DBUtil");


    @Test
    public void getConnection(){
        loggerDBUtil.info("数据库已连接");
    }
}
