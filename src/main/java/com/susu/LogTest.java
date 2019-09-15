package com.susu;
     
    import org.apache.commons.logging.Log;
    import org.apache.commons.logging.LogFactory;

/**
 * create by susu on 2019-09-13 17:59
 */
public class LogTest {
     
    private static Log logger = LogFactory.getLog(LogTest.class);

    public static void main(String[] args) {
        pirintLog();
    }

    /**
     * 打印日志
     */
    private static void pirintLog() {
        logger.trace("我是trace信息");
        logger.debug("我是debug信息");
        logger.info("我是info信息");
        logger.warn("我是warn信息");
        logger.error("我是error信息");
        logger.fatal("我是fatal信息");
    }
}