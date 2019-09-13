package com.cloud.service;

import com.cloud.comm.CloudMode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("cloud-server-feigin-a")
public interface CloudFeginClient {

    @GetMapping("/cloud/cloud-mode/ab")
    CloudMode cloudmode();
}
