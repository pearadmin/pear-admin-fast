package com.pearadmin.modules.schedule.task;

import com.pearadmin.modules.schedule.handler.base.BaseTaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Describe: 示例任务
 * Author: 就免仪式
 * CreateTime: 2019/10/23
 * */
@Slf4j
@Component("commonTask")
public class CommonTask implements BaseTaskService {

    @Override
    public void run(String params) {
        log.info("Params === >> " + params);
        log.info("当前时间::::" + new Date());
    }
}
