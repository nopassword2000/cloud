package com.cloud.reset;


import com.cloud.comm.CloudMode;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloud")
public class FeignContral {


    @GetMapping("/cloud-hello/{type}")
    @RequestMapping(value = "/cloud-hello/{type}")
    public String cloudhello(@PathVariable("type") int type) {

        return "cloud-hello" + "--" + type;
    }

    @GetMapping("/cloud-hello-type")
    public String cloudhelloType(@RequestParam("type") int type) {
        return "cloudhelloType==》" + type;
    }

    @GetMapping("/cloud-mode")
    public CloudMode cloudmode() {
        CloudMode cloudMode = new CloudMode();
        cloudMode.setCmd(1);
        cloudMode.setBody("this is cloude mode");
        return cloudMode;
    }
}
