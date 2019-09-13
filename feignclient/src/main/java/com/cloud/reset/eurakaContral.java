package com.cloud.reset;

import com.cloud.comm.CloudMode;
import com.cloud.service.CloudFeginClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud")
public class eurakaContral {


    @Autowired
    CloudFeginClient cloudFeginClient;

    @GetMapping("euraka-call")
    public CloudMode eurakacall(){

        return cloudFeginClient.cloudmode();
    }
}
