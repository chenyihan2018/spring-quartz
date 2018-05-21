package com.quartz;/**
 * Created by chenjia on 2018/5/21.
 */

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chenjia
 * @create 2018-05-21 15:54
 * @desc
 **/
public class HelloTest2 implements Job{


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("执行定时任务2: 5秒钟执行一次");
    }
}
