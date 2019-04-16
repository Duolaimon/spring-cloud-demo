package com.duol.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author HeJiageng
 * @Date 2019-04-16
 * @Desc
 */
@FeignClient(value = "service-hi", fallback = ScheduleServiceHiHystrix.class)
public interface ScheduleServiceHi {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
