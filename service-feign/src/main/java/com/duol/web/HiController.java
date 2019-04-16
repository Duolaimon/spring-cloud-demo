package com.duol.web;

import com.duol.service.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author HeJiageng
 * @Date 2019-04-16
 * @Desc
 */
@RestController
public class HiController {


    private final ScheduleServiceHi scheduleServiceHi;

    public HiController(ScheduleServiceHi scheduleServiceHi) {
        this.scheduleServiceHi = scheduleServiceHi;
    }

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return scheduleServiceHi.sayHiFromClientOne(name);
    }
}
