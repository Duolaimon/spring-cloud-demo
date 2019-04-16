package com.duol.service;

import org.springframework.stereotype.Component;

/**
 * @Author HeJiageng
 * @Date 2019-04-16
 * @Desc
 */
@Component
public class ScheduleServiceHiHystrix implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
